class Gym {

    
    static String equipments[] = {
        "Treadmill",
        "Dumbbells",
        "Bench Press",
        "Leg Press Machine",
        "Pull-up Bar"
    };

    
    public static void getEquipments() {

        System.out.println("getEquipments invoked");

        for(String equipment : equipments) {
            System.out.println(equipment);   
        }

        System.out.println("End of the Equipment List");
    }
}
