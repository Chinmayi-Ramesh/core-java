class Steel {

    String type;
    double weight;
    String grade;
    boolean strong;
    double price;

    Steel() {}

    Steel(String type) {
        this.type = type;
    }

    Steel(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    Steel(String type, double weight, String grade) {
        this.type = type;
        this.weight = weight;
        this.grade = grade;
    }

    Steel(String type, double weight, String grade, boolean strong) {
        this.type = type;
        this.weight = weight;
        this.grade = grade;
        this.strong = strong;
    }

    Steel(String type, double weight, String grade, boolean strong, double price) {
        this.type = type;
        this.weight = weight;
        this.grade = grade;
        this.strong = strong;
        this.price = price;
    }

    void display() {
        System.out.println(" The type is:" + type);
		System.out.println(" The weight is:" + weight);
		System.out.println(" The grade is:" + grade);
		System.out.println(" The strong is:" + strong);
		System.out.println(" The price is:" + price);
		
    }
}

