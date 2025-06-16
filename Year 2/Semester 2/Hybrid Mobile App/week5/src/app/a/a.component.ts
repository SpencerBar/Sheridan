import { Component, OnInit } from '@angular/core';
//import { IonButton,IonInput} from '@ionic/angular/standalone';
import { FormsModule } from '@angular/forms';
import { DataService } from '../data.service';
import { IonicModule } from '@ionic/angular'
@Component({
  selector: 'app-a',
  templateUrl: './a.component.html',
  styleUrls: ['./a.component.scss'],
  imports: [FormsModule,IonicModule]
})
export class AComponent  implements OnInit {

  constructor(private serv: DataService) { }
  myMsg!: any
  ngOnInit() {}
  newMessage(){
    this.serv.setMessage(this.myMsg);
  }

}
