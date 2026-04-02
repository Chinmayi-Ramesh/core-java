class Order {

    int orderId;
    String item;
    int price;
    boolean isDelivered;

    public void getOrderDetails() {
        System.out.println("Order Id: " + orderId);
        System.out.println("Item: " + item);
        System.out.println("Price: " + price);
        System.out.println("Is Delivered: " + isDelivered);
    }
}