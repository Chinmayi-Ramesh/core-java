class Nurse {

    public static boolean basicCheck(String patientName, String symptom) {
		System.out.println("Nurse:Checking patient");
		Doctor.treat(patientName, symptom);

        boolean isChecked = true;

        return isChecked;
    }
}