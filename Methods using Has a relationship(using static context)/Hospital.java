class Hospital {

    public static void bookAppointment(String patientName, String symptom, String email, long mobile) {
		System.out.println("Hospital: Appointment booked");
		Nurse.basicCheck(patientName, symptom);

    }
}