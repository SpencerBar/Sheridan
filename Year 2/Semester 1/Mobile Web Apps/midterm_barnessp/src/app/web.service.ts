// barnessp 991728219
export interface Video{
        "title": string,
        "location": string;
        "url": string;
        "width": number;
        "height": number;
        "duration": number;
        "video": string;
}

import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class WebService {

  constructor(private http: HttpClient) { }

  getJSON() : Observable<Video[]>{
    const URL = "https://ejd.songho.ca/syst24444/midtermB/shorts.json";
    return this.http.get<Video[]>(URL); 
  }
}
