class LapStand {

    String color;
    String height;

    // Default constructor
    LapStand() {
        System.out.println("Stand Constructor is invoked");
    }

    // Parameterized constructor
    LapStand(String height, String color) {
        this.height = height;
        this.color = color;
    }

    public void displayDetails() {
        System.out.println(height);
        System.out.println(color);
    }
}









/*class Stand Executor{
public static vouid main(Strin[] args){

//new constructor of stand
Stand ref = new Stand("3m", "White");
ref.dispalyDetails();

}
}*/