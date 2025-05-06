export function toFraction(decimal :number,base:number, simplify:boolean,):string{
    if(isNaN(decimal))
        return "NaN";
    
    if (decimal % 1 == 0){
      return decimal.toString();
    }
   // seperate the whole number
    let integer = Math.trunc(decimal);
    //make the integer
    let numerator = Math.round((decimal - integer) * base);
    if (numerator == base) {
      integer += 1;
      numerator = 0;
    }
    if (numerator == 0) {
      return integer.toString();
    }
    if (integer == 0){
      return numerator + "/" + base.toString();
    }
    if (simplify){
    if (numerator %2 == 0){
      if (numerator %4 == 0){
        if (numerator % 8 == 0){
          if (numerator % 16 == 0){
            if (numerator %32 ==0){
              return integer + " " + numerator/32 + "/"+ (base/32).toString()
            }
            return integer + " " + numerator/16 + "/"+ (base/16).toString()
          }
          return integer + " " + numerator/8 + "/"+ (base/8).toString()
        }
        return integer + " " + numerator/4 + "/" + (base/4).toString()
       
      }
        return integer + " " + numerator/2 + "/" + (base/2).toString()
    }
  }
  return integer + " " + numerator + "/" + base.toString();
  }