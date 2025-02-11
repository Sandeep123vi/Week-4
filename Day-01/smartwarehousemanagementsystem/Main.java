package smartwarehousemanagementsystem;

public class Main{
    public static void main(String[] args) {
        // Creating storage for different categories
        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        // Adding items to storage
        electronicsStorage.addItem(new Electronics("Laptop", 1000.0));
        electronicsStorage.addItem(new Electronics("Smartphone", 700.0));

        groceriesStorage.addItem(new Groceries("Apples", 5.0));
        groceriesStorage.addItem(new Groceries("Milk", 2.5));

        furnitureStorage.addItem(new Furniture("Chair", 50.0));
        furnitureStorage.addItem(new Furniture("Table", 120.0));

        // Displaying stored items
        System.out.println("\nElectronics Storage:");
        Storage.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Storage:");
        Storage.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Storage:");
        Storage.displayItems(furnitureStorage.getItems());
    }
}
