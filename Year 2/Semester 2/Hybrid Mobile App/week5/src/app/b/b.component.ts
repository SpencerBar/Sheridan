import { Component, OnInit } from '@angular/core';
import { IonicModule } from '@ionic/angular';
import { DataService } from '../data.service';

@Component({
  selector: 'app-b',
  templateUrl: './b.component.html',
  styleUrls: ['./b.component.scss'],
  imports: [IonicModule]
})
export class BComponent implements OnInit {
  myMsg!: any;
  constructor(private serv: DataService) { }

  ngOnInit() {
    this.serv.asObserver.subscribe(
      {
        next: (message) => { this.myMsg = message; },
        error: (err) => { console.log(`Error is ${err}.`); },
        complete: () => { console.log('Done'); }
      })
  }

}
