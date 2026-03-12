class Printer
{
    static String productName;
    static int price;
    static String brand;
    static String type;

    public static void main(String[] args)
    {
        productName = "Printer";
        price = 9000;
        brand = "Epson";
        type = "Inkjet";

        System.out.println(productName);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(type);
    }
}