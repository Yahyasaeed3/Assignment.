
package Assignment;

/**
 *
 * @author y2-saiid
 */

/**
 * TestPolymorphism - demonstrates polymorphism and dynamic method binding
 * Creates an array of StockItem subclasses and calls itemInstance() on each.
 */
public class TestPolymorphism {

    /**
     * itemInstance - takes a StockItem parameter (polymorphism).
     */
    public static void itemInstance(StockItem s) {
        System.out.println("\n==========================================");
        System.out.println("Processing: " + s.getStockName());
        System.out.println("==========================================");

        System.out.println("Printing item stock information:");
        System.out.println(s);

        // Increase stock
        System.out.println("\n-> Increasing stock by 5 units...");
        try {
            s.increaseStock(5);
            System.out.println(s);
        } catch (IllegalArgumentException e) {
            System.out.println("The error was: " + e.getMessage());
        }

        // Sell stock
        System.out.println("\n-> Selling 2 units...");
        try {
            s.sellStock(2);
            System.out.println(s);
        } catch (IllegalArgumentException e) {
            System.out.println("The error was: " + e.getMessage());
        }

        // Change price
        System.out.println("\n-> Changing price to 110.00...");
        try {
            s.setPrice(110.00);
            System.out.println(s);
        } catch (IllegalArgumentException e) {
            System.out.println("The error was: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Array of StockItem - holds different subclass instances (polymorphism)
        StockItem[] s = new StockItem[4];
        s[0] = new NavSys(99.99, "NS101", 15);
        s[1] = new CarTyre(49.99, "CT201", 20, "Michelin", "205/55 R16");
        s[2] = new DashCam(79.99, "DC301", 8, 4, true);
        s[3] = new CarBattery(89.99, "CB401", 12, 60, "AGM");

        // Loop calls itemInstance() on each - same method, different behaviour
        for (StockItem item : s) {
            itemInstance(item);
        }
    }
}
