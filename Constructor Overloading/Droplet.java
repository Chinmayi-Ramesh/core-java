class Droplet {
    String color;
    double size;
    String shape;
    boolean pure;
    int count;

    Droplet() {
        System.out.println("Default constructor");
    }

    Droplet(String color) {
        this.color = color;
    }

    Droplet(String color, double size) {
        this(color);
        this.size = size;
    }

    Droplet(String color, double size, String shape) {
        this(color, size);
        this.shape = shape;
    }

    Droplet(String color, double size, String shape, boolean pure) {
        this(color, size, shape);
        this.pure = pure;
    }

    Droplet(String color, double size, String shape, boolean pure, int count) {
        this(color, size, shape, pure);
        this.count = count;
    }

    void display() {
        System.out.println("Color:" + color );
		System.out.println("size:" + size );
		System.out.println("shape:" + shape );
		System.out.println("pure:" + pure);
		System.out.println("count:" + count );
    }
}