class IbaccoExecutor{
	public static void main (String[] a){
		Ibacco ref = new Ibacco();
		
		boolean added = ref.addIceCream("ButterScotch");
		System.out.println(added);
		
		added = ref.addIceCream("vanilla");
		System.out.println(added);
		
		added = ref.addIceCream("SandwitchIceCream");
		System.out.println(added);
		
		added = ref.addIceCream("Chocolate");
		System.out.println(added);
		
		added = ref.addIceCream("vanilla");
		System.out.println(added);
		
		added = ref.addIceCream("Cone");
		System.out.println(added);
		
		added = ref.addIceCream("MudkeIceCream");
		System.out.println(added);
		
		added = ref.addIceCream("Candy");
		System.out.println(added);
		
		added = ref.addIceCream("Kulfi");
		System.out.println(added);
		
		added = ref.addIceCream("Strawbeery");
		System.out.println(added);
		
		
		ref.getIceCreams();
		
	}


}