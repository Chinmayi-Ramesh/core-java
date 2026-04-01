class Track {

    String type;
    double length;
    String location;
    boolean active;
    int lanes;

    Track() {}

    Track(String type) {
        this.type = type;
    }

    Track(String type, double length) {
        this.type = type;
        this.length = length;
    }

    Track(String type, double length, String location) {
        this.type = type;
        this.length = length;
        this.location = location;
    }

    Track(String type, double length, String location, boolean active) {
        this.type = type;
        this.length = length;
        this.location = location;
        this.active = active;
    }

    Track(String type, double length, String location, boolean active, int lanes) {
        this.type = type;
        this.length = length;
        this.location = location;
        this.active = active;
        this.lanes = lanes;
    }

    void display() {
        System.out.println("Type:" + type); 
		System.out.println("Length:" + length); 
		System.out.println("Location:" + location); 
		System.out.println("Active:" + active); 
		System.out.println("Lanes:" + lanes); 
    }
}