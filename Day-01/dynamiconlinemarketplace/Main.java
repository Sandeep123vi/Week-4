package dynamiconlinemarketplace;

public class Main {
    public static void main(String[] args) {
        // Creating products of different categories
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Product<ClothingCategory> clothing = new Product<>("T-Shirt", 20.0, new ClothingCategory());
        Product<GadgetCategory> gadget = new Product<>("Smartphone", 300.0, new GadgetCategory());

        // Displaying original product details
        System.out.println("\nOriginal Prices:");
        System.out.println(book);
        System.out.println(clothing);
        System.out.println(gadget);

        // Applying discounts dynamically
        System.out.println("\nApplying Discounts:");
        Marketplace.applyDiscount(book, 10);
        Marketplace.applyDiscount(clothing, 15);
        Marketplace.applyDiscount(gadget, 5);
    }
}
