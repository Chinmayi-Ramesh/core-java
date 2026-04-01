class SunscreenRunner {
    public static void main(String[] args) {
        Sunscreen s1 = new Sunscreen();
        s1.display();

        Sunscreen s2 = new Sunscreen(2, "Lotus", 350);
        s2.display();
    }
}