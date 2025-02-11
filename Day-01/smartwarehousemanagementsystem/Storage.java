package smartwarehousemanagementsystem;
import java.util.ArrayList;
import java.util.List;

class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    // Wildcard method to display all warehouse items
    public static void displayItems(List<? extends WarehouseItem> items) {
        System.out.println("Warehouse Inventory:");
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}