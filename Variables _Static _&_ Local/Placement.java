class Placement {

    static String companyName = "Wipro";
    static String role = "Software Engineer";
    static double packageAmount = 450000;
    static String location = "Bangalore";
    static int year = 2024;
    static int selectedStudents = 40;
    static String coordinator = "Prof. Kumar";
    static boolean isMassRecruiter = true;
    static String mode = "On-Campus";

    public static void main(String[] args) {

        String companyName = "Accenture";
        String role = "Associate Engineer";
        double packageAmount = 400000;
        String location = "Hyderabad";
        int year = 2024;
        int selectedStudents = 35;
        String coordinator = "Prof. Ravi";
        boolean isMassRecruiter = true;
        String mode = "Off-Campus";

        System.out.println("Company Name is " + companyName);
        System.out.println("Company Name (static) is " + Placement.companyName);

        System.out.println("Role is " + role);
        System.out.println("Role (static) is " + Placement.role);

        System.out.println("Package is " + packageAmount);
        System.out.println("Package (static) is " + Placement.packageAmount);

        System.out.println("Location is " + location);
        System.out.println("Location (static) is " + Placement.location);

        System.out.println("Year is " + year);
        System.out.println("Year (static) is " + Placement.year);

        System.out.println("Selected Students are " + selectedStudents);
        System.out.println("Selected Students (static) are " + Placement.selectedStudents);

        System.out.println("Coordinator is " + coordinator);
        System.out.println("Coordinator (static) is " + Placement.coordinator);

        System.out.println("Is Mass Recruiter: " + isMassRecruiter);
        System.out.println("Is Mass Recruiter (static): " + Placement.isMassRecruiter);

        System.out.println("Mode is " + mode);
        System.out.println("Mode (static) is " + Placement.mode);
    }
}
