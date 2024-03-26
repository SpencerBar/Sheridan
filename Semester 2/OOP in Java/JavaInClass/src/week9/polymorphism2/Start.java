package polymorphism2;

public class Start {
    public static void main(String[] args)
    {
        //Let's build our SmartPhone Class 
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.takePhoto();
        smartPhone.makeCall(555);
        smartPhone.playSong();

        ICamera c1 = smartPhone; //same object!!!
        c1.autoFocus();
        //c1.makeCall(555);  //Can't see it from here!!!

        Phone p1 = (Phone) smartPhone; //again, same object!
        p1.answerCall();
        //p1.autoFocus(); //not available!

        // Think of the 4 pillars of oop.  How does this polymorphism help with one of the other pillars?
        //hint...let's look at this

        TeslaBattery b1 = new TeslaBattery();
        b1.access80PercentBattery();
        b1.accessLast20PercentBattery();

        BasicTeslaBattery b2 = new TeslaBattery();
        b2.access80PercentBattery();
        //b2.accessLast20PercentBattery(); 

        //Aha!  When you think about it, we can use polymorphism to acheive abstraction - hiding unimportant details.
    }
}
