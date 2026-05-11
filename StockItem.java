
package Assignment;

/**
 *
 * @author y2-saiid
 */
/**
 * StockItem - base class representing a generic stock item.
 * Stores price (ex-VAT), stock code, and unit count.
 */
public class StockItem {

  private static final double VAT_RATE = 0.175; // 17.5%

    private double price;
    private String stockCode;
    private int units;

    /**
     * Parameterised constructor.
     * @param price     price per unit (ex-VAT)
     * @param stockCode item code
     * @param units     initial units in stock
     */
    public StockItem(double price, String stockCode, int units) {
        this.price = price;
        this.stockCode = stockCode;
        this.units = units;
    }

    // ---------- Name / Description (overridden by subclasses) ----------

    public String getStockName() {
        return "Unknown Stock Name";
    }

    public String getStockDescription() {
        return "Unknown Stock Description";
    }

    // ---------- Getters ----------

    public double getPrice() { return price; }
    public String getStockCode() { return stockCode; }
    public int getUnits() { return units; }
    public double getPriceWithVAT() { return price * (1 + VAT_RATE); }

    // ---------- Setters / Operations ----------

    /**
     * Sets a new price per unit.
     * @param price new price (must be > 0)
     */
    public void setPrice(double price) {
        if (price <= 0) throw new IllegalArgumentException("Price must be greater than zero.");
        this.price = price;
    }

    /**
     * Increases stock by the given amount.
     * @param amount number of units to add (must be >= 1)
     */
    public void increaseStock(int amount) {
        if (amount < 1) throw new IllegalArgumentException("Increased item must be greater than or equal to one");
        units += amount;
    }

    /**
     * Sells (reduces) stock by the given amount.
     * @param amount number of units to sell (must be >= 1 and <= current units)
     */
    public void sellStock(int amount) {
        if (amount < 1) throw new IllegalArgumentException("Sold item must be greater than or equal to one");
        if (amount > units) throw new IllegalArgumentException("Not enough stock to sell");
        units -= amount;
    }

    // ---------- toString ----------

    @Override
    public String toString() {
        return "Stock Type: " + getStockName() + "\n" +
               "Description: " + getStockDescription() + "\n" +
               "Stock Code: " + stockCode + "\n" +
               "Price Without VAT: " + price + "\n" +
               "Price With VAT: " + getPriceWithVAT() + "\n" +
               "Total unit in stock: " + units;
    }
}
