export interface Country
{
    "Code":string;
    "Name":string;
    "Continent":string;
    "Region":string;
    "SurfaceArea":number;
    "Population":number;
    "Code2":string
  }
  
  export interface City
  { 
    "CountryCode":string;
    "Name":string;
    "District":string;
    "Population":number;
  }

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WebService {
  
  constructor(private http: HttpClient) { }

  getData() : Observable<Country[]>{
    const URL = "https://ejd.songho.ca/syst24444/world.json";
    return this.http.get<{ Countries: Country[] }>(URL).pipe(
      map(response => response.Countries)
    );

  }
  fetchCities(): Observable<City[]> {
    const url = 'https://ejd.songho.ca/syst24444/city.json'; // Replace with your actual URL
    return this.http.get<{Cities: City[]}>(url).pipe(map(response => response.Cities));
  }
  }
 

