class ITCompany {

    static String companyName = "Google";
    static String location = "e";
    static int establishedYear = 1998;
    static String ceoName = "Sundar Pichai";
    static int totalEmployees = 180000;
    static double revenue = 2800000000;
    static boolean isProductBased = true;
    static String headquarters = "California";
    static boolean isPublicCompany = true;

    public static void main(String[] args) {

        String companyName = "Microsoft";
        String location = "USA";
        int establishedYear = 1975;
        String ceoName = "Satya Nadella";
        int totalEmployees = 220000;
        double revenue = 3000000000;
        boolean isProductBased = true;
        String headquarters = "Washington";
        boolean isPublicCompany = true;

        System.out.println("Company Name is " + companyName);
        System.out.println("Company Name (static) is " + ITCompany.companyName);

        System.out.println("Location is " + location);
        System.out.println("Location (static) is " + ITCompany.location);

        System.out.println("Established Year is " + establishedYear);
        System.out.println("Established Year (static) is " + ITCompany.establishedYear);

        System.out.println("CEO Name is " + ceoName);
        System.out.println("CEO Name (static) is " + ITCompany.ceoName);

        System.out.println("Total Employees are " + totalEmployees);
        System.out.println("Total Employees (static) are " + ITCompany.totalEmployees);

        System.out.println("Revenue is " + revenue);
        System.out.println("Revenue (static) is " + ITCompany.revenue);

        System.out.println("Is Product Based: " + isProductBased);
        System.out.println("Is Product Based (static): " + ITCompany.isProductBased);

        System.out.println("Headquarters is " + headquarters);
        System.out.println("Headquarters (static) is " + ITCompany.headquarters);

        System.out.println("Is Public Company: " + isPublicCompany);
        System.out.println("Is Public Company (static): " + ITCompany.isPublicCompany);
    }
}
