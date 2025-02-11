package dynamiconlinemarketplace;

class Product<T extends ProductCategory> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }

    public void applyDiscount(double percentage) {
        this.price -= this.price * (percentage / 100);
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Category: " + category.getCategoryName() + ", Price: $" + price;
    }
}
