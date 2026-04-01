class Shoe {

    int id;
    String brand;
    double price;

    Shoe() {
        this(1, "Nike", 3000);
        System.out.println("Default constructor");
    }

    Shoe(int id, String brand, double price) {
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