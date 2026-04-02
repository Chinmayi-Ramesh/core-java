class Tv {

    int tvId;
    String brand;
    int price;
    boolean isSmart;
    Remote remote;

    public void getTvDetails() {
        System.out.println("TV Details");

        System.out.println("Tv Id: " + tvId);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Is Smart: " + isSmart);
        remote.getRemoteDetails();
    }
}