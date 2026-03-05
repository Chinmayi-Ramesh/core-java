class TelevisionOne {

    static  String brand;
    static  String color;
    static  String screenSize;
    static  String displayType;
    static  int price;
    static  boolean smartTV;
    static  String countryOfOrigin;
	static	String weight ;
	static	String processor;


	
    public static void main(String[] args) {

         brand = "Sony";
         color = "Black";
         screenSize = "55 inches";
         displayType = "LED";
        int price = 60000;
        boolean smartTV = true;
         countryOfOrigin = "Japan";
		 weight = " 7 kg";
		processor ="100 iptrocess";

        System.out.println("TV Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("Display Type: " + displayType);
        System.out.println("Price: " + price);
        System.out.println("Smart TV: " + smartTV);
        System.out.println("Country of Origin: " + countryOfOrigin);
		System.out.println("The Weight:"+ weight);
		System.out.println("Processor: " + processor);
    }
}
