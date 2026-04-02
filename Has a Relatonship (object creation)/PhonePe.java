class PhonePe {

    int phonePeId;
    String userName;
    double balance;
    boolean isKYCVerified;
    History history;

    public void getPhonePeDetails() {
		System.out.println("PhonePe Details");
        System.out.println("PhonePe Id: " + phonePeId);
        System.out.println("User Name: " + userName);
        System.out.println("Balance: " + balance);
        System.out.println("KYC Verified: " + isKYCVerified);
        history.getHistoryDetails();
       
    }
}