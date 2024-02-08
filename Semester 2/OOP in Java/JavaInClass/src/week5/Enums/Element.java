package Enums;

public enum Element {
    HYDROGEN(1, "H", 1.0080), LITHIUM(3, "Li", 7), SODIUM(11, "Na", 22.989), POTASSIUM(19, "K", 39.09);

    private int numElectrons;
    private String symbol;
    private double weight;

    private Element(int numElectrons, String symbol, double weight) {
        this.numElectrons = numElectrons;
        this.symbol = symbol;
        this.weight = weight;
    }

    public String getSymbol()
    {
        return symbol;
    }
    public double getWeight()
    {
        return weight;
    }
    public int getNumElec()
    {
        return numElectrons;
    }

}
