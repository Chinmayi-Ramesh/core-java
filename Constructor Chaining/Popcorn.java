class Popcorn {

    int popcornId;
    String brand;
    double price;

    // Default constructor
    Popcorn() {
        this(1, "Default", 50.0);   // calling another constructor
        System.out.println("Default constructor");
    }

    // Parameterized constructor
    Popcorn(int popcornId, String brand, double price) {
        this.popcornId = popcornId;
        this.brand = brand;
        this.price = price;
        System.out.println("Parameterized constructor");
    }

    void display() {
        System.out.println("Popcorn Id: " + popcornId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}