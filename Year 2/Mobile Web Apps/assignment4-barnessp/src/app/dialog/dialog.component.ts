import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogModule } from '@angular/material/dialog';
import { City, Country } from '../web.service';
import { MatDialogRef } from '@angular/material/dialog';
import { MatTableModule } from '@angular/material/table';
import { CommonModule } from '@angular/common';


@Component({
  selector: 'app-dialog',
  standalone: true,
  imports: [MatDialogModule,MatTableModule, CommonModule],
  templateUrl: './dialog.component.html',
  styleUrl: './dialog.component.css'
})
export class DialogComponent {
  country: Country;
  cities: City[] = [];
  displayedColumns: string[] = ['Name', 'District', 'Population'];
  
  constructor(public dialogRef: MatDialogRef<DialogComponent>, @Inject(MAT_DIALOG_DATA) public data: { country: Country; cities: City[] }) {
    this.country = data.country;
    this.cities = data.cities;
  }
  
  getMapImage(country:Country): string {
    return 'https://ejd.songho.ca/maps/'+country.Code.toLowerCase()+'.gif'; 
  }
  closeDialog(): void {
    this.dialogRef.close();
  }

}
