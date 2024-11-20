import { Component } from '@angular/core';
import { Inject } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatDialogModule } from '@angular/material/dialog';
import { MAT_DIALOG_DATA } from '@angular/material/dialog';
@Component({
  selector: 'app-my-dialog',
  standalone: true,
  imports: [MatButtonModule, MatDialogModule],
  templateUrl: './my-dialog.component.html',
  styleUrl: './my-dialog.component.css'
})
export class MyDialogComponent {
  name = "";
  constructor(@Inject(MAT_DIALOG_DATA) data: any){
    this.name = data.name;
  }

}
