import { Component, Input } from '@angular/core';
import { Message } from '../ollama.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-message',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './message.component.html',
  styleUrl: './message.component.css'
})
export class MessageComponent {
  
  //properties
  @Input() message: Message = {role: "", time:"", content:""}; // from parent comp
  // default values for user
  //image file
  icon = '/assets/img/user.svg';

  //align messages to  right side
  align = "flex-end";
  //color
  bgColor="#00f";
  
  ngOnInit() {
    if (this.message.role === 'You') {
      this.align = 'flex-end';
      this.bgColor = '#007bff';  
    } else {
      this.align = 'flex-start';
      this.bgColor = 'rgb(124, 128, 134)';    
      this.icon = 'assets/img/ai.webp';
    }
  }
  
}
