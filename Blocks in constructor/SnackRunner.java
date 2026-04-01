class SnackRunner {

    static {
        System.out.println("Static block of runner class");
    }

    public static void main(String[] args) {
        Snack ref = new Snack();
        ref.display();
    }
}