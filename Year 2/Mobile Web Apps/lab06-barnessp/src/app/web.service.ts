
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

export interface Student{
  firstName: string;
  lastName: string;
}

@Injectable({
  providedIn: 'root'
})
export class WebService {
  // http = inject(HttpClient);

  getStudents(): Observable<Student[]>{
    const URL = "students_2024.json";
    return this.http.get<Student[]>(URL);
  }
  constructor(private http: HttpClient) { }
}
