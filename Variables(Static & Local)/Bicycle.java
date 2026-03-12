class Bicycle
{
    static String productName;
    static int price;
    static String brand;
    static String cycleType;
    static String frameMaterial;
    static int gearCount;
    static String brakeType;
    static String tyreSize;
    static String countryOfOrigin;
    static String colour;

    public static void main(String[] args)
    {
        productName = "Hero Mountain Bicycle";
        price = 9500;
        brand = "Hero";
        cycleType = "Mountain Bike";
        frameMaterial = "Steel";
        gearCount = 21;
        brakeType = "Disc Brake";
        tyreSize = "26 Inches";
        countryOfOrigin = "India";
        colour = "Red";

        System.out.println("Product name is " + productName);
        System.out.println("Price is " + price);
        System.out.println("Brand is " + brand);
        System.out.println("Cycle Type is " + cycleType);
        System.out.println("Frame Material is " + frameMaterial);
        System.out.println("Gear Count is " + gearCount);
        System.out.println("Brake Type is " + brakeType);
        System.out.println("Tyre Size is " + tyreSize);
        System.out.println("Country of Origin is " + countryOfOrigin);
        System.out.println("Colour is " + colour);
    }
}