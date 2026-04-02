class BluetoothSpeaker
{
    static String productName;
    static int price;
    static String brand;
    static String batteryBackup;

    public static void main(String[] args)
    {
        productName = "Bluetooth Speaker";
        price = 4000;
        brand = "JBL";
        batteryBackup = "10 Hours";

        System.out.println(productName);
        System.out.println(price);
        System.out.println(brand);
        System.out.println(batteryBackup);
    }
}