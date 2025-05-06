import { Component} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { CountryComponent } from './country/country.component';
import { MatCardModule } from '@angular/material/card';
import { MatToolbarModule } from '@angular/material/toolbar';
import { FormsModule } from '@angular/forms';
import { City, Country, WebService } from './web.service';
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
  cities: City[]= [];
  
  
  constructor(private web: WebService,private dialog: MatDialog){
    this.web.getData().subscribe({
      next: json => {
        
        this.countries = json;
        console.log(this.countries);
      },
      error: (e) => {
        console.error('Failed to load data:', e);
      },
    });

      this.web.fetchCities().subscribe({
      next: (data) => {
        console.log(data);
        this.cities = data;
      },
      error: (e) => {
        console.error('Failed to load cities:', e);
      },
    });
  }
  
  getFlagImage(country:Country): string {
    return "https://ejd.songho.ca/flags/"+country.Code2.toLowerCase()+".jpg";
  }
 
  openDialog(country: Country) {
    const config = new MatDialogConfig();
    const filteredCities = this.cities.filter(city => city.CountryCode === country.Code);
    console.log(filteredCities);  // Make sure cities are filtered correctly
    config.data = { country, cities: filteredCities };  // Pass the filtered cities to the dialog
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
    
  