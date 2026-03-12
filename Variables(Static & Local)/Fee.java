class Fee {

    static String studentName = "Rahul";
    static String usn = "1RV23CS001";
    static double totalFee = 85000;
    static double paidAmount = 50000;
    static double dueAmount = 35000;
    static String paymentMode = "Online";
    static String department = "CSE";
    static int year = 2024;
    static boolean isPaid = false;

    public static void main(String[] args) {

        String studentName = "Arjun";
        String usn = "1RV23EC002";
        double totalFee = 90000;
        double paidAmount = 90000;
        double dueAmount = 0;
        String paymentMode = "Cash";
        String department = "ECE";
        int year = 2024;
        boolean isPaid = true;

        System.out.println("Student Name is " + studentName);
        System.out.println("Student Name (static) is " + Fee.studentName);

        System.out.println("USN is " + usn);
        System.out.println("USN (static) is " + Fee.usn);

        System.out.println("Total Fee is " + totalFee);
        System.out.println("Total Fee (static) is " + Fee.totalFee);

        System.out.println("Paid Amount is " + paidAmount);
        System.out.println("Paid Amount (static) is " + Fee.paidAmount);

        System.out.println("Due Amount is " + dueAmount);
        System.out.println("Due Amount (static) is " + Fee.dueAmount);

        System.out.println("Payment Mode is " + paymentMode);
        System.out.println("Payment Mode (static) is " + Fee.paymentMode);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + Fee.department);

        System.out.println("Year is " + year);
        System.out.println("Year (static) is " + Fee.year);

        System.out.println("Is Paid: " + isPaid);
        System.out.println("Is Paid (static): " + Fee.isPaid);
    }
}
