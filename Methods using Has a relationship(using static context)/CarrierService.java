class CarrierService {
    static void pickUpPackage() {
        System.out.println("CarrierService: Picking package");
        HubRouter.sortToZipCode();
    }
}