package collections.toyota;

public class EightSix extends Car {
    private String model = "86";
    private final String carType = "Sports Car";
    private final boolean isHybrid = false;
    private boolean isManual = false;
    private int mpgCity = 24;
    private int mpgHwy = 32;
    private int priceBase = 27175;

    public EightSix() { }

    public void makeManual() {
        this.isManual = true;
    }

    public void makeAutomatic() {
        if (!this.model.equalsIgnoreCase("86 TRD Edition")) {
            this.isManual = false;
        } else {
            System.out.println("86 TRD Edition must be manual!");
        }
    }

    public void makeBase() {
        this.model = "86";
        this.mpgCity = 24;
        this.mpgHwy = 32;
        this.priceBase = 27175;
    }

    public void makeGT() {
        this.model = "86 GT";
        this.mpgCity = 24;
        this.mpgHwy = 32;
        this.priceBase = 29305;
    }

    public void makeTRD() {
        this.model = "86 TRD Edition";
        this.isManual = true;
        this.mpgCity = 21;
        this.mpgHwy = 28;
        this.priceBase = 32420;
    }

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
        this.priceBase += 450;
    }

    @Override
    public void move() {
        System.out.println("Vrrrrrrmmmm!!!!");
    }
}
