import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgIf } from '@angular/common';
import { MatIconModule } from '@angular/material/icon';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-info',
  standalone: true,
  imports: [CommonModule, NgIf, MatIconModule,MatToolbarModule,MatButtonModule],
  templateUrl: './info.component.html',
  styleUrl: './info.component.css'
})

export class InfoComponent {
  isOpen = false;

  open() {
      this.isOpen = true;
  }

  close() {
      this.isOpen = false;
  }
}

