import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MatButtonModule} from '@angular/material/button';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatSnackBar } from '@angular/material/snack-bar';
import { MatDialogModule } from '@angular/material/dialog';
import { MatDialog } from '@angular/material/dialog';
import { MatDialogConfig } from '@angular/material/dialog';
import { MyDialogComponent } from './my-dialog/my-dialog.component';
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MatButtonModule, MatSnackBarModule,MatDialogModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  name="Spencer Barnes";
  response = "";

  constructor(public dialog: MatDialog,
              public snackBar: MatSnackBar)
  {
  }
  openDialog()
  {
    let config = new MatDialogConfig();
    config.width = "50vw";
    config.data = {name: this.name};
    let ref = this.dialog.open(MyDialogComponent, config);

    ref.afterClosed().subscribe((result: string) =>
    {
      if(result) {
        this.response = result;
        let msg = "You selected: " + this.response;
        this.snackBar.open(msg, "Close", {duration:5000});
      }
    });
  }
  
}
