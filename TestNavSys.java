
package Assignment;

/**
 *
 * @author y2-saiid
 */
/**

/**
 * TestNavSys - console-based test for NavSys class.
 */
public class TestNavSys {
    public static void main(String[] args) {
        System.out.println("Task 1. Creating a stock with 10 units Navigation system, price 99.99, and item code NS101");
        NavSys nav = new NavSys(99.99, "NS101", 10);
        System.out.println(nav);

        System.out.println("\nTask 2. Increasing 10 more units");
        nav.increaseStock(10);
        System.out.println(nav);

        System.out.println("\nTask 3. Sold 2 units");
        nav.sellStock(2);
        System.out.println(nav);

        System.out.println("\nTask 4. Set new price 100.99 per unit");
        nav.setPrice(100.99);
        System.out.println(nav);

        System.out.println("\nTask 5. Increasing 0 more units");
        try {
            nav.increaseStock(0);
        } catch (IllegalArgumentException e) {
            System.out.println("The error was: " + e.getMessage());
        }
    }
}
