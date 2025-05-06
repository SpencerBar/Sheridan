import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

export interface Student{
  firstName: string;
  lastName: string;
}
export interface StudentData{
  students: Student[];
}

@Injectable({
  providedIn: 'root'
})
export class WebService {

  constructor(private http:HttpClient) { }

  getStudents(): Observable<StudentData>{
    const URL = "https://ejd.songho.ca/syst24444/students/year/2024";
    return this.http.get<StudentData>(URL);
  }
}
