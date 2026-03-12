class CompanyBranch {

    static String branchName = "Bangalore Branch";
    static String companyName = "Infosys";
    static String location = "Electronic City";
    static int employees = 5000;
    static String managerName = "Mr. Arvind";
    static long contactNumber = 9876543210L;
    static String email = "blr@infosys.com";
    static boolean isHeadOffice = false;
    static int establishedYear = 2005;

    public static void main(String[] args) {

        String branchName = "Mumbai Branch";
        String companyName = "TCS";
        String location = "Andheri";
        int employees = 4500;
        String managerName = "Mr. Ravi";
        long contactNumber = 9123456789L;
        String email = "mum@tcs.com";
        boolean isHeadOffice = false;
        int establishedYear = 2000;

        System.out.println("Branch Name is " + branchName);
        System.out.println("Branch Name (static) is " + CompanyBranch.branchName);

        System.out.println("Company Name is " + companyName);
        System.out.println("Company Name (static) is " + CompanyBranch.companyName);

        System.out.println("Location is " + location);
        System.out.println("Location (static) is " + CompanyBranch.location);

        System.out.println("Employees are " + employees);
        System.out.println("Employees (static) are " + CompanyBranch.employees);

        System.out.println("Manager Name is " + managerName);
        System.out.println("Manager Name (static) is " + CompanyBranch.managerName);

        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Contact Number (static) is " + CompanyBranch.contactNumber);

        System.out.println("Email is " + email);
        System.out.println("Email (static) is " + CompanyBranch.email);

        System.out.println("Is Head Office: " + isHeadOffice);
        System.out.println("Is Head Office (static): " + CompanyBranch.isHeadOffice);

        System.out.println("Established Year is " + establishedYear);
        System.out.println("Established Year (static) is " + CompanyBranch.establishedYear);
    }
}
