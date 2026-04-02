class Bangalore {

    int cityId;
    String name;
    String area;
    boolean hasMetro;
    MallOfAsia mall;

    public void getCityDetails() {
        System.out.println("Bangalore Details");

        System.out.println("City Id: " + cityId);
        System.out.println("Name: " + name);
        System.out.println("Area: " + area);
        System.out.println("Has Metro: " + hasMetro);
        mall.getMallDetails();
    }
}