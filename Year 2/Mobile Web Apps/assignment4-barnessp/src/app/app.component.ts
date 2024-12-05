import { Component} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { CountryComponent } from './country/country.component';
import { MatCardModule } from '@angular/material/card';
import { MatToolbarModule } from '@angular/material/toolbar';
import { FormsModule } from '@angular/forms';
import { Country, WebService } from './web.service';
import { MatDialog, MatDialogConfig, MatDialogModule } from '@angular/material/dialog'; 
import { CommonModule } from '@angular/common';
import { DialogComponent } from './dialog/dialog.component';
import { MatRadioModule } from '@angular/material/radio';  




@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,MatButtonModule, MatIconModule, MatDialogModule, MatRadioModule,
    MatInputModule, MatToolbarModule, FormsModule,MatDialogModule,MatCardModule,CommonModule,CountryComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  countries: Country[] = [];
  selectedContinent: string = 'All';
  
  
  constructor(web: WebService,private dialog: MatDialog){
    web.getData().subscribe({
      next: json => {
        console.log(json)
        this.countries = json;
        console.log(this.countries);
      },
      error: (e) => {
        console.error('Failed to load data:', e);
      },
    });
  }
  getFlagImage(country:Country): string {
    return "https://ejd.songho.ca/flags/"+country.Code2.toLowerCase()+".jpg";
  }
 
    openDialog(country: Country) {
      const config = new MatDialogConfig();
      config.data = country;
      this.dialog.open(DialogComponent, config);
    }
    filterCountriesByContinent(continent: string) {
      if (continent == 'All') {
        return this.countries;
      }
      if (continent === 'Americas') {
        return this.countries.filter(country => 
          country.Continent === 'North America' || country.Continent === 'South America'
        );
      }    
      return this.countries.filter(country => country.Continent === continent);
    }
  }
    
  