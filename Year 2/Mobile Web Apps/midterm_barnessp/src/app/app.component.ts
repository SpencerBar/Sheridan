// barnessp 991728219
import { Component} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { VideoComponent } from './video/video.component';
import { Video, WebService } from './web.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, VideoComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
 videos : Video[] = [];
 
 constructor(web: WebService) {
  web.getJSON().subscribe({
    next: json => {
      this.videos = json;
    },
    error: e => console.log(e)
  });
 }
}