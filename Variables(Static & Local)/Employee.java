class Employee {

    static String name = "Ramesh";
    static String employeeId = "EMP001";
    static String department = "HR";
    static int age = 30;
    static double salary = 45000;
    static long mobile = 9876543210L;
    static String email = "ramesh@company.com";
    static String designation = "Manager";
    static boolean isPermanent = true;

    public static void main(String[] args) {

        String name = "Suresh";
        String employeeId = "EMP002";
        String department = "Finance";
        int age = 28;
        double salary = 40000;
        long mobile = 9123456789L;
        String email = "suresh@company.com";
        String designation = "Executive";
        boolean isPermanent = true;

        System.out.println("Name is " + name);
        System.out.println("Name (static) is " + Employee.name);

        System.out.println("Employee ID is " + employeeId);
        System.out.println("Employee ID (static) is " + Employee.employeeId);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + Employee.department);

        System.out.println("Age is " + age);
        System.out.println("Age (static) is " + Employee.age);

        System.out.println("Salary is " + salary);
        System.out.println("Salary (static) is " + Employee.salary);

        System.out.println("Mobile is " + mobile);
        System.out.println("Mobile (static) is " + Employee.mobile);

        System.out.println("Email is " + email);
        System.out.println("Email (static) is " + Employee.email);

        System.out.println("Designation is " + designation);
        System.out.println("Designation (static) is " + Employee.designation);

        System.out.println("Is Permanent: " + isPermanent);
        System.out.println("Is Permanent (static): " + Employee.isPermanent);
    }
}
