class Faculty {

    static String name = "Dr. Arvind";
    static String department = "Mechanical";
    static String qualification = "PhD";
    static int experience = 15;
    static double salary = 90000;
    static String email = "arvind@college.edu";
    static long mobile = 9876543210L;
    static boolean isPermanent = true;
    static String designation = "Professor";

    public static void main(String[] args) {

        String name = "Dr. Priya";
        String department = "Civil";
        String qualification = "MTech";
        int experience = 10;
        double salary = 75000;
        String email = "priya@college.edu";
        long mobile = 9123456789L;
        boolean isPermanent = true;
        String designation = "Associate Professor";

        System.out.println("Name is " + name);
        System.out.println("Name (static) is " + Faculty.name);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + Faculty.department);

        System.out.println("Qualification is " + qualification);
        System.out.println("Qualification (static) is " + Faculty.qualification);

        System.out.println("Experience is " + experience);
        System.out.println("Experience (static) is " + Faculty.experience);

        System.out.println("Salary is " + salary);
        System.out.println("Salary (static) is " + Faculty.salary);

        System.out.println("Email is " + email);
        System.out.println("Email (static) is " + Faculty.email);

        System.out.println("Mobile is " + mobile);
        System.out.println("Mobile (static) is " + Faculty.mobile);

        System.out.println("Is Permanent: " + isPermanent);
        System.out.println("Is Permanent (static): " + Faculty.isPermanent);

        System.out.println("Designation is " + designation);
        System.out.println("Designation (static) is " + Faculty.designation);
    }
}
