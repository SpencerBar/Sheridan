import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgIf } from '@angular/common';

@Component({
  selector: 'app-info',
  standalone: true,
  imports: [CommonModule, NgIf],
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

