import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { IonContent, IonHeader, IonTitle, IonToolbar } from '@ionic/angular/standalone';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-page3',
  templateUrl: './page3.page.html',
  styleUrls: ['./page3.page.scss'],
  standalone: true,
  imports: [IonContent, IonHeader, IonTitle, IonToolbar, CommonModule, FormsModule]
})
export class Page3Page implements OnInit {
result:any;
lname: string | null = null;
constructor( private route: ActivatedRoute ) { }

ngOnInit() {
this.route.queryParamMap.subscribe(data => {
data.keys.forEach((key:string) => {
console.log(`${key}: ${data.get(key)}`);
this.lname = data.get('Lname');
});
})
this.result = this.route.snapshot.queryParamMap;



}

}
