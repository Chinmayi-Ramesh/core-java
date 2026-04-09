class IbaccoThree{
	String iceCreams[] = new String[10];
	int index;
	
	public boolean addIceCream(String iceCream)
	{
		boolean isadded = false;
		if(index < iceCreams.length)
		{
			System.out.println("You can add iceCream memory is free");
		if(iceCream != null && !iceCream.isEmpty())
		{
			iceCreams[index++] = iceCream;
			isadded = true;
			
		}
		else
			System.out.println(iceCream +" is not valid ");
		}
		else
			System.out.println("Icream is full already");
		return isadded;
	}
	public void getIcecream()
	{
		for(String iceCream : iceCreams)	
			System.out.println(iceCream);
	}
	
	String getIcecreamByName(String iceCreamName)
	{
		String name = null ;
		for(String ice : iceCreams)
		{
			if(iceCreamName.equalsIgnoreCase(ice))
			{
				name = iceCreamName;
				System.out.println(name +" is available ");
				break;
			}	
		}
		if(name == null)
			System.out.println(iceCreamName+" not found");
		
		return name;
	}
	boolean updateIcecreamName(String existingName, String updateName)
	{
		boolean isUpdated = false;
		/*for(String iceCream :iceCreams)
		{
			if(iceCream == existingName){
				iceCream = updateName;
				isUpdated = true;
			}
		}*/
		
		for(int index = 0; index<iceCreams.length; index++)
		{
			if(iceCreams[index] == existingName)
			{
				iceCreams[index] = updateName;
				isUpdated = true;
			}
		}
		if(isUpdated = false)
			System.out.println("the "+existingName+" name is not updated");
		return isUpdated;
	}
}