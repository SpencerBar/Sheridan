import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar ,IonButton} from '@ionic/angular/standalone';
import { GetdataService } from 'src/app/getdata.service';


@Component({
  selector: 'app-page3',
  templateUrl: './page3.page.html',
  styleUrls: ['./page3.page.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule, IonButton]
})
export class Page3Page implements OnInit {

  constructor(private ldData:GetdataService) {
    


   }
   addItem() {
      this.ldData.setData('a1','This is a1');
      console.log(`Added: ${this.ldData.getData('a1')}`);
    }
    deleteItem() {
this.ldData.removeData('a1')
console.log(`Deleted: ${this.ldData.getData('a1')}`);
}
retrieveItem() {
console.log(`Retrieved: ${this.ldData.getData('a1')}`);
}

  ngOnInit() {
  }

}
