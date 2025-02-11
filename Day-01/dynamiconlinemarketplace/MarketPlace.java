package dynamiconlinemarketplace;

class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
        System.out.println("Discount applied: " + product);
    }
}
