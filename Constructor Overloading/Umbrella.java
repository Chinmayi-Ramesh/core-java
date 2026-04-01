class Umbrella {

    String brand;
    double price;
    String color;
    boolean foldable;
    int size;

    Umbrella() { }

    Umbrella(String brand) {
        this.brand = brand;
    }

    Umbrella(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    Umbrella(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    Umbrella(String brand, double price, String color, boolean foldable) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.foldable = foldable;
    }

    Umbrella(String brand, double price, String color, boolean foldable, int size) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.foldable = foldable;
        this.size = size;
    }

    void display() {
        System.out.println("Brand: " + brand );
		System.out.println("price: " + price );
		System.out.println("color: " + color);
		System.out.println("foldable : " + foldable );
		System.out.println("size: " + size );
    }
}