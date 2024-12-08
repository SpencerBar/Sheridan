import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { MatTableModule } from '@angular/material/table';
import { MatRadioModule } from '@angular/material/radio';
import { HttpClient } from '@angular/common/http';
import { MatTableDataSource } from '@angular/material/table';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,FormsModule, MatTableModule,MatRadioModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  students:any;
  dataSource = new MatTableDataSource();
  headers = ["FirstName", "LastName"];
  orderBy = "FirstName";
  constructor(http: HttpClient){
    const URL = "https://ejd.songho.ca/syst24444/studentsObj_2024.json";
    http.get(URL).subscribe({
      next: (json:any) =>{
        this.students = json.Students;
        this.dataSource.data = json.Students;
        this.handleOrderBy();
      },
      error: err=> {
        console.log("[ERROR] " + err.message);
      }
    });
  }

  handleOrderBy() {
    this.dataSource.data = this.students.toSorted((a:any, b:any)=>{
      return a[this.orderBy].localeCompare(b[this.orderBy]);
    });
  }
}
