class Mobile {

    int id;
    String brand;
    double price;

    Mobile() {
        this(1, "Samsung", 15000);
        System.out.println("Default constructor");
    }

    Mobile(int id, String brand, double price) {
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
