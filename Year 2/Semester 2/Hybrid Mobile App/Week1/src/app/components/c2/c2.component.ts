import { Component} from '@angular/core';
import { Output } from '@angular/core';
import { EventEmitter } from '@angular/core';

@Component({
  selector: 'app-c2',
  imports: [],
  templateUrl: './c2.component.html',
  styleUrl: './c2.component.css'
})
export class C2Component {
  @Output() childMsg = new EventEmitter();
  c2Data = {fName: 'Spencer', lName: 'Barnes'};
  sendMsg() { this.childMsg.emit(this.c2Data); }
}
