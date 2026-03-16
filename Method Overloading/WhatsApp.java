class WhatsApp{

	public static void logIn(String userName, String password){
		System.out.println("Username: " + userName);
		System.out.println("Password: " + password);
	}

	public static void logIn(long phoneNumber){
		System.out.println("Phone Number: " + phoneNumber);
	}

	public static void main(String[] args){
		System.out.println("WhatsApp Login");

		logIn("userWA", "WA@123");
		logIn(9876543211L);
	}
}