class SalonExecutor {
    public static void main(String[] args){

        Salon salon = new Salon();

        boolean added = salon.addService("HairCut");
        System.out.println(added);

        added = salon.addService("Facial");
        System.out.println(added);

        added = salon.addService("Shaving");
        System.out.println(added);

        added = salon.addService("Spa");
        System.out.println(added);

        added = salon.addService("HairColor");
        System.out.println(added);

        added = salon.addService("Massage");
        System.out.println(added);

        added = salon.addService("Cleanup");
        System.out.println(added);

        salon.getServices();
    }
}