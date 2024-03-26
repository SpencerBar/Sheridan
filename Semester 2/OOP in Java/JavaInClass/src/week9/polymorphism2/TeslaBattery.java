package polymorphism2;

public class TeslaBattery implements BasicTeslaBattery, UpgradedTeslaBattery {

    @Override
    public void accessLast20PercentBattery()
    {
        System.out.println("Using extra 20% battery reserve");
    }

    @Override
    public void access80PercentBattery()
    {
        System.out.println("Using 80% of battery");
    }

}
