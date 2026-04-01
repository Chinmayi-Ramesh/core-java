class BagExec
{
	public static void main(String args[])
	{
		Bag ref = new Bag();
		
		Bag ref1 = new Bag("Power point", "college bag", "Grey",2560, 350, "Leather", 6);
		ref1.display();
		
		Bag ref2 = new Bag("Sky bag", "Trolley ", "Black", 15000, 1000, "", 3);
		ref2.display();
		
		Bag ref3 = new Bag("American tourist", "Trolley", "Grey", 20000, 2000, "", 4);
		ref3.display();
	}
}