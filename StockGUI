
package Assignment;

/**
 *
 * @author y2-saiid
 */
import javax.swing.*;
import java.awt.*;

/**
 * StockGUI - GUI application for testing StockItem and NavSys classes.
 * Covers Step 1 (StockItem) and Step 2 (NavSys).
 */
public class StockGUI extends JFrame {

    // --- Widgets ---
    private JComboBox<String> itemTypeCombo;
    private JTextField codeField, priceField, unitsField, amountField, newPriceField;
    private JTextArea outputArea;
    private StockItem currentItem;

    public StockGUI() {
        setTitle("Car Parts Stock Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(620, 580);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        // ---- TOP: Create panel ----
        JPanel createPanel = new JPanel(new GridLayout(0, 2, 6, 6));
        createPanel.setBorder(BorderFactory.createTitledBorder("1. Create Stock Item"));

        createPanel.add(new JLabel("Item Type:"));
        itemTypeCombo = new JComboBox<>(new String[]{"StockItem", "NavSys", "CarTyre", "DashCam", "CarBattery"});
        createPanel.add(itemTypeCombo);

        createPanel.add(new JLabel("Stock Code:"));
        codeField = new JTextField("NS101");
        createPanel.add(codeField);

        createPanel.add(new JLabel("Price (ex-VAT):"));
        priceField = new JTextField("99.99");
        createPanel.add(priceField);

        createPanel.add(new JLabel("Initial Units:"));
        unitsField = new JTextField("10");
        createPanel.add(unitsField);

        JButton createBtn = new JButton("Create Item");
        createBtn.addActionListener(e -> createItem());
        createPanel.add(createBtn);
        createPanel.add(new JLabel(""));

        // ---- MIDDLE: Operations panel ----
        JPanel opsPanel = new JPanel(new GridLayout(0, 2, 6, 6));
        opsPanel.setBorder(BorderFactory.createTitledBorder("2. Operations"));

        opsPanel.add(new JLabel("Amount (add/sell):"));
        amountField = new JTextField("10");
        opsPanel.add(amountField);

        JButton addBtn = new JButton("Increase Stock");
        addBtn.addActionListener(e -> doIncrease());
        opsPanel.add(addBtn);

        JButton sellBtn = new JButton("Sell Stock");
        sellBtn.addActionListener(e -> doSell());
        opsPanel.add(sellBtn);

        opsPanel.add(new JLabel("New Price (ex-VAT):"));
        newPriceField = new JTextField("100.99");
        opsPanel.add(newPriceField);

        JButton priceBtn = new JButton("Change Price");
        priceBtn.addActionListener(e -> doChangePrice());
        opsPanel.add(priceBtn);

        JButton displayBtn = new JButton("Display Item");
        displayBtn.addActionListener(e -> display("Current item details:"));
        opsPanel.add(displayBtn);

        // ---- BOTTOM: Output area ----
        outputArea = new JTextArea(12, 40);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        JScrollPane scroll = new JScrollPane(outputArea);
        scroll.setBorder(BorderFactory.createTitledBorder("Output"));

        // ---- Assemble ----
        JPanel topSection = new JPanel(new GridLayout(1, 2, 10, 0));
        topSection.add(createPanel);
        topSection.add(opsPanel);

        add(topSection, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
    }

    /** Creates the chosen StockItem subclass. */
    private void createItem() {
        try {
            String code = codeField.getText().trim();
            double price = Double.parseDouble(priceField.getText().trim());
            int units = Integer.parseInt(unitsField.getText().trim());
            String type = (String) itemTypeCombo.getSelectedItem();

            switch (type) {
                case "NavSys":
                    currentItem = new NavSys(price, code, units);
                    break;
                case "CarTyre":
                    currentItem = new CarTyre(price, code, units, "Michelin", "205/55 R16");
                    break;
                case "DashCam":
                    currentItem = new DashCam(price, code, units, 4, true);
                    break;
                case "CarBattery":
                    currentItem = new CarBattery(price, code, units, 60, "AGM");
                    break;
                default:
                    currentItem = new StockItem(price, code, units) {}; // anonymous subclass
                    break;
            }
            display("Item created successfully:");
        } catch (NumberFormatException ex) {
            output("ERROR: Please enter valid numbers for price and units.\n");
        }
    }

    private void doIncrease() {
        if (!checkItemExists()) return;
        try {
            int amount = Integer.parseInt(amountField.getText().trim());
            currentItem.increaseStock(amount);
            display("Stock increased by " + amount + " units:");
        } catch (IllegalArgumentException ex) {
            output("The error was: " + ex.getMessage() + "\n");
        }
    }

    private void doSell() {
        if (!checkItemExists()) return;
        try {
            int amount = Integer.parseInt(amountField.getText().trim());
            currentItem.sellStock(amount);
            display("Sold " + amount + " units:");
        } catch (IllegalArgumentException ex) {
            output("The error was: " + ex.getMessage() + "\n");
        }
    }

    private void doChangePrice() {
        if (!checkItemExists()) return;
        try {
            double newPrice = Double.parseDouble(newPriceField.getText().trim());
            currentItem.setPrice(newPrice);
            display("Price updated to " + newPrice + ":");
        } catch (IllegalArgumentException ex) {
            output("The error was: " + ex.getMessage() + "\n");
        }
    }

    private void display(String header) {
        if (!checkItemExists()) return;
        output("--- " + header + " ---\n" + currentItem.toString() + "\n\n");
    }

    private void output(String text) {
        outputArea.append(text);
        outputArea.setCaretPosition(outputArea.getDocument().getLength());
    }

    private boolean checkItemExists() {
        if (currentItem == null) {
            output("ERROR: No item created yet. Use the Create panel first.\n");
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StockGUI().setVisible(true));
    }
}
