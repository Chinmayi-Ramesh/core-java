class Router {

    static String brand = "TP-Link";
    static String model = "Archer C6";
    static String frequency = "Dual Band";
    static int range = 300;
    static double price = 3500;
    static int warrantyYears = 3;
    static boolean isDualBand = true;
    static String color = "Black";
    static boolean isAvailable = true;

    public static void main(String[] args) {

        String brand = "D-Link";
        String model = "DIR-825";
        String frequency = "Single Band";
        int range = 200;
        double price = 2500;
        int warrantyYears = 2;
        boolean isDualBand = false;
        String color = "White";
        boolean isAvailable = true;

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + Router.brand);

        System.out.println("Model is " + model);
        System.out.println("Model (static) is " + Router.model);

        System.out.println("Frequency is " + frequency);
        System.out.println("Frequency (static) is " + Router.frequency);

        System.out.println("Range is " + range);
        System.out.println("Range (static) is " + Router.range);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + Router.price);

        System.out.println("Warranty Years: " + warrantyYears);
        System.out.println("Warranty Years (static): " + Router.warrantyYears);

        System.out.println("Is Dual Band: " + isDualBand);
        System.out.println("Is Dual Band (static): " + Router.isDualBand);

        System.out.println("Color is " + color);
        System.out.println("Color (static) is " + Router.color);

        System.out.println("Is Available: " + isAvailable);
        System.out.println("Is Available (static): " + Router.isAvailable);
    }
}
