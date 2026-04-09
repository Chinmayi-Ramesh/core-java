class IbaccoONE{

	String iceCreams[] = new String[10];
	int index;
	
	//create operation
	
	public boolean addIceCream(String iceCream){
		boolean isIceCreamAdded = false;
		
		if(index < iceCreams.length){
		if(iceCream!=null && !iceCream.isEmpty ()){
			iceCreams[index++] = iceCream;
			isIceCreamAdded = true;
		}else System.out.println(iceCream + "is not valid");
		} else System.out.println("iceCreams are full");
		
		return isIceCreamAdded;
	}
	
	public void getIceCreams(){
		System.out.println("The Avaiable IceCream are : ");
		for(String iceCream:iceCreams)
			System.out.println(iceCream);
	}
	
	public String getIceCreamByName(String iceCreamNames){
		{
			String name = null;
			
			for(String iceCream : iceCreams){
				if(iceCream == iceCreamNames){
					name = iceCream;
					break;
				}
			}
			if(name == null)
				System.out.println(iceCreamNames + "is not found");
			
			return name;
		}
	}

}