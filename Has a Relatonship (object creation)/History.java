class History {

    int transactionId;
    String type;
    double amount;
    boolean isSuccess;

    public void getHistoryDetails() {
        System.out.println("Transaction Id: " + transactionId);
        System.out.println("Type: " + type);
        System.out.println("Amount: " + amount);
        System.out.println("Is Success: " + isSuccess);
    }
}