class BloodBank
{
    static String emailId;
    static int donorId;
    static String firstName;
    static String lastName;
    static long phoneNumber;
    static int zipCode;
    static String dateOfBirth;
    static String password;
    static String repeatPassword;

    public static void main(String[] args)
    {
        emailId = "hfhtft";
        donorId = 204;
        firstName = "Suma";
        lastName = "H S";
        phoneNumber = 7826856956L;
        zipCode = 577223;
        dateOfBirth = "01/02/2005";
        password = "dhttygj";
        repeatPassword = "dhttygj";

        System.out.println("The email id is " + emailId);
        System.out.println("The donor id is " + donorId);
        System.out.println("The first name is " + firstName);
        System.out.println("The last name is " + lastName);
        System.out.println("The phone number is " + phoneNumber);
        System.out.println("The zip code is " + zipCode);
        System.out.println("The date of birth of a donor is " + dateOfBirth);
        System.out.println("The password is " + password);
        System.out.println("The repeat password is " + repeatPassword);
    }
}