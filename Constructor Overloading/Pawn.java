class Pawn {

    String color;
    String material;
    int height;
    boolean strong;
    double weight;

    Pawn() {}

    Pawn(String color) {
        this.color = color;
    }

    Pawn(String color, String material) {
        this.color = color;
        this.material = material;
    }

    Pawn(String color, String material, int height) {
        this.color = color;
        this.material = material;
        this.height = height;
    }

    Pawn(String color, String material, int height, boolean strong) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.strong = strong;
    }

    Pawn(String color, String material, int height, boolean strong, double weight) {
        this.color = color;
        this.material = material;
        this.height = height;
        this.strong = strong;
        this.weight = weight;
    }

    void display() {
        System.out.println(color + " " + material + " " + height + " " + strong + " " + weight);
    }
}