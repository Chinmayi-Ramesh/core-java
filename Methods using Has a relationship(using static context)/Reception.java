class Reception {

    public static void book(String patientName, String symptom, String email, long mobile) {
		System.out.println("Reception: Booking Appointment");
		Hospital.bookAppointment(patientName, symptom, email, mobile);

    }
}