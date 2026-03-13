class DispatchVehicle {
    static void outForDelivery() {
        System.out.println("DispatchVehicle: Out for delivery");
        DeliveryAgent.reachDoorStep();
    }
}