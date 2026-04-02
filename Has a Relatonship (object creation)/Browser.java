class Browser{
	int browserId;
	String name;
	String company;
	String version;
	boolean isSecured;
	boolean isAiIntegrated;
	Internet internet;
	
	void display()
	{
		System.out.println("display() of Browser class");
		System.out.println("The browserId is "+browserId);
		System.out.println("The name of the browser is "+name);
		System.out.println("The name of the browser company "+company);
		System.out.println("The version of the browser is "+version);
		System.out.println("Is the browser secured "+isSecured);
		System.out.println("Is AI integrated "+isAiIntegrated);
	}
}