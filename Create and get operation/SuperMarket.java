class SuperMarket{
	String productNames[] = new String[8];
	int index;
	
	public boolean addproductName(String productName){
		boolean isAdded = false;
		if(productName != null && !productName.isEmpty()){
			productNames[index++] = productName;
			isAdded = true;
		}else System.out.println(productName + "is not valid");
		return isAdded;
	}
	
	public void getproductNames(){
		System.out.println("The Product Names are:");
		for(String productName: productNames){
			System.out.println(productName);
		}
	}

}