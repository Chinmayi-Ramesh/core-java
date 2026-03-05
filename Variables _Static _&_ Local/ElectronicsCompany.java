class ElectronicsCompany {

    static String companyName = "Samsung Electronics";
    static String country = "South Korea";
    static int establishedYear = 1969;
    static String ceoName = "Jong-Hee Han";
    static int totalEmployees = 260000;
    static double revenue = 2000000000;
    static boolean isManufacturing = true;
    static String headquarters = "Seoul";
    static boolean isGlobalCompany = true;

    public static void main(String[] args) {

        String companyName = "Sony";
        String country = "Japan";
        int establishedYear = 1946;
        String ceoName = "Kenichiro Yoshida";
        int totalEmployees = 110000;
        double revenue = 1500000000;
        boolean isManufacturing = true;
        String headquarters = "Tokyo";
        boolean isGlobalCompany = true;

        System.out.println("Company Name is " + companyName);
        System.out.println("Company Name (static) is " + ElectronicsCompany.companyName);

        System.out.println("Country is " + country);
        System.out.println("Country (static) is " + ElectronicsCompany.country);

        System.out.println("Established Year is " + establishedYear);
        System.out.println("Established Year (static) is " + ElectronicsCompany.establishedYear);

        System.out.println("CEO Name is " + ceoName);
        System.out.println("CEO Name (static) is " + ElectronicsCompany.ceoName);

        System.out.println("Total Employees are " + totalEmployees);
        System.out.println("Total Employees (static) are " + ElectronicsCompany.totalEmployees);

        System.out.println("Revenue is " + revenue);
        System.out.println("Revenue (static) is " + ElectronicsCompany.revenue);

        System.out.println("Is Manufacturing: " + isManufacturing);
        System.out.println("Is Manufacturing (static): " + ElectronicsCompany.isManufacturing);

        System.out.println("Headquarters is " + headquarters);
        System.out.println("Headquarters (static) is " + ElectronicsCompany.headquarters);

        System.out.println("Is Global Company: " + isGlobalCompany);
        System.out.println("Is Global Company (static): " + ElectronicsCompany.isGlobalCompany);
    }
}
