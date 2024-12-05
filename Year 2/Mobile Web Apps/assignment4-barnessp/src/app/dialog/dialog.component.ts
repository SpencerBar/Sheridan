import { Component, Inject } from '@angular/core';
import { MAT_DIALOG_DATA, MatDialogModule } from '@angular/material/dialog';
import { Country } from '../web.service';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-dialog',
  standalone: true,
  imports: [MatDialogModule],
  templateUrl: './dialog.component.html',
  styleUrl: './dialog.component.css'
})
export class DialogComponent {
  country: Country;
  
  constructor(public dialogRef: MatDialogRef<DialogComponent>, @Inject(MAT_DIALOG_DATA) public data: any) {
    this.country = data;
  }
  getMapImage(country:Country): string {
    return 'https://ejd.songho.ca/maps/'+country.Code.toLowerCase()+'.gif'; 
  }
  closeDialog(): void {
    this.dialogRef.close();
  }

}
