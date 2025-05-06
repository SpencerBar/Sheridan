// barnessp 991728219
import { Component, Input } from '@angular/core';
import {Video } from '../web.service'

@Component({
  selector: 'app-video',
  standalone: true,
  imports: [],
  templateUrl: './video.component.html',
  styleUrl: './video.component.css'
})
export class VideoComponent {
@Input() video: Video = { title:"", location:"", url:"",width: 0,height: 0, duration: 0,video:""};
}

