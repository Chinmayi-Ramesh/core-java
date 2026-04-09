class CountryExecutor {
    public static void main(String[] args) {

        Country country = new Country();

        boolean added = country.addState("Andhra Pradesh");
		System.out.println(added);

        added = country.addState("Arunachal Pradesh");
        System.out.println(added);

        added = country.addState("Assam");
        System.out.println(added);

        added = country.addState("Bihar");
        System.out.println(added);

        added = country.addState("Chhattisgarh");
        System.out.println(added);

        added = country.addState("Goa");
        System.out.println(added);

        added = country.addState("Gujarat");
        System.out.println(added);

        added = country.addState("Haryana");
        System.out.println(added);

        added = country.addState("Himachal Pradesh");
        System.out.println(added);

        added = country.addState("Jharkhand");
        System.out.println(added);

        added = country.addState("Karnataka");
        System.out.println(added);

        added = country.addState("Kerala");
        System.out.println(added);

        added = country.addState("Madhya Pradesh");
        System.out.println(added);

        added = country.addState("Maharashtra");
        System.out.println(added);

        added = country.addState("Manipur");
        System.out.println(added);

        added = country.addState("Meghalaya");
        System.out.println(added);

        added = country.addState("Mizoram");
        System.out.println(added);

        added = country.addState("Nagaland");
        System.out.println(added);

        added = country.addState("Odisha");
        System.out.println(added);

        added = country.addState("Punjab");
        System.out.println(added);

        added = country.addState("Rajasthan");
        System.out.println(added);

        added = country.addState("Sikkim");
        System.out.println(added);

        added = country.addState("Tamil Nadu");
        System.out.println(added);

        added = country.addState("Telangana");
        System.out.println(added);

        added = country.addState("Tripura");
        System.out.println(added);

        added = country.addState("Uttar Pradesh");
        System.out.println(added);

        added = country.addState("Uttarakhand");
        System.out.println(added);

        added = country.addState("West Bengal");
        System.out.println(added);

        added = country.addState("Delhi"); 
        System.out.println(added);

        country.getStates();
    }
}