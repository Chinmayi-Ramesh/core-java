class Hospital {

    
    static String doctorNames[] = {
        "Dr. Rajesh",
        "Dr. Priya",
        "Dr. Arun",
        "Dr. Meena",
        "Dr. Kiran"
    };

    
    public static void getDoctorNames() {

        System.out.println("getDoctorNames invoked");

        for(String doctorName : doctorNames) {
            System.out.println(doctorName);   
        }

        System.out.println("End of the Doctor List");
    }
}
