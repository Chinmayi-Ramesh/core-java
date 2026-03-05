class Principal {

    static String name = "Dr. Sharma";
    static int age = 55;
    static String qualification = "PhD";
    static int experience = 30;
    static long mobile = 9876543210L;
    static String email = "principal@college.edu";
    static String collegeName = "Global Engineering College";
    static double salary = 150000;
    static boolean isPermanent = true;

    public static void main(String[] args) {

        String name = "Dr. Rao";
        int age = 50;
        String qualification = "PhD";
        int experience = 25;
        long mobile = 9123456789L;
        String email = "principal@nit.edu";
        String collegeName = "NIT";
        double salary = 180000;
        boolean isPermanent = true;

        System.out.println("Name is " + name);
        System.out.println("Name (static) is " + Principal.name);

        System.out.println("Age is " + age);
        System.out.println("Age (static) is " + Principal.age);

        System.out.println("Qualification is " + qualification);
        System.out.println("Qualification (static) is " + Principal.qualification);

        System.out.println("Experience is " + experience);
        System.out.println("Experience (static) is " + Principal.experience);

        System.out.println("Mobile is " + mobile);
        System.out.println("Mobile (static) is " + Principal.mobile);

        System.out.println("Email is " + email);
        System.out.println("Email (static) is " + Principal.email);

        System.out.println("College Name is " + collegeName);
        System.out.println("College Name (static) is " + Principal.collegeName);

        System.out.println("Salary is " + salary);
        System.out.println("Salary (static) is " + Principal.salary);

        System.out.println("Is Permanent: " + isPermanent);
        System.out.println("Is Permanent (static): " + Principal.isPermanent);
    }
}
