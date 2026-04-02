class Cart {

    int cartId;
    String user;
    int totalItems;
    boolean isActive;
    Order order;

    public void getCartDetails() {
        System.out.println("Cart Id: " + cartId);
        System.out.println("User: " + user);
        System.out.println("Total Items: " + totalItems);
        System.out.println("Is Active: " + isActive);
        order.getOrderDetails();
    }
}