import { Component, Input } from '@angular/core';
import { Country } from '../web.service';
import { MatCardModule } from '@angular/material/card';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-country',
  standalone: true,
  imports: [MatCardModule,CommonModule],
  templateUrl: './country.component.html',
  styleUrl: './country.component.css'
})
export class CountryComponent {
    @Input() country: Country = {Code:"",Name:"",Continent:"",Region:"",SurfaceArea:0,Population:0, Code2:""};
    
    
  }
    


