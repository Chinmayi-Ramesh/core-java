class LibraryExecutor{
	
	public static void main(String[] a){
		
		Library library = new Library();
		
		boolean added = library.addbookName("Java");
		System.out.println(added);
		
	    added = library.addbookName("R Program");
		System.out.println(added);
		
		added = library.addbookName("C");
		System.out.println(added);
		added = library.addbookName("C++");
		System.out.println(added);
		added = library.addbookName("Python");
		System.out.println(added);
		added = library.addbookName("CNN");
		System.out.println(added);
		added = library.addbookName("Renewable");
		System.out.println(added);
		added = library.addbookName(".Net");
		System.out.println(added);
		added = library.addbookName("React");
		System.out.println(added);
		added = library.addbookName("DSA");
		System.out.println(added);
		added = library.addbookName("DBMS");
		System.out.println(added);
		added = library.addbookName("SQL");
		System.out.println(added);
		added = library.addbookName("AdvanceJava");
		System.out.println(added);
		
		
		library.getbookNames();
	}

}