class Bank {

    int bankId;
    String bankName;
    String location;
    boolean isNationalized;
    AccountHolder accountHolder;

    public void getBankDetails() {
		System.out.println("Bank Details");
        System.out.println("Bank Id: " + bankId);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Location: " + location);
        System.out.println("Is Nationalized: " + isNationalized);
        accountHolder.getAccountHolderDetails();
        System.out.println("");
    }
}