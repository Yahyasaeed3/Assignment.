
package Assignment;

/**
 *
 * @author y2-saiid
 */
/**

 */
public class DashCam extends StockItem {

    private int resolutionMP;
    private boolean hasNightVision;

    public DashCam(double price, String stockCode, int units, int resolutionMP, boolean hasNightVision) {
        super(price, stockCode, units);
        this.resolutionMP = resolutionMP;
        this.hasNightVision = hasNightVision;
    }

    @Override
    public String getStockName() { return "Dash Cam"; }

    @Override
    public String getStockDescription() { return resolutionMP + "MP DashCam, Night Vision: " + hasNightVision; }

    public int getResolutionMP() { return resolutionMP; }
    public void setResolutionMP(int resolutionMP) { this.resolutionMP = resolutionMP; }
    public boolean isHasNightVision() { return hasNightVision; }
    public void setHasNightVision(boolean hasNightVision) { this.hasNightVision = hasNightVision; }

    @Override
    public String toString() {
        return super.toString() + "\nResolution: " + resolutionMP + "MP\nNight Vision: " + hasNightVision;
    }
}
