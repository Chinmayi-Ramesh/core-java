class Scholarship {

    static String studentName = "Rahul";
    static String scholarshipName = "Merit Scholarship";
    static double amount = 20000;
    static String provider = "Government";
    static String category = "General";
    static boolean isApproved = true;
    static String department = "CSE";
    static int year = 2024;
    static String eligibility = "Above 80%";

    public static void main(String[] args) {

        String studentName = "Arjun";
        String scholarshipName = "Sports Scholarship";
        double amount = 15000;
        String provider = "Private Trust";
        String category = "Sports";
        boolean isApproved = true;
        String department = "ECE";
        int year = 2024;
        String eligibility = "State Level";

        System.out.println("Student Name is " + studentName);
        System.out.println("Student Name (static) is " + Scholarship.studentName);

        System.out.println("Scholarship Name is " + scholarshipName);
        System.out.println("Scholarship Name (static) is " + Scholarship.scholarshipName);

        System.out.println("Amount is " + amount);
        System.out.println("Amount (static) is " + Scholarship.amount);

        System.out.println("Provider is " + provider);
        System.out.println("Provider (static) is " + Scholarship.provider);

        System.out.println("Category is " + category);
        System.out.println("Category (static) is " + Scholarship.category);

        System.out.println("Is Approved: " + isApproved);
        System.out.println("Is Approved (static): " + Scholarship.isApproved);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + Scholarship.department);

        System.out.println("Year is " + year);
        System.out.println("Year (static) is " + Scholarship.year);

        System.out.println("Eligibility is " + eligibility);
        System.out.println("Eligibility (static) is " + Scholarship.eligibility);
    }
}
