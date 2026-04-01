class Clinic {
	
	int clinicId;
	String clinicName;
	String clinicAddress;
	String clinicType;
	Doctor doctor;
	
	public void getClinicDetails(){
		
		System.out.println(" The Clinc details Started");
		
		System.out.println("The Clinic Id is:" +  clinicId);
		System.out.println("The Clinic Name is:" + clinicName);
		System.out.println("The Clinic Address is:" + clinicAddress);
		System.out.println("The Clinic Type is:" +  clinicType);
		
		doctor.getDoctorDetails();
		
	}
	
}