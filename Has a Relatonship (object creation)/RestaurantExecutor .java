class RestaurantExecutor {
    public static void main(String[] args) {

        
        Restaurant r1 = new Restaurant();
        r1.restaurantId = 1;
        r1.name = "Empire";
        r1.location = "Bangalore";
        r1.isOpen = true;

        Chef c1 = new Chef();
        c1.chefId = 101;
        c1.name = "Kumar";
        c1.experience = 10;
        c1.isSpecialist = true;

        r1.chef = c1;

        
        Restaurant r2 = new Restaurant();
        r2.restaurantId = 2;
        r2.name = "Udupi Upahar";
        r2.location = "Mysore";
        r2.isOpen = true;

        Chef c2 = new Chef();
        c2.chefId = 102;
        c2.name = "Ramesh";
        c2.experience = 8;
        c2.isSpecialist = true;

        r2.chef = c2;

        
        Restaurant r3 = new Restaurant();
        r3.restaurantId = 3;
        r3.name = "Meghana Foods";
        r3.location = "Bangalore";
        r3.isOpen = true;

        Chef c3 = new Chef();
        c3.chefId = 103;
        c3.name = "Suresh";
        c3.experience = 7;
        c3.isSpecialist = true;

        r3.chef = c3;

        
        Restaurant r4 = new Restaurant();
        r4.restaurantId = 4;
        r4.name = "KFC";
        r4.location = "Chennai";
        r4.isOpen = true;

        Chef c4 = new Chef();
        c4.chefId = 104;
        c4.name = "John";
        c4.experience = 5;
        c4.isSpecialist = false;

        r4.chef = c4;

        
        Restaurant r5 = new Restaurant();
        r5.restaurantId = 5;
        r5.name = "Dominos";
        r5.location = "Hyderabad";
        r5.isOpen = true;

        Chef c5 = new Chef();
        c5.chefId = 105;
        c5.name = "David";
        c5.experience = 6;
        c5.isSpecialist = false;

        r5.chef = c5;

        
        Restaurant r6 = new Restaurant();
        r6.restaurantId = 6;
        r6.name = "Pizza Hut";
        r6.location = "Pune";
        r6.isOpen = false;

        Chef c6 = new Chef();
        c6.chefId = 106;
        c6.name = "Arjun";
        c6.experience = 4;
        c6.isSpecialist = false;

        r6.chef = c6;

        
        Restaurant r7 = new Restaurant();
        r7.restaurantId = 7;
        r7.name = "Burger King";
        r7.location = "Mumbai";
        r7.isOpen = true;

        Chef c7 = new Chef();
        c7.chefId = 107;
        c7.name = "Rahul";
        c7.experience = 5;
        c7.isSpecialist = false;

        r7.chef = c7;

        
        Restaurant r8 = new Restaurant();
        r8.restaurantId = 8;
        r8.name = "Truffles";
        r8.location = "Bangalore";
        r8.isOpen = true;

        Chef c8 = new Chef();
        c8.chefId = 108;
        c8.name = "Vikram";
        c8.experience = 9;
        c8.isSpecialist = true;

        r8.chef = c8;

        
        Restaurant r9 = new Restaurant();
        r9.restaurantId = 9;
        r9.name = "Barbeque Nation";
        r9.location = "Delhi";
        r9.isOpen = true;

        Chef c9 = new Chef();
        c9.chefId = 109;
        c9.name = "Amit";
        c9.experience = 11;
        c9.isSpecialist = true;

        r9.chef = c9;

        
        Restaurant r10 = new Restaurant();
        r10.restaurantId = 10;
        r10.name = "Subway";
        r10.location = "Kolkata";
        r10.isOpen = true;

        Chef c10 = new Chef();
        c10.chefId = 110;
        c10.name = "Neeraj";
        c10.experience = 6;
        c10.isSpecialist = false;

        r10.chef = c10;

        
        Restaurant r11 = new Restaurant();
        r11.restaurantId = 11;
        r11.name = "McDonalds";
        r11.location = "Goa";
        r11.isOpen = true;

        Chef c11 = new Chef();
        c11.chefId = 111;
        c11.name = "Sanjay";
        c11.experience = 5;
        c11.isSpecialist = false;

        r11.chef = c11;

        
        Restaurant r12 = new Restaurant();
        r12.restaurantId = 12;
        r12.name = "Cafe Coffee Day";
        r12.location = "Bangalore";
        r12.isOpen = true;

        Chef c12 = new Chef();
        c12.chefId = 112;
        c12.name = "Karthik";
        c12.experience = 7;
        c12.isSpecialist = true;

        r12.chef = c12;

        
        Restaurant r13 = new Restaurant();
        r13.restaurantId = 13;
        r13.name = "A2B";
        r13.location = "Chennai";
        r13.isOpen = false;

        Chef c13 = new Chef();
        c13.chefId = 113;
        c13.name = "Murugan";
        c13.experience = 10;
        c13.isSpecialist = true;

        r13.chef = c13;

        
        Restaurant r14 = new Restaurant();
        r14.restaurantId = 14;
        r14.name = "Nandhini";
        r14.location = "Bangalore";
        r14.isOpen = true;

        Chef c14 = new Chef();
        c14.chefId = 114;
        c14.name = "Prakash";
        c14.experience = 8;
        c14.isSpecialist = true;

        r14.chef = c14;

        
        Restaurant r15 = new Restaurant();
        r15.restaurantId = 15;
        r15.name = "Biryani Zone";
        r15.location = "Hyderabad";
        r15.isOpen = true;

        Chef c15 = new Chef();
        c15.chefId = 115;
        c15.name = "Imran";
        c15.experience = 9;
        c15.isSpecialist = true;

        r15.chef = c15;

        
        Restaurant r16 = new Restaurant();
        r16.restaurantId = 16;
        r16.name = "Food Court";
        r16.location = "Pune";
        r16.isOpen = false;

        Chef c16 = new Chef();
        c16.chefId = 116;
        c16.name = "Rohit";
        c16.experience = 4;
        c16.isSpecialist = false;

        r16.chef = c16;

        
        Restaurant r17 = new Restaurant();
        r17.restaurantId = 17;
        r17.name = "Spice Garden";
        r17.location = "Mangalore";
        r17.isOpen = true;

        Chef c17 = new Chef();
        c17.chefId = 117;
        c17.name = "Ganesh";
        c17.experience = 6;
        c17.isSpecialist = true;

        r17.chef = c17;

        
        Restaurant r18 = new Restaurant();
        r18.restaurantId = 18;
        r18.name = "Sea Food";
        r18.location = "Udupi";
        r18.isOpen = true;

        Chef c18 = new Chef();
        c18.chefId = 118;
        c18.name = "Harish";
        c18.experience = 7;
        c18.isSpecialist = true;

        r18.chef = c18;

        
        Restaurant r19 = new Restaurant();
        r19.restaurantId = 19;
        r19.name = "Green Leaf";
        r19.location = "Mysore";
        r19.isOpen = false;

        Chef c19 = new Chef();
        c19.chefId = 119;
        c19.name = "Umesh";
        c19.experience = 5;
        c19.isSpecialist = false;

        r19.chef = c19;

        
        Restaurant r20 = new Restaurant();
        r20.restaurantId = 20;
        r20.name = "Royal Kitchen";
        r20.location = "Bangalore";
        r20.isOpen = true;

        Chef c20 = new Chef();
        c20.chefId = 120;
        c20.name = "Vikas";
        c20.experience = 10;
        c20.isSpecialist = true;

        r20.chef = c20;


        
        r1.getRestaurantDetails();
        r2.getRestaurantDetails();
        r3.getRestaurantDetails();
        r4.getRestaurantDetails();
        r5.getRestaurantDetails();
        r6.getRestaurantDetails();
        r7.getRestaurantDetails();
        r8.getRestaurantDetails();
        r9.getRestaurantDetails();
        r10.getRestaurantDetails();
        r11.getRestaurantDetails();
        r12.getRestaurantDetails();
        r13.getRestaurantDetails();
        r14.getRestaurantDetails();
        r15.getRestaurantDetails();
        r16.getRestaurantDetails();
        r17.getRestaurantDetails();
        r18.getRestaurantDetails();
        r19.getRestaurantDetails();
        r20.getRestaurantDetails();
    }
}