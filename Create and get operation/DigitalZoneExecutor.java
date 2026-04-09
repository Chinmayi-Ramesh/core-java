class DigitalZoneExecutor{
	public static void main(String[] a){
		
		DigitalZone digitalZone = new DigitalZone();
		
		boolean added = digitalZone.addlaptopBrand("DEll");
		System.out.println(added);
		
	    added = digitalZone.addlaptopBrand("hp");
		System.out.println(added);
		
		added = digitalZone.addlaptopBrand("Lenovo");
		System.out.println(added);
		
		added = digitalZone.addlaptopBrand("MAC");
		System.out.println(added);
		
		added = digitalZone.addlaptopBrand("Apple");
		System.out.println(added);
		
		added = digitalZone.addlaptopBrand("Samsung");
		System.out.println(added);
		
		digitalZone.getlaptopBrands();
	}

}