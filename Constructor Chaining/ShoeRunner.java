class ShoeRunner {
    public static void main(String[] args) {
        Shoe s1 = new Shoe();
        s1.display();

        Shoe s2 = new Shoe(2, "Adidas", 4000);
        s2.display();
    }
}