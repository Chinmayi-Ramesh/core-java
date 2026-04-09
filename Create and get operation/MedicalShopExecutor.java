class MedicalShopExecutor {
    public static void main(String[] args){

        MedicalShop ms = new MedicalShop();

        boolean added;

        added = ms.addMedicineName("Paracetamol");
        System.out.println(added);

        added = ms.addMedicineName("Dolo650");
        System.out.println(added);

        added = ms.addMedicineName("Aspirin");
        System.out.println(added);

        added = ms.addMedicineName("Crocin");
        System.out.println(added);

        added = ms.addMedicineName("Ibuprofen");
        System.out.println(added);

        added = ms.addMedicineName("Cetirizine");
        System.out.println(added);

        added = ms.addMedicineName("Amoxicillin");
        System.out.println(added);

        added = ms.addMedicineName("Metformin");
        System.out.println(added);

        added = ms.addMedicineName("Insulin");
        System.out.println(added);

        added = ms.addMedicineName("Pantoprazole");
        System.out.println(added);

        ms.getMedicineNames();
    }
}