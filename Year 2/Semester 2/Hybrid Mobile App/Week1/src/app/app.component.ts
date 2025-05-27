import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HeaderComponent } from './header/header.component';
import { ContentComponent } from './content/content.component';
import { C1Component } from './components/c1/c1.component';
import { C2Component } from './components/c2/c2.component';


@Component({
  selector: 'app-root',
  imports: [RouterOutlet, HeaderComponent,ContentComponent,C1Component,C2Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Week1';
  homeData = {class: 'SYST35300', desc: 'Hybrid Mobile Dev'};

  myMsg = {fName: '', lName: ''};
  getMsg($event: any) {
  this.myMsg = $event;
}
}
