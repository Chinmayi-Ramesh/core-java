class AccountHolder {

    int holderId;
    String name;
    String accountType;
    boolean hasDebitCard;

    public void getAccountHolderDetails() {
        System.out.println("Holder Id: " + holderId);
        System.out.println("Name: " + name);
        System.out.println("Account Type: " + accountType);
        System.out.println("Has Debit Card: " + hasDebitCard);
    }
}