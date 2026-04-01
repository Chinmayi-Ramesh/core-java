class Snow {

    String type;
    double temp;
    String region;
    boolean melting;
    int thickness;

    Snow() { }

    Snow(String type) {
        this.type = type;
    }

    Snow(String type, double temp) {
        this.type = type;
        this.temp = temp;
    }

    Snow(String type, double temp, String region) {
        this.type = type;
        this.temp = temp;
        this.region = region;
    }

    Snow(String type, double temp, String region, boolean melting) {
        this.type = type;
        this.temp = temp;
        this.region = region;
        this.melting = melting;
    }

    Snow(String type, double temp, String region, boolean melting, int thickness) {
        this.type = type;
        this.temp = temp;
        this.region = region;
        this.melting = melting;
        this.thickness = thickness;
    }

    void display() {
        System.out.println("Type:" + type);
		System.out.println("temp:" + temp);
		System.out.println("region:" + region);
	    System.out.println("melting:" + melting);
		System.out.println("thickness:" + thickness);
		
    }
}