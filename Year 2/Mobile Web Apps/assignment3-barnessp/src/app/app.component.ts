import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { OllamaService } from './ollama.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
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
    
  }

