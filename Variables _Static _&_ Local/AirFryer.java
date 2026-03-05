class AirFryer
{
    static String productName;
    static int price;
    static String brand;
    static String capacity;
    static String coolingPower;
    static String specialFeatures;
    static String productDimension;
    static String itemModelNumber;
    static String itemWeight;
    static String colour;

    public static void main(String[] args)
    {
        productName = "Air Fryer";
        price = 5430;
        brand = "Philips";
        capacity = "4.1 litres";
        coolingPower = "Not Applicable";
        specialFeatures = "Programmable, Temperature Control";
        productDimension = "13.3D x 13.3W x 14H Centimeters";
        itemModelNumber = "HD9200/90";
        itemWeight = "5 kg 520 g";
        colour = "Black";

        System.out.println("Product name is " + productName);
        System.out.println("Price " + price);
        System.out.println("Brand is " + brand);
        System.out.println("Capacity " + capacity);
        System.out.println("Cooling power " + coolingPower);
        System.out.println("Special features " + specialFeatures);
        System.out.println("Product dimension " + productDimension);
        System.out.println("Item model number " + itemModelNumber);
        System.out.println("Item weight " + itemWeight);
        System.out.println("Colour " + colour);
    }
}