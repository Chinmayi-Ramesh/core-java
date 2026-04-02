class WaterPurifier
{
    static String productName;
    static int price;
    static String brand;
    static String purificationType;

    public static void main(String[] args)
    {
        productName = "Water Purifier";
        price = 15000;
        brand = "Kent";
        purificationType = "RO + UV";

        System.out.println(productName);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(purificationType);
    }
}