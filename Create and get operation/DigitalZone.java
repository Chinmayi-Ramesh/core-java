class DigitalZone{
	String laptopBrands[]= new String[6];
	int index;
	
	public boolean addlaptopBrand(String laptopBrand){
		boolean isAdded = false;
		
		if(laptopBrand != null && ! laptopBrand.isEmpty()){
			laptopBrands[index++] = laptopBrand;
			isAdded = true;
		}else System.out.println(laptopBrand + " is not valid");
		return isAdded;
	}
	public void getlaptopBrands(){
		System.out.println("The LaptopBrands are:");
		for(String laptopBrand: laptopBrands){
			System.out.println(laptopBrand);
		}
	}
}