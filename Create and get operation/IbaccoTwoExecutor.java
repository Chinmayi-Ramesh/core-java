class IbaccoTwoExecutor{
	public static void main (String[] a){
		IbaccoTwo ref = new IbaccoTwo();
		
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
		
//print all
		ref.getIceCreams();

//search
		
		String IceCream = ref.getIceCreamByName("Candy");
		System.out.println(IceCream + " is available");

//update
		 
		boolean iceCreamUpdated = ref.updateIceCream("vanilla", "Novelty Vanilla");
		System.out.println(iceCreamUpdated);
		
		ref.getIceCreams();


	}
}