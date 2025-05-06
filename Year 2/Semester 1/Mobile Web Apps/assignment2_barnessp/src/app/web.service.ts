export interface Language
{
  language: string;
  percent: number;
}

import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class WebService {
  
  constructor(private http: HttpClient) { }

  getData() : Observable<Language[]>{
    const URL = "/program-languages.json";
    console.log(this.http.get<Language[]>(URL))
    return this.http.get<Language[]>(URL);
  }
}
