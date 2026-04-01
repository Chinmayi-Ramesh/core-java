class Battery {

    String brand;
    int capacity;
    String type;
    boolean rechargeable;
    double price;

    Battery() {}

    Battery(String brand) {
        this.brand = brand;
    }

    Battery(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    Battery(String brand, int capacity, String type) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
    }

    Battery(String brand, int capacity, String type, boolean rechargeable) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.rechargeable = rechargeable;
    }

    Battery(String brand, int capacity, String type, boolean rechargeable, double price) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.rechargeable = rechargeable;
        this.price = price;
    }

    void display() {
        System.out.println("Brand:" + brand);
		System.out.println("capacity:" + capacity);
		System.out.println("type" + type);
		System.out.println("rechargeable:" + rechargeable);
		System.out.println("price:" + price);
    }
}