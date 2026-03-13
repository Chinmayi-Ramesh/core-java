class Restaurant {

    static void toGetGoodFood() {
		TableManager.seatGuest();
        System.out.println("Customer entered restaurant");
          
    }
}

class TableManager {
    static void seatGuest() {
		Waiter.takeOrder(); 
        System.out.println("Guest seated at table");
             
    }
}

class Waiter {
    static void takeOrder() {
		OrderSystem.sendToKitchen(); 
        System.out.println("Waiter takes order");
           
    }
}

class OrderSystem {
    static void sendToKitchen() {
		Kitchen.receiveOrder();   
        System.out.println("Order sent to kitchen");
                
    }
}

class Kitchen {
    static void receiveOrder() {
		HeadChef.cook();
        System.out.println("Kitchen received order");
                     
    }
}

class HeadChef {
    static void cook() {
		RecipeBook.getSteps(); 
        System.out.println("Chef cooking food");
                 
    }
}

class RecipeBook {
    static void getSteps() {
		IngredientList.checkStock();
        System.out.println("Getting recipe steps");
          
    }
}

class IngredientList {
    static void checkStock() {
        System.out.println("Checking ingredient stock");
    }
}