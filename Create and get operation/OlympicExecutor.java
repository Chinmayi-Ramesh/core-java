class OlympicExecutor{
	public static void main(String[] a){
		Olympic olympic = new Olympic();
		
		boolean added = olympic.addsportName("Running");
		System.out.println(added);
		
		added = olympic.addsportName("Badminton");
		System.out.println(added);
		
		added = olympic.addsportName("Swimming");
		System.out.println(added);
		
		added = olympic.addsportName("Football");
		System.out.println(added);
		
		added = olympic.addsportName("Basketball");
		System.out.println(added);
		
		added = olympic.addsportName("Hockey");
		System.out.println(added);
		
		added = olympic.addsportName("Boxing");
		System.out.println(added);
		
		added = olympic.addsportName("Relay");
		System.out.println(added);
		
		added = olympic.addsportName("Long Jump");
		System.out.println(added);
		
		added = olympic.addsportName("Javelin");
		System.out.println(added);
		
		added = olympic.addsportName("Discus");
		System.out.println(added);
		
		
		olympic.getsportNames();
	}
	
}