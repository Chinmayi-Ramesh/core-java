class CarTyre
{
    static String productName;
    static int price;
    static String brand;
    static String tyreSize;
    static String vehicleType;
    static String tyreType;
    static String material;
    static String loadIndex;
    static String speedRating;
    static String countryOfOrigin;

    public static void main(String[] args)
    {
        productName = "MRF Radial Car Tyre";
        price = 5200;
        brand = "MRF";
        tyreSize = "195/65 R15";
        vehicleType = "Car";
        tyreType = "Tubeless";
        material = "Rubber";
        loadIndex = "91";
        speedRating = "H";
        countryOfOrigin = "India";

        System.out.println("Product name is " + productName);
        System.out.println("Price is " + price);
        System.out.println("Brand is " + brand);
        System.out.println("Tyre Size is " + tyreSize);
        System.out.println("Vehicle Type is " + vehicleType);
        System.out.println("Tyre Type is " + tyreType);
        System.out.println("Material is " + material);
        System.out.println("Load Index is " + loadIndex);
        System.out.println("Speed Rating is " + speedRating);
        System.out.println("Country of Origin is " + countryOfOrigin);
    }
}