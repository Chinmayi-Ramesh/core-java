class ClinicExecuter{
	public static void main(String[] a){
		
	Clinic clinic = new Clinic();
	
	clinic.clinicId =1;
	clinic.clinicName = "Thara Clinic";
	clinic.clinicAddress = "Tumkur";
	clinic.clinicType = "Dermatologist";
	


   Doctor doctor = new Doctor();
   
   doctor.doctorId = 1;
   doctor.doctorName = "Avyan";
   doctor.doctorExperience = " Four years";
   doctor.doctorFees = 25000;

//has a relationship
    clinic.doctor = doctor;
	
	clinic.getClinicDetails();
}
}