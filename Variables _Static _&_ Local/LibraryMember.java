class LibraryMember {

    static String memberName = "Rahul";
    static String memberId = "LIB001";
    static String department = "CSE";
    static int year = 3;
    static long mobile = 9876543210L;
    static String email = "rahul@gmail.com";
    static int booksIssued = 2;
    static boolean isActive = true;
    static double fineAmount = 0.0;

    public static void main(String[] args) {

        String memberName = "Arjun";
        String memberId = "LIB002";
        String department = "ECE";
        int year = 2;
        long mobile = 9123456789L;
        String email = "arjun@gmail.com";
        int booksIssued = 1;
        boolean isActive = true;
        double fineAmount = 50.0;

        System.out.println("Member Name is " + memberName);
        System.out.println("Member Name (static) is " + LibraryMember.memberName);

        System.out.println("Member ID is " + memberId);
        System.out.println("Member ID (static) is " + LibraryMember.memberId);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + LibraryMember.department);

        System.out.println("Year is " + year);
        System.out.println("Year (static) is " + LibraryMember.year);

        System.out.println("Mobile is " + mobile);
        System.out.println("Mobile (static) is " + LibraryMember.mobile);

        System.out.println("Email is " + email);
        System.out.println("Email (static) is " + LibraryMember.email);

        System.out.println("Books Issued are " + booksIssued);
        System.out.println("Books Issued (static) are " + LibraryMember.booksIssued);

        System.out.println("Is Active: " + isActive);
        System.out.println("Is Active (static): " + LibraryMember.isActive);

        System.out.println("Fine Amount is " + fineAmount);
        System.out.println("Fine Amount (static) is " + LibraryMember.fineAmount);
    }
}
