class Anklet {

    int id;
    String material;
    double price;

    Anklet() {
        this(1, "Silver", 500);
        System.out.println("Default constructor");
    }

    Anklet(int id, String material, double price) {
        this.id = id;
        this.material = material;
        this.price = price;
        System.out.println("Parameterized constructor");
    }

    void display() {
        System.out.println("Id: " + id);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
    }
}
