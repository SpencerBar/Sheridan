import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';

const FACT = 0.45359237;

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, FormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = "Lab03Barnessp";
  lb = 1;
  kg = Math.round(this.lb * FACT * 100) / 100;

  convertToKg() {
    this.kg = Math.round(this.lb * FACT * 100) /100;
  }
  convertToLb() {
    this.lb = Math.round(this.kg / FACT * 100) / 100;
  }

}
