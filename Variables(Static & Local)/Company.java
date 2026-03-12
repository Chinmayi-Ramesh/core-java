class Company {

    static String companyName = "Infosys";
    static String location = "Bangalore";
    static int establishedYear = 1981;
    static String ceoName = "Salil Parekh";
    static long contactNumber = 9876543210L;
    static String email = "info@infosys.com";
    static int totalEmployees = 250000;
    static double revenue = 1500000000;
    static boolean isITCompany = true;

    public static void main(String[] args) {

        String companyName = "TCS";
        String location = "Mumbai";
        int establishedYear = 1968;
        String ceoName = "Rajesh Gopinathan";
        long contactNumber = 9123456789L;
        String email = "contact@tcs.com";
        int totalEmployees = 300000;
        double revenue = 2000000000;
        boolean isITCompany = true;

        System.out.println("Company Name is " + companyName);
        System.out.println("Company Name (static) is " + Company.companyName);

        System.out.println("Location is " + location);
        System.out.println("Location (static) is " + Company.location);

        System.out.println("Established Year is " + establishedYear);
        System.out.println("Established Year (static) is " + Company.establishedYear);

        System.out.println("CEO Name is " + ceoName);
        System.out.println("CEO Name (static) is " + Company.ceoName);

        System.out.println("Contact Number is " + contactNumber);
        System.out.println("Contact Number (static) is " + Company.contactNumber);

        System.out.println("Email is " + email);
        System.out.println("Email (static) is " + Company.email);

        System.out.println("Total Employees are " + totalEmployees);
        System.out.println("Total Employees (static) are " + Company.totalEmployees);

        System.out.println("Revenue is " + revenue);
        System.out.println("Revenue (static) is " + Company.revenue);

        System.out.println("Is IT Company: " + isITCompany);
        System.out.println("Is IT Company (static): " + Company.isITCompany);
    }
}
