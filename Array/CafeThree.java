class CafeThree {

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

        String snacksNames[] = {
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
		
		System.out.println("\nNo of tea added are: " + noOfTeams );

        
        System.out.println("\nList of Different Tea Names are:");
        System.out.println(teaNames[0] + "\n" +
                           teaNames[1] + "\n" +
                           teaNames[2] + "\n" +
                           teaNames[3] + "\n" +
                           teaNames[4]);
						   
         noOfTeams = coffeeNames.length;
		
		System.out.println("\nNo of coffee added are: " + noOfTeams );
       
        System.out.println("\nList of Different Coffee Names are:");
        System.out.println(coffeeNames[0] + "\n" +
                           coffeeNames[1] + "\n" +
                           coffeeNames[2] + "\n" +
                           coffeeNames[3] + "\n" +
                           coffeeNames[4] + "\n" +
                           coffeeNames[5] + "\n" +
                           coffeeNames[6] + "\n" +
                           coffeeNames[7] + "\n" +
                           coffeeNames[8] + "\n" +
                           coffeeNames[9] + "\n" +
                           coffeeNames[10] + "\n" +
                           coffeeNames[11] + "\n" +
                           coffeeNames[12] + "\n" +
                           coffeeNames[13] + "\n" +
                           coffeeNames[14]);

         noOfTeams = snacksNames.length;
		
		System.out.println("\nNo of snack added are: " + noOfTeams ); 
		
        System.out.println("\nList of Snacks are:");
        System.out.println(snacksNames[0] + "\n" +
                           snacksNames[1] + "\n" +
                           snacksNames[2] + "\n" +
                           snacksNames[3] + "\n" +
                           snacksNames[4] + "\n" +
                           snacksNames[5] + "\n" +
                           snacksNames[6] + "\n" +
                           snacksNames[7]);
    }
}
