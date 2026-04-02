class Fan {
	
	int fanId;
	String brand;
	int price;
	boolean hasRemote;
	Capacitor capacitor;
	
	public void getFanDetails(){
		System.out.println("The FanId is:" + fanId);
		System.out.println("The Brand is:" + brand);
		System.out.println("The Price is:" + price);
		System.out.println("The Has a Remote is:" + hasRemote);
		capacitor.getCapacitorDetails();
		
	}
	
}