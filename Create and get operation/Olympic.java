class Olympic {
	String sportNames[] = new String[11];
	int index;
	
	public boolean addsportName(String sportName ){
		boolean isAdded = false;
		
		
			
			if(sportName != null && ! sportName.isEmpty ()){
			sportNames[index++] = sportName;
			isAdded = true;
		}else System.out.println(sportName + "is not valid");
		return isAdded;
		
		}
		public void getsportNames(){
			System.out.println("The SportNames are:");
			for(String sportName: sportNames){
				System.out.println(sportName);
			}
				
		}

}