class Lock {

    int lockId;
    String type;
    int price;
    boolean isSecure;

    public void getLockDetails() {
        System.out.println("Lock Id: " + lockId);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Is Secure: " + isSecure);
    }
}