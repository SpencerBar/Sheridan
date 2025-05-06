package ca.sheridancollege.barnessp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public InMemoryUserDetailsManager userDetailsService(PasswordEncoder passwordEncoder) {
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(User.withUsername("frank@frank.com")
				.password(passwordEncoder.encode("1234"))
				.roles("USER").build());
		manager.createUser(User.withUsername("barnessp@sheridancollege.ca")
				.password(passwordEncoder.encode("1234"))
				.roles("USER", "ADMIN").build());
				return manager;
				}

	@Bean
	public SecurityFilterChain securityfilterChain(HttpSecurity http) throws Exception {
		return http.authorizeHttpRequests(authorize -> authorize
		.anyRequest().authenticated()
		)
		.formLogin(Customizer.withDefaults())
		.build();
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		PasswordEncoder encoder =
		PasswordEncoderFactories.createDelegatingPasswordEncoder();
		return encoder;
	}

}

