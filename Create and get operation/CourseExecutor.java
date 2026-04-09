class CourseExecutor {
    public static void main(String[] args){

        Course course = new Course();

        boolean added;

        added = course.addTechnologyName("Java");
        System.out.println(added);

        added = course.addTechnologyName("Python");
        System.out.println(added);

        added = course.addTechnologyName("C");
        System.out.println(added);

        added = course.addTechnologyName("C++");
        System.out.println(added);

        added = course.addTechnologyName("JavaScript");
        System.out.println(added);

        added = course.addTechnologyName("React");
        System.out.println(added);

        added = course.addTechnologyName("Angular");
        System.out.println(added);

        added = course.addTechnologyName("Spring");
        System.out.println(added);

        added = course.addTechnologyName("SQL");
        System.out.println(added);

        added = course.addTechnologyName("MongoDB");
        System.out.println(added);

        added = course.addTechnologyName("AWS");
        System.out.println(added);

        added = course.addTechnologyName("DevOps");
        System.out.println(added);

        added = course.addTechnologyName("AI");
        System.out.println(added);

        added = course.addTechnologyName("ML");
        System.out.println(added);

        added = course.addTechnologyName("DSA");
        System.out.println(added);

        course.getTechnologyNames();
    }
}