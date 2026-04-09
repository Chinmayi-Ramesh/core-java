class PetShop {

    String accessories[] = new String[16];
    int index;

    public boolean addAccessory(String accessory){
        boolean isAdded = false;

        if(index < accessories.length){
            if(accessory != null && !accessory.isEmpty()){
                accessories[index++] = accessory;
                isAdded = true;
            } else System.out.println(accessory + " is not valid");
        } else System.out.println("Accessories are full");

        return isAdded;
    }

    public void getAccessories(){
        System.out.println("The Accessories are:");
        for(String accessory : accessories){
            System.out.println(accessory);
        }
    }
}