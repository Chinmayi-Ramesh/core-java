class MedicalShop {

    String medicineNames[] = new String[10];
    int index;

    public boolean addMedicineName(String medicine){
        boolean isAdded = false;

        if(index < medicineNames.length){
            if(medicine != null && !medicine.isEmpty()){
                medicineNames[index++] = medicine;
                isAdded = true;
            } else {
                System.out.println(medicine + " is not valid");
            }
        } else {
            System.out.println("Medicines are full");
        }

        return isAdded;
    }

    public void getMedicineNames(){
        System.out.println("Medicine Names are:");
        for(String m : medicineNames){
            System.out.println(m);
        }
    }
}