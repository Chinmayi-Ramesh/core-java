class MobileApp {

    public static void register(String patientName, String symptom, String email, long mobile) {
		System.out.println("MobileApp: Registering patient");
		Reception.book(patientName, symptom, email, mobile);

    }
}