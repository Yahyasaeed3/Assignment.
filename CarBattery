package Assignment;

/**
 *
 * @author y2-saiid
 */
/**

 */
public class CarBattery extends StockItem {

    private int capacityAh;
    private String batteryType;

    public CarBattery(double price, String stockCode, int units, int capacityAh, String batteryType) {
        super(price, stockCode, units);
        this.capacityAh = capacityAh;
        this.batteryType = batteryType;
    }

    @Override
    public String getStockName() { return "Car Battery"; }

    @Override
    public String getStockDescription() { return batteryType + " " + capacityAh + "Ah"; }

    public int getCapacityAh() { return capacityAh; }
    public void setCapacityAh(int capacityAh) { this.capacityAh = capacityAh; }
    public String getBatteryType() { return batteryType; }
    public void setBatteryType(String batteryType) { this.batteryType = batteryType; }

    @Override
    public String toString() {
        return super.toString() + "\nCapacity: " + capacityAh + "Ah\nType: " + batteryType;
    }
}
