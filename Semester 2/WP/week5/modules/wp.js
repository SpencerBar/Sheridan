//manually importing each thing
export const name = "WP";
export const doIt =()=>{
    console.log("doing it from the module");
}
const obj = {a:10, b:20};
obj.c = 30;
const wp ={
    readMe:()=>{

        console.log("readMe")

    }
}

//"default" method declaration
// wp.closeBook =( () =>{

//     console.log("closeBook");

// });

//method stored to window to avoid namespace wp.closebook
window.closeBook = wp.closeBook =( () =>{

    console.log("closeBook")

    });


//class delcaration
wp.Fruit = class {

    // private property
    #description;
    #color;
    #name;

    //constructor
    constructor(description= "healthy", color = "orange", name = "orange") {

        // assigning value to THIS object description you dont NEEED to delcare outside the constructor first but you can to make it private
        this.#description = description;
        this.#color = color;
        console.log("'I am a " + this.#description +" fruit!'");
        this.cut = ()=>{//method stored in constructor
            console.log("Cutting the " + name);
        }
        
    }
    //method delcaration stores on class
    eat(){

        console.log("'AAAAAAHHH, YOU BIT ME! AM I " + this.#description.toUpperCase() + "???'");

    }
    //getter for description
    get desc(){

        return this.#description;

    }

    //setter for description
    set desc(description){

        this.#description = description;

    }
    //getter for color
    get color(){

        return this.#color;

    }
    //setter for color
    set color(color){

        this.#color = color;

    }
    //getter for name
    get name(){

        return this.#description;

    }

    //setter for name
    set name(name){

        this.#name = name;

    }
    

}

wp.Banana = class extends wp.Fruit{

    constructor(){
        super("sweet", "yellow", "Banana");
        console.log("'Hi, I am a Banana'");
    }
    peel() {
        console.log("'AAAAAHHH YOURE RIPPING MY SKIN OFF', the Banana screams")
        super.color = "white";
    }
    //overload eat definition
    eat() {
        this.peel();
        super.eat(); // tell super to run its version of eat
        
    }
    


}


export default wp;