package collections.toyota;

public class LandCruiser extends Car{
    private String model = "Land Cruiser";
    private final String carType = "SUV";
    private final boolean isHybrid = false;
    private final boolean isManual = false;
    private int mpgCity = 13;
    private int mpgHwy = 18;
    private int priceBase = 84765;

    public LandCruiser() { }


    public String getModel() {
        return model;
    }

    public String getCarType() {
        return carType;
    }

    public boolean isHybrid() {
        return isHybrid;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getMpgCity() {
        return mpgCity;
    }

    public int getMpgHwy() {
        return mpgHwy;
    }

    public int getPriceBase() {
        return priceBase;
    }


    public void leatherSeats() {
        priceBase += 1160;
    }

    @Override
    public void move() {
        System.out.println("Rrrrrrr!!!!");
    }
}
