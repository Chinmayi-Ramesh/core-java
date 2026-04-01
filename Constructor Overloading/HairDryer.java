class HairDryer {

    String brand;
    int power;
    String color;
    boolean portable;
    double price;

    HairDryer() { }

    HairDryer(String brand) {
        this.brand = brand;
    }

    HairDryer(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    HairDryer(String brand, int power, String color) {
        this.brand = brand;
        this.power = power;
        this.color = color;
    }

    HairDryer(String brand, int power, String color, boolean portable) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        this.portable = portable;
    }

    HairDryer(String brand, int power, String color, boolean portable, double price) {
        this.brand = brand;
        this.power = power;
        this.color = color;
        this.portable = portable;
        this.price = price;
    }

    void display() {
        System.out.println("Brand :" + brand);
		System.out.println("power :" + power);
		System.out.println("color :" + color);
		System.out.println("portable :" + portable);
		System.out.println("price :" + price); 
    }
}