import { Component, viewChild } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {FormsModule} from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { WebService, Student } from './web.service';
import { MatTableModule } from '@angular/material/table';
import { MatSortModule } from '@angular/material/sort';
import { MatPaginatorModule } from '@angular/material/paginator';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort, MatSortable } from '@angular/material/sort';
import { MatRow } from '@angular/material/table';
import { ViewChild } from '@angular/core';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FormsModule, MatTableModule, MatSortModule, MatPaginatorModule, MatRow],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  students: Student[] = [];
  headers = [ "firstName", "lastName"];
  filterString = "";
  dataSource = new MatTableDataSource();
  @ViewChild("sortStudents") sortStudents: MatSort | null = null;
  @ViewChild("pageStudents") pageStudents: MatPaginator | null = null;
  constructor(web:WebService)
  {
    web.getStudents().subscribe(
      {
        next: (data:any) =>{
          this.dataSource.data = data.students;
          console.log(this.dataSource.data);
        this.dataSource.sort = this.sortStudents;
        this.dataSource.paginator = this.pageStudents;
      },
        error: e=> console.log(e.message)
      });
  }
  filterStudents()
{
  this.dataSource.filter = this.filterString.trim().toLowerCase();
}
}


