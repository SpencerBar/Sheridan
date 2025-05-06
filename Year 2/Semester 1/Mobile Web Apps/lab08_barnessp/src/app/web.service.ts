export interface Student
{
  firstName: string;
  lastName: string;
  email: string;
}
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class WebService {

  constructor(private http: HttpClient) 
  {
  }
  getStudents() : Observable<Student[]>
  {
    const URL = "https://ejd.songho.ca/syst24444/students_2024.json";
    return this.http.get<Student[]>(URL);
  }
}
