class SuperMarketExecutor{
	public static void main(String[] a){
		
		SuperMarket superMarket = new SuperMarket();
		
		boolean added = superMarket.addproductName("Wheatflour");
		System.out.println(added);
		added = superMarket.addproductName("Riceflour");
		System.out.println(added);
		added = superMarket.addproductName("Dryfruits");
		System.out.println(added);
		added = superMarket.addproductName("Biscuits");
		System.out.println(added);
		added = superMarket.addproductName("Snacks");
		System.out.println(added);
		 added = superMarket.addproductName("Juices");
		System.out.println(added);
		added = superMarket.addproductName("Shampoos");
		System.out.println(added);
		added = superMarket.addproductName("Vegetables");
		System.out.println(added);
		
		
		superMarket.getproductNames();
		
	}
}