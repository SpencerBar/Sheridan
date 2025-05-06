import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { WebService, Student } from './web.service';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  students1 : any;
  students2 : Student[] = [];
  title = 'lab06-barnessp';

  constructor(http: HttpClient, webService:WebService){
    const URL = "students_2024.json";
    http.get(URL).subscribe(
      {next: json => {
        this.students1 = json;
        console.log("Success Version1");
      },
      complete: () => {
        console.log("Completed");
      },
      error: e=> {
        console.log(e.message);
      }
    });
    webService.getStudents().subscribe({
      next: json => {
        this.students2 = json;
        console.log("Success version2")
      },
      error: e => console.log(e)
    });
  }
}
