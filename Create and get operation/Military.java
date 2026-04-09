class Military {

    String weaponNames[] = new String[21];
    int index;

    public boolean addWeaponName(String weaponName){
        boolean isAdded = false;

        if(index < weaponNames.length){
            if(weaponName != null && !weaponName.isEmpty()){
                weaponNames[index++] = weaponName;
                isAdded = true;
            } else System.out.println(weaponName + " is not valid");
        } else System.out.println("Weapons are full");

        return isAdded;
    }

    public void getWeaponNames(){
        System.out.println("The WeaponNames are:");
        for(String weaponName : weaponNames){
            System.out.println(weaponName);
        }
    }
}