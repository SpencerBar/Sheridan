import { Component, Input } from '@angular/core';
import { Message } from '../ollama.service';

@Component({
  selector: 'app-message',
  standalone: true,
  imports: [],
  templateUrl: './message.component.html',
  styleUrl: './message.component.css'
})
export class MessageComponent {
  //properties
  @Input() message: Message = {role: "", time:"", content:""}; // from parent comp
  // default values for user
  //image file
  icon = "img/user.svg";

  //align messages to  right side
  align = "flex-end";
  //color
  bgColor="#00f";

  ngOnInit()
  {
    //human message
    if(this.message.role == "You")
    {

    }
    //ai message
    else
    {
      this.bgColor = "#FF0";
      this.align = "flex-start";
      this.icon = "img/ai.svg";
    }
  }

}
