class UserProfileTwo
{
   
    static String userName = "Ram";
    static long adhaarNo = 123456789012L;
    static String gender = "Male";
    static int age = 45;
    static String emailId = "ram@gmail.com";
    static long mobileNumber = 9876543210L;
    static String permanentAddress = "Ayodhya, Uttar Pradesh";
    static String dateOfBirth = "15/08/1979";
    static String panNo = "ABCDE1234F";
    static long passportNumber = 987654321098L;
    static String country = "India";
    static String fatherName = "Dasharatha";
    static String motherName = "Kaushalya";
    static String qualification = "Graduate";
    static String occupation = "King";
    static boolean isAlive = true;

    public static void main(String[] args)
    {
        
        String userName = "Bharat";
        long adhaarNo = 873693730362L;
        String gender = "Male";
        int age = 40;
        String emailId = "bharat@gmail.com";
        long mobileNumber = 9123456789L;
        String permanentAddress = "Ayodhya Palace";
        String dateOfBirth = "10/10/1984";
        String panNo = "PQRSX5678Z";
        long passportNumber = 648927137561L;
        String country = "India";
        String fatherName = "Dasharatha";
        String motherName = "Kaikeyi";
        String qualification = "MBA";
        String occupation = "Administrator";
        boolean isAlive = true;


        System.out.println("User name is " + userName);
        System.out.println("User name (static) is " + UserProfileTwo.userName);
        System.out.println("Adhaar number is " + adhaarNo);
        System.out.println("Adhaar number (static) is " + UserProfileTwo.adhaarNo);
        System.out.println("Gender is " + gender);
        System.out.println("Gender (static) is " + UserProfileTwo.gender);
        System.out.println("Age is " + age);
        System.out.println("Age (static) is " + UserProfileTwo.age);
        System.out.println("Email ID is " + emailId);
        System.out.println("Email ID (static) is " + UserProfileTwo.emailId);
        System.out.println("Mobile number is " + mobileNumber);
        System.out.println("Mobile number (static) is " + UserProfileTwo.mobileNumber);
        System.out.println("Permanent address is " + permanentAddress);
        System.out.println("Permanent address (static) is " + UserProfileTwo.permanentAddress);
        System.out.println("Date of birth is " + dateOfBirth);
        System.out.println("Date of birth (static) is " + UserProfileTwo.dateOfBirth);
        System.out.println("PAN number is " + panNo);
        System.out.println("PAN number (static) is " + UserProfileTwo.panNo);
        System.out.println("Passport number is " + passportNumber);
        System.out.println("Passport number (static) is " + UserProfileTwo.passportNumber);
        System.out.println("Country is " + country);
        System.out.println("Country (static) is " + UserProfileTwo.country);
        System.out.println("Father name is " + fatherName);
        System.out.println("Father name (static) is " + UserProfileTwo.fatherName);
        System.out.println("Mother name is " + motherName);
        System.out.println("Mother name (static) is " + UserProfileTwo.motherName);
        System.out.println("Qualification is " + qualification);
        System.out.println("Qualification (static) is " + UserProfileTwo.qualification);
        System.out.println("Occupation is " + occupation);
        System.out.println("Occupation (static) is " + UserProfileTwo.occupation);
        System.out.println("Is alive: " + isAlive);
        System.out.println("Is alive (static): " + UserProfileTwo.isAlive);
    }
}