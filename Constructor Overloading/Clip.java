class Clip {

    String type;
    int size;
    String color;
    boolean strong;
    double price;

    Clip() {}

    Clip(String type) {
        this.type = type;
    }

    Clip(String type, int size) {
        this.type = type;
        this.size = size;
    }

    Clip(String type, int size, String color) {
        this.type = type;
        this.size = size;
        this.color = color;
    }

    Clip(String type, int size, String color, boolean strong) {
        this.type = type;
        this.size = size;
        this.color = color;
        this.strong = strong;
    }

    Clip(String type, int size, String color, boolean strong, double price) {
        this.type = type;
        this.size = size;
        this.color = color;
        this.strong = strong;
        this.price = price;
    }

    void display() {
        System.out.println(" Type:" + type);
		System.out.println(" size:" + size);
		System.out.println(" color:" + color);
		System.out.println(" strong:" + strong);
		System.out.println(" price:" + price);
		
    }
}