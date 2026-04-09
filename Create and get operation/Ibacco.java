class Ibacco {

	String iceCreams[] = new String[10];
	int index;
	
	//create operation
	
	public boolean addIceCream(String iceCream){
		boolean isIceCreamAdded = false;
		
		if(iceCream!=null && !iceCream.isEmpty ()){
			iceCreams[index++] = iceCream;
			isIceCreamAdded = true;
		}else System.out.println(iceCream + "is not valid");
		
		return isIceCreamAdded;
	}
	
	public void getIceCreams(){
		System.out.println("The Avaiable IceCream are : ");
		for(String iceCream:iceCreams)
			System.out.println(iceCream);
	}

}