class Person {

    int personId;
    String name;
    int age;
    boolean isEmployed;
    GovernmentIdentification id;

    public void getPersonDetails() {
        System.out.println("Person Details");

        System.out.println("Person Id: " + personId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Employed: " + isEmployed);
        id.getIdDetails();
    }
}