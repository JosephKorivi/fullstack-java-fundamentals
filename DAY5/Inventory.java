class InventoryItem {
    String itemName, itemCode, itemDetails, expDate;
    int quantityInStock;

    void itemInventory(String itemName, String itemCode, String itemDetails, String expDate,
            int quantityInStock) {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.itemDetails = itemDetails;
        this.expDate = expDate;
        this.quantityInStock = quantityInStock;
    }

    void displayItemDetails() {
        System.out.println("ItemName: " + itemName + " ItemCode: " + itemCode + " ItemDetails: " + itemDetails
                + " ExpDate: " + expDate + " QuantityInStock: " + quantityInStock);
    }

}

public class Inventory {
    public static void main(String[] args) {
        InventoryItem item1 = new InventoryItem();
        item1.itemInventory("SkinCare", "123", "Women Fashion", "21-12-2025", 50);
        item1.displayItemDetails();
        InventoryItem item2 = new InventoryItem();
        item2.itemInventory("SkinCare", "123", "Men Fashion", "21-12-2025", 50);
        item2.displayItemDetails();
    }
}