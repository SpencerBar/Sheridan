import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FormsModule } from '@angular/forms';

//Constant FACT for inch to cm conversion
const FACT = 2.54;
@Component({
  selector: 'app-root',
  standalone: true,
  imports: [FormsModule, RouterOutlet],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})

export class AppComponent {
  //properties
  title = 'assignment01-barnessp';
  inch = "1";
  cm = 2.54;
}

function toDecimal(fractionString = "") {
  let decimal = 0; // default return value
  let token = fractionString.split(/\s+/);

  // if it is length 1 then it is either a number or a fraction, must try to split over "/" to split fractions
  if(token.length == 1){
      let parts = fractionString.split("/");

      // if now length 1, is number. no conversion needed
      if (parts.length == 1){
        decimal = parseFloat(parts[0]);
      }
      else{
        let numerator = parseFloat(parts[0]);
        let denominator = parseFloat(parts[1]);
        decimal = numerator / denominator;
      }
  // if(token.length == 2){
  //   let part1 = token[0];
  //   let part2 = token[1];
  //   let parts = fractionString.split("/");
  //   let numerator = parseFloat(parts[0]);
  //   let denominator = parseFloat(parts[1]);
  //   decimal = parseFloat(part1) + numerator / denominator;

    // }

  }
  return decimal;

}

// function convertInchToCm(){
// //1. convert fraction inch to decimal inch
//   let inch = toDecimal(this.inch);
//  //2. unit conversion inch to cm
//   let cm = inch *2.54;
// }
//  function convertCmToInch(){
//   if(this.fractionUsed){
//     this.inch = toFraction(...);
//   }
//   else
//   {
//     this.inch = inch.toString()
//   }
// }

