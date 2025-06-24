public class InventoryItem {
    int itemCode;
    String itemName;
    double price;

    InventoryItem(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void display() {
        System.out.println("Code: " + itemCode + ", Name: " + itemName + ", Price: " + price);
    }

    double getTotalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        InventoryItem item = new InventoryItem(501, "Pen", 12.5);
        item.display();
        System.out.println("Total for 10: " + item.getTotalCost(10));
    }
}
