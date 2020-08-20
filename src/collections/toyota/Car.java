package collections.toyota;

import util.Input;

public abstract class Car implements Vehicle{
    Input sc = new Input();
    protected String model;
    protected String carType;
    protected boolean isHybrid;
    protected boolean isManual;
    protected int mpgCity;
    protected int mpgHwy;
    protected int priceBase;

    public abstract void leatherSeats();

    public String honkHorn() {
        return "Honk HONK!";
    }

    protected Car() { }

    public abstract String getModel();

    public abstract String getCarType();

    public abstract boolean isHybrid();

    public abstract boolean isManual();

    public abstract int getMpgCity();

    public abstract int getMpgHwy();

    public abstract int getPriceBase();

    @Override
    public void move(){
        System.out.println("Gurgle sputter!!!");
    }
}
