class Carrom {

    String boardType;
    int size;
    String color;
    boolean smooth;
    double price;

    Carrom() {}

    Carrom(String boardType) {
        this.boardType = boardType;
    }

    Carrom(String boardType, int size) {
        this.boardType = boardType;
        this.size = size;
    }

    Carrom(String boardType, int size, String color) {
        this.boardType = boardType;
        this.size = size;
        this.color = color;
    }

    Carrom(String boardType, int size, String color, boolean smooth) {
        this.boardType = boardType;
        this.size = size;
        this.color = color;
        this.smooth = smooth;
    }

    Carrom(String boardType, int size, String color, boolean smooth, double price) {
        this.boardType = boardType;
        this.size = size;
        this.color = color;
        this.smooth = smooth;
        this.price = price;
    }

    void display() {
        System.out.println(boardType + " " + size + " " + color + " " + smooth + " " + price);
    }
}