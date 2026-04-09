class Library{
	String bookNames[] = new String[13];
	int index;
	
	public boolean addbookName(String bookName){
		boolean isAdded = false;
		if(bookName != null && !bookName.isEmpty()){
		bookNames[index++]= bookName;
		isAdded = true;
		}else System.out.println(bookName + "is not valid");
		return isAdded;
	}
	public void getbookNames(){
		System.out.println("The BookNames are:");
		for(String bookName:bookNames){
			System.out.println(bookName);
		}
	}
}