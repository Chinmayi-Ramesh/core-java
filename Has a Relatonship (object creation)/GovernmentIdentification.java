class GovernmentIdentification {

    int idNumber;
    String type;
    String country;
    boolean isValid;

    public void getIdDetails() {
        System.out.println("ID Details");
        System.out.println("Id Number: " + idNumber);
        System.out.println("Type: " + type);
        System.out.println("Country: " + country);
        System.out.println("Is Valid: " + isValid);
    }
}