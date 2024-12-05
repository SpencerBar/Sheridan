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
  }
 

