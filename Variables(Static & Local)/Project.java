class Project {

    static String projectTitle = "Smart Irrigation";
    static String guideName = "Dr. Meena";
    static String department = "CSE";
    static int teamSize = 4;
    static String technology = "IoT";
    static int durationMonths = 6;
    static boolean isCompleted = false;
    static double budget = 50000;
    static String status = "Ongoing";

    public static void main(String[] args) {

        String projectTitle = "Bridge Design";
        String guideName = "Dr. Kumar";
        String department = "Civil";
        int teamSize = 3;
        String technology = "AutoCAD";
        int durationMonths = 4;
        boolean isCompleted = true;
        double budget = 40000;
        String status = "Completed";

        System.out.println("Project Title is " + projectTitle);
        System.out.println("Project Title (static) is " + Project.projectTitle);

        System.out.println("Guide Name is " + guideName);
        System.out.println("Guide Name (static) is " + Project.guideName);

        System.out.println("Department is " + department);
        System.out.println("Department (static) is " + Project.department);

        System.out.println("Team Size is " + teamSize);
        System.out.println("Team Size (static) is " + Project.teamSize);

        System.out.println("Technology is " + technology);
        System.out.println("Technology (static) is " + Project.technology);

        System.out.println("Duration Months are " + durationMonths);
        System.out.println("Duration Months (static) are " + Project.durationMonths);

        System.out.println("Is Completed: " + isCompleted);
        System.out.println("Is Completed (static): " + Project.isCompleted);

        System.out.println("Budget is " + budget);
        System.out.println("Budget (static) is " + Project.budget);

        System.out.println("Status is " + status);
        System.out.println("Status (static) is " + Project.status);
    }
}
