class Laptop {

    static String brand = "Dell";
    static String model = "Inspiron";
    static String processor = "i7";
    static int ram = 16;
    static int storage = 512;
    static String os = "Windows";
    static double price = 75000;
    static String color = "Black";
    static boolean isAvailable = true;

    public static void main(String[] args) {

        String brand = "HP";
        String model = "Pavilion";
        String processor = "i5";
        int ram = 8;
        int storage = 256;
        String os = "Windows";
        double price = 65000;
        String color = "Silver";
        boolean isAvailable = true;

        System.out.println("Brand is " + brand);
        System.out.println("Brand (static) is " + Laptop.brand);

        System.out.println("Model is " + model);
        System.out.println("Model (static) is " + Laptop.model);

        System.out.println("Processor is " + processor);
        System.out.println("Processor (static) is " + Laptop.processor);

        System.out.println("RAM is " + ram);
        System.out.println("RAM (static) is " + Laptop.ram);

        System.out.println("Storage is " + storage);
        System.out.println("Storage (static) is " + Laptop.storage);

        System.out.println("OS is " + os);
        System.out.println("OS (static) is " + Laptop.os);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + Laptop.price);

        System.out.println("Color is " + color);
        System.out.println("Color (static) is " + Laptop.color);

        System.out.println("Is Available: " + isAvailable);
        System.out.println("Is Available (static): " + Laptop.isAvailable);
    }
}
