class Refrigerator
{
    static String productName;
    static int price;
    static String brand;
    static String capacity;
    static String energyRating;

    public static void main(String[] args)
    {
        productName = "Refrigerator";
        price = 24000;
        brand = "LG";
        capacity = "260 Litres";
        energyRating = "3 Star";

        System.out.println(productName);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(capacity);
        System.out.println(energyRating);
    }
}