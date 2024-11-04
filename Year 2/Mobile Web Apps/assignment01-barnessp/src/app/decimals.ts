export function toDecimal(fractionString = "") {
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
        }}
     else if(token.length == 2){
        let part1 = token[0];
        let fractionParts = token[1].split("/");
        let numerator = parseFloat(fractionParts[0]);
        let denominator = parseFloat(fractionParts[1]);
        decimal = parseFloat(part1) + numerator / denominator;
      }
      // return the value as a float
      return Number(decimal.toFixed(4));
    }
  
    