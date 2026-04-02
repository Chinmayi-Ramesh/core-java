class Application{

	int applicationId;
	String version;
	String downloads;
	String updatedOn;
	String releasedOn;
	String requiredOS;
	float ratings;
	String type;
	
	void getDetails()
	{
		System.out.println("The applicationId is "+applicationId);
		System.out.println("The version of application is "+version);
		System.out.println("The application downloads ");
		System.out.println("The application releasedOn "+releasedOn);
		System.out.println("The requiredOS of application is "+requiredOS);
		System.out.println("The overall ratings of application is "+ratings);
		System.out.println("The application type is "+type);
	}
}