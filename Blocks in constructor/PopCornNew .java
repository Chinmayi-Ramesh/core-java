class PopCornNew {

    String brand;
    int cost;
    int weight;

    // Instance blocks
    {
        System.out.println("1st block is executing");
    }
    {
        System.out.println("2nd block is executing");
    }
    {
        System.out.println("3rd block is executing");
    }

    // Static block
    static {
        System.out.println("Static block is executing");
    }

    // Constructor
    PopCornNew() {
        System.out.println("PopCornNew constructor is executing");
    }

    // Method
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Cost: " + cost);
        System.out.println("Weight: " + weight);
    }
}
