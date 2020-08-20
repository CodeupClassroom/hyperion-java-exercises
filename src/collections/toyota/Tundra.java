package collections.toyota;

public class Tundra extends Car{
    private String model = "Tundra SR";
    private final String carType = "Pickup Truck";
    private final boolean isHybrid = false;
    private final boolean isManual = false;
    private int mpgCity = 15;
    private int mpgHwy = 19;
    private int priceBase = 31420;
    private boolean isLongBed = false;
    private boolean isCrewMaxCab = false;
    private boolean isShortBed = false;

    public Tundra() { }

    public void makeSR() {
        this.model = "Tundra SR";
        this.mpgCity = 15;
        this.mpgHwy = 19;
        this.priceBase = 31420;
    }

    public void makeSR5() {
        this.model = "Tundra SR5";
        this.mpgCity = 15;
        this.mpgHwy = 19;
        this.priceBase = 33220;
    }

    public void makeLimited() {
        this.model = "Tundra Limited";
        this.mpgCity = 13;
        this.mpgHwy = 18;
        this.priceBase = 40685;
    }

    public void makePlatinum() {
        this.model = "Tundra Platinum";
        this.mpgCity = 13;
        this.mpgHwy = 18;
        this.priceBase = 47380;
        this.isLongBed = false;
        this.isCrewMaxCab = true;
    }

    public void make1794() {
        this.model = "Tundra 1794 Edition";
        this.mpgCity = 13;
        this.mpgHwy = 18;
        this.priceBase = 47380;
        this.isLongBed = false;
        this.isCrewMaxCab = true;
    }

    public void makeTRD() {
        this.model = "Tundra TRD Edition";
        this.mpgCity = 15;
        this.mpgHwy = 19;
        this.priceBase = 49645;
        this.isLongBed = false;
        this.isCrewMaxCab = true;
    }

    public void changePackage() {
        if (this.model.equalsIgnoreCase("Tundra SR")) {
            if (!this.isLongBed) {
                this.isCrewMaxCab = false;
                this.isLongBed = true;
                this.isShortBed = false;
            } else {
                this.isCrewMaxCab = false;
                this.isLongBed = false;
                this.isShortBed = false;
            }
        } else if (this.model.equalsIgnoreCase("Tundra SR5")) {
            System.out.println("Would you like to have a CrewMax Cab?");
            boolean answer = sc.yesNo();
            if (answer) {
                this.isCrewMaxCab = true;
                this.isLongBed = false;
                this.isShortBed = true;
            } else {
                System.out.println("Would you like a long bed?");
                answer = sc.yesNo();
                if (answer) {
                    this.isLongBed = true;
                    this.isCrewMaxCab = false;
                    this.isShortBed = false;
                } else {
                    System.out.println("No changes made.");
                }
            }
        } else if (this.model.equalsIgnoreCase("Tundra Limited")) {
            this.isLongBed = false;
            if (this.isCrewMaxCab) {
                this.isCrewMaxCab = false;
                this.isShortBed = false;
            } else {
                this.isCrewMaxCab = true;
                this.isShortBed = true;
            }
        } else if (this.model.equalsIgnoreCase("Tundra Platinum") || this.model.equalsIgnoreCase("Tundra 1794 Edition") || this.model.equalsIgnoreCase("Tundra TRD Edition")) {
            System.out.println("This model can only have a CrewMax Cab and a short bed.");
        }
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

    public boolean isLongBed() {
        return isLongBed;
    }

    public boolean isCrewMaxCab() {
        return isCrewMaxCab;
    }

    public boolean isShortBed() {
        return isShortBed;
    }

    public void leatherSeats() {
        priceBase += 1160;
    }

    @Override
    public void move() {
        System.out.println("Grrrrr- GrRRRRR!!!!");
    }
}

