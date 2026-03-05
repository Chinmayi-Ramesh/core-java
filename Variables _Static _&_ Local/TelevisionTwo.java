class TelevisionTwo {

    static String brand = "Sony";
    static int screenSize = 55;
    static String displayType = "LED";
    static String resolution = "4K";
    static boolean isSmart = true;
    static int warrantyYears = 2;
    static double price = 65000;
    static String color = "Black";
    static boolean isAvailable = true;

    public static void main(String[] args) {

        String brand = "LG";
        int screenSize = 43;
        String displayType = "OLED";
        String resolution = "Full HD";
        boolean isSmart = true;
        int warrantyYears = 3;
        double price = 50000;
        String color = "Grey";
        boolean isAvailable = true;

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + TelevisionTwo.brand);

        System.out.println("Screen Size is " + screenSize);
        System.out.println("Screen Size (static) is " + TelevisionTwo.screenSize);

        System.out.println("Display Type is " + displayType);
        System.out.println("Display Type (static) is " + TelevisionTwo.displayType);

        System.out.println("Resolution is " + resolution);
        System.out.println("Resolution (static) is " + TelevisionTwo.resolution);

        System.out.println("Is Smart: " + isSmart);
        System.out.println("Is Smart (static): " + TelevisionTwo.isSmart);

        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Warranty Years (static): " + TelevisionTwo.warrantyYears);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + TelevisionTwo.price);

        System.out.println("Color is " + color);
        System.out.println("Color (static) is " + TelevisionTwo.color);

        System.out.println("Is Available: " + isAvailable);
        System.out.println("Is Available (static): " + TelevisionTwo.isAvailable);
    }
}
