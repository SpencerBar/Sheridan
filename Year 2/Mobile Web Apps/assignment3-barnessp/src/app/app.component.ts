import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { OllamaService, Message } from './ollama.service';
import { MessageComponent } from './message/message.component';
import { InfoComponent } from './info/info.component';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { MatToolbarModule } from '@angular/material/toolbar';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, MessageComponent,MatButtonModule, MatIconModule,
    MatInputModule, MatToolbarModule, FormsModule, InfoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  messages:Message[] = [];
  prompt: string = "";
  constructor(private ollama:OllamaService)
  {

      let systemMessage: Message = {
        role: "System",  
        content: "You are Professor Samuel Oak from Pokemon and you are here to answer my questions concisely",
        time: this.getTimeString()
      };

      this.messages.push(systemMessage);
  }
  toggleTheme() {
    const body = document.body;
    console.log('Toggling dark mode...');
    body.classList.toggle('dark-mode');
  }

  getTimeString(): string {
      const now = new Date();
    

      const year = now.getFullYear();
      const month = String(now.getMonth() + 1).padStart(2, '0'); 
      const day = String(now.getDate()).padStart(2, '0');
      const hours = String(now.getHours()).padStart(2, '0');
      const minutes = String(now.getMinutes()).padStart(2, '0');
      const seconds = String(now.getSeconds()).padStart(2, '0');
    
      return year + "-" + month + "-" + day + " " + hours + ":" + minutes+ ":" + seconds;
    }
    sendMessage()
    {
      let currentTime = this.getTimeString();
        // add user prompt to the array
        let message: Message = 
        {
            role: "You",
            content: this.prompt,
            time: currentTime
        };
        this.messages.push(message);
        this.prompt = ""; // clear prev prompt

        // add a blank AI message to the array
        let aiMessage: Message =
        {
            role: "AI",
            content: "",
            time: currentTime
        };
        
        this.messages.push(aiMessage);

        // request chat API
        this.ollama.chat(this.messages).subscribe(
        {
            next: (data:any) =>
            {
                // accumulate tokens
                let text = "";
                data.forEach((e:any) =>
                {
                    text += e.message.content;
                });
                aiMessage.content = text;
                console.log(aiMessage.content);
            },
            error: e =>console.log(e)
        });
        this.messages = [...this.messages];
    }


  }