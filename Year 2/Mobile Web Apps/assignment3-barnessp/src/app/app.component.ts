import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { OllamaService, Message } from './ollama.service';
import { MessageComponent } from './message/message.component';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  messages:Message[] = [];
  prompt: string = "";
  constructor(private ollama:OllamaService)
  {
    // test
    ollama.generate("Hello").subscribe(
      {
        next: (json:any)=>{

        console.log(json);
      },
    
      error: e => console.log(e)
      });
    }
    // send a new message to ai
    sendMessage()
    {
      let message: Message = {
        role: "You",
        content: this.prompt,
        time: ""
      };
      
      this.messages.push(message);
      this.prompt = ""; // clear prev prompt
    

      //add a blank ai message to the array

      let aiMessage: Message = {
        role:"CarlWheezerAI",
        content: "",
        time:""

      };
      this.messages.push(aiMessage);
      //request chat api
      this.ollama.chat(this.messages).subscribe({
        next: (data:any) => 
          {
          //accumulate tokens
            let text = "";
            data.forEach((e:any)=>
          {
            text += message.content
          });
          aiMessage.content = text;
          console.log(aiMessage);
        },
        error: e =>console.log(e)
      });

      //test 2
      this.prompt = "Hello AI?";
      this.sendMessage();
      // test 3
      this.messages.push({role:"You", time:"", content:"AAAAAAAAAAAAAAA"});
      this.messages.push({role:"AI", time:"", content:"wefqwefwef"});
    }
    
    
  

  }