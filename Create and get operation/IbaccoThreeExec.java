class IbaccoThreeExec
{
	public static void main(String args[])
	{
		IbaccoThree i = new IbaccoThree();
		boolean added = i.addIceCream("Black current");
		
		added = i.addIceCream("Butter scotch");
		added = i.addIceCream("Strawberry");
		added = i.addIceCream("DBC");
		added = i.addIceCream("black chacolate");
		added = i.addIceCream("Chaco chips");
		added = i.addIceCream("Vanilla");
		added = i.addIceCream("Blue berry");
		added = i.addIceCream("Black berry");
		added = i.addIceCream("Belligium chacolate");
		added = i.addIceCream("smoothie");
		i.getIcecream();
		i.getIcecreamByName("Rabdi");
		i.getIcecreamByName("Butter scotch");
		i.getIcecreamByName("Strawberry");
		i.getIcecreamByName("DBC");
		i.getIcecreamByName("black chacolate");
		i.getIcecreamByName("Chaco chips");
		i.getIcecreamByName("Mango");
		i.getIcecreamByName("Blue Berry");
		i.getIcecreamByName("Black berry");
		i.getIcecreamByName("Belligium chacolate");
		i.getIcecreamByName("smoothie");
		
		System.out.println("\nIce cream names are updated as follows");
		i.updateIcecreamName("Vanilla", "Vanilla novelty");
		i.getIcecream();
	}
}