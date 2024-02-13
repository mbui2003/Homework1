public class CruiseShip extends Ship {
    private int maximumNumPassengers;

    public CruiseShip(String shipName, String yearShipBuilt, int maximumNumPassengers) {
        super(shipName, yearShipBuilt);
        this.maximumNumPassengers = maximumNumPassengers;
    }

    public int getMaximumNumPassengers() {
        return maximumNumPassengers;
    }

    public void setMaximumNumPassengers(int maximumNumPassengers) {
        this.maximumNumPassengers = maximumNumPassengers;
    }

    @Override
    public void print() {
        System.out.println("Ship Name: " + getShipName());
        System.out.println("Maximum Number of Passengers: " + getMaximumNumPassengers());
    }
}
