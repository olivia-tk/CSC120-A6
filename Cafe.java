/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe() {
        super("<Name Unknown>", "<Address Unknown>", 1);
        System.out.println("You have built a cafe: ☕");
        // initialize inventory
        this.nCoffeeOunces = 100;
        this.nSugarPackets = 50;
        this.nCreams = 20;
        this.nCups = 100;
    }

//selling coffee
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces >= size && this.nSugarPackets >= nSugarPackets && this.nCreams >= nCreams && this.nCups >= 1) {
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
            System.out.println("Coffee sold! Enjoy your drink!");
        } else{
            System.out.println("Sprry, we are out of stock for the requested coffee.");
        }
    }
//restock method
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        // Private method to restock inventory
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
        System.out.println("Inventory restocked!");
    }

    public static void main(String[] args) {
        Cafe myCafe = new Cafe();
        myCafe.sellCoffee(12, 2, 3);
        myCafe.sellCoffee(8, 1, 1);
        myCafe.sellCoffee(16, 3, 2);
        myCafe.restock(200, 100, 50, 200); // Restock inventory
        myCafe.sellCoffee(12, 2, 3); // Sell coffee again after restocking
    }
}