class SoftwareProduct {

    static String productName = "Accounting Software";
    static String companyName = "Tally";
    static String version = "3.0";
    static double price = 15000;
    static String platform = "Windows";
    static boolean isCloudBased = false;
    static int users = 10000;
    static String releaseDate = "01-01-2024";
    static boolean isActive = true;

    public static void main(String[] args) {

        String productName = "Office Suite";
        String companyName = "Microsoft";
        String version = "2024";
        double price = 8000;
        String platform = "Windows & Mac";
        boolean isCloudBased = true;
        int users = 500000;
        String releaseDate = "15-02-2024";
        boolean isActive = true;

        System.out.println("Product Name is " + productName);
        System.out.println("Product Name (static) is " + SoftwareProduct.productName);

        System.out.println("Company Name is " + companyName);
        System.out.println("Company Name (static) is " + SoftwareProduct.companyName);

        System.out.println("Version is " + version);
        System.out.println("Version (static) is " + SoftwareProduct.version);

        System.out.println("Price is " + price);
        System.out.println("Price (static) is " + SoftwareProduct.price);

        System.out.println("Platform is " + platform);
        System.out.println("Platform (static) is " + SoftwareProduct.platform);

        System.out.println("Is Cloud Based: " + isCloudBased);
        System.out.println("Is Cloud Based (static): " + SoftwareProduct.isCloudBased);

        System.out.println("Users are " + users);
        System.out.println("Users (static) are " + SoftwareProduct.users);

        System.out.println("Release Date is " + releaseDate);
        System.out.println("Release Date (static) is " + SoftwareProduct.releaseDate);

        System.out.println("Is Active: " + isActive);
        System.out.println("Is Active (static): " + SoftwareProduct.isActive);
    }
}
