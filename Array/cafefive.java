class cafefive {

    public static void main(String[] args) {

        String cafeName = "Tea Kuttera";

        String teaNames[] = {
                "Amla Tea",
                "Black Tea",
                "Green Tea",
                "Masala Tea",
                "Lemon Tea"
        };

        String coffeeNames[] = {
                "Black Coffee",
                "Cold Coffee",
                "Hot Coffee",
                "Chocolate Coffee",
                "Americano",
                "Classic Cold Coffee",
                "Kit Kat Cold Coffee",
                "Nescafe Coffee",
                "Dalgona Coffee",
                "Sukku Kaapi",
                "Filter Coffee",
                "Malgudi Coffee",
                "CTR Coffee",
                "Strawberry Cold Coffee",
                "Cardamom Coffee"
        };

        String snackNames[] = {
                "Banana Chips",
                "Chakli",
                "Mini Samosa",
                "Baked Math",
                "Churmuri",
                "Plain Biscuits",
                "Chocolate Biscuits",
                "Vada Pav"
        };

        
        System.out.println("The Cafe Name is " + cafeName);
		
		int noOfTeams = teaNames.length;
		
		System.out.println("\nNo of tea added are: " + teaNames.length );
		
		
						   
						   
						   // looping statements
						   //for each
						    for(String teaName : teaNames) {
								System.out.println(teaName);
								
				
							}
							
							noOfTeams = coffeeNames.length;
		
		System.out.println("\nNo of coffee added are: " + coffeeNames.length );
							
							for(String coffeeName : coffeeNames){
								System.out.println(coffeeName);
							}
							
							noOfTeams = snackNames.length;
		
		System.out.println("\nNo of snack added are: " + snackNames.length );
							
							for(String snackName : snackNames){
								System.out.println(snackName);
							}
    }
}
