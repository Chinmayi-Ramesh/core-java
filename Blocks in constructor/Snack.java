class Snack {

    String brand;
    int cost;
    int weight;

    {
        System.out.println("1st block is executing");
    }
    {
        System.out.println("2nd block is executing");
    }
    {
        System.out.println("3rd block is executing");
    }

    static {
        System.out.println("Static block is executing");
    }

    Snack() {
        System.out.println("Snack constructor is executing");
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Cost: " + cost);
        System.out.println("Weight: " + weight);
    }
}