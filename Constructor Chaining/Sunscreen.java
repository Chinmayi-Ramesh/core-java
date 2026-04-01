class Sunscreen {

    int id;
    String brand;
    double price;

    Sunscreen() {
        this(1, "Nivea", 250);
        System.out.println("Default constructor");
    }

    Sunscreen(int id, String brand, double price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        System.out.println("Parameterized constructor");
    }

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
