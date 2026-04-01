class PopCornOneExec {

    static {
        System.out.println("Static block of executor class");
    }

    public static void main(String[] args) {
        PopCornOne ref = new PopCornOne();
        ref.display();
    }
}