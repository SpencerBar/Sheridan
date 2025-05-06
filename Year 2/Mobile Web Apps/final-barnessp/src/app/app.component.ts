import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { MatTableModule } from '@angular/material/table';
import { HttpClient } from '@angular/common/http';
import { MatTableDataSource } from '@angular/material/table';
import { MatButtonToggleModule } from '@angular/material/button-toggle';

// Spencer Barnes 
// SID: 991728219 

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,FormsModule, MatTableModule,MatButtonToggleModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  programs:any;
  dataSource = new MatTableDataSource();
  headers = ["facultyId", "faculty","programId","program"];
  orderBy = "facultyId";
  constructor(http: HttpClient){
    const URL = "https://ejd.songho.ca/syst24444/finalB.php";
    http.get(URL).subscribe({
      next: (json:any) =>{
        this.programs = json.programs;
        this.dataSource.data = json.programs;
        this.handleOrderBy();
      },
      error: err=> {
        console.log("[ERROR] " + err.message);
      }
    });
  }

  handleOrderBy() {
    console.log('Sorting by:', this.orderBy);
    if (this.orderBy == "all"){
      this.dataSource.data = this.programs.toSorted((a: any, b: any) => {
        return a.facultyId.localeCompare(b.facultyId);
    });
  }
    else if (this.orderBy =="FAAD"){
      this.dataSource.data = this.programs
      .filter((program: any) => program.facultyId === "FAAD")
      .toSorted((a: any, b: any) => a.program.localeCompare(b.program));
    }
    else if (this.orderBy =="FAHCS"){
      this.dataSource.data = this.programs
      .filter((program: any) => program.facultyId === "FAHCS")
      .toSorted((a: any, b: any) => a.program.localeCompare(b.program));
    }
    else if (this.orderBy =="PSB"){
      this.dataSource.data = this.programs
      .filter((program: any) => program.facultyId === "PSB")
      .toSorted((a: any, b: any) => a.program.localeCompare(b.program));
    }
    else if (this.orderBy =="FAST"){
      this.dataSource.data = this.programs
      .filter((program: any) => program.facultyId === "FAST")
      .toSorted((a: any, b: any) => a.program.localeCompare(b.program));
    }
    
  }
}
