class IbaccoTwo{
	String iceCreams[] = new String[10];
	int index;
	
	//create operation
	
	public boolean addIceCream(String iceCream){
		boolean isIceCreamAdded = false;
		
		if(index < iceCreams.length){
			if(iceCream!=null && !iceCream.isEmpty()){
				iceCreams[index++] = iceCream;
				isIceCreamAdded = true;
			}else{
				System.out.println(iceCream + " is not valid");
			}
		}else{
			System.out.println("iceCreams are full");
		}
		
		return isIceCreamAdded;
	}
	
	public void getIceCreams(){
		System.out.println("The Available IceCream are : ");
		for(String iceCream:iceCreams){
			System.out.println(iceCream);
		}
	}
	
	public String getIceCreamByName(String iceCreamNames){
		String name = null;
		
		for(String iceCream : iceCreams){
			if(iceCream == iceCreamNames){
				name = iceCream;
				break;
			}
		}
		
		if(name == null){
			System.out.println(iceCreamNames + " is not found");
		}
		
		return name;
	}
	
	public boolean updateIceCream(String existingIceCream, String updateIceCream){
		boolean isIceCreamUpdated = false;
		
		for(int index = 0; index<iceCreams.length; index++){
			if(iceCreams[index] == existingIceCream){
				iceCreams[index] = updateIceCream;
				isIceCreamUpdated = true;
			}
		}
		
		if(isIceCreamUpdated == false){
			System.out.println(existingIceCream + " is not found");
		}
		
		return isIceCreamUpdated;
	}
}