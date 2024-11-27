import { Component} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { StudentComponent } from './student/student.component';
import { Student, WebService } from './web.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, StudentComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
 students : Student[] = [];
 
 constructor(web: WebService) {
  web.getStudents().subscribe({
    next: json => {
      this.students = json;
    },
    error: e => console.log(e)
  });
 }
}
