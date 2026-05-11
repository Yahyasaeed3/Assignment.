package Assignment;

/**
 *
 * @author y2-saiid
 */
/**

 */
public class CarTyre extends StockItem {

    private String tyreBrand;
    private String tyreSize;

    public CarTyre(double price, String stockCode, int units, String tyreBrand, String tyreSize) {
        super(price, stockCode, units);
        this.tyreBrand = tyreBrand;
        this.tyreSize = tyreSize;
    }

    @Override
    public String getStockName() { return "Car Tyre"; }

    @Override
    public String getStockDescription() { return tyreBrand + " " + tyreSize; }

    public String getTyreBrand() { return tyreBrand; }
    public void setTyreBrand(String tyreBrand) { this.tyreBrand = tyreBrand; }
    public String getTyreSize() { return tyreSize; }
    public void setTyreSize(String tyreSize) { this.tyreSize = tyreSize; }

    @Override
    public String toString() {
        return super.toString() + "\nTyre Brand: " + tyreBrand + "\nTyre Size: " + tyreSize;
    }
}
