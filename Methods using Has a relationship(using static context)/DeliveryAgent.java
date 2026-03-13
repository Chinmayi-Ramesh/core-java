class DeliveryAgent {
    static void reachDoorStep() {
        System.out.println("DeliveryAgent: Reached doorstep");
        SignaturePortal.collectESign();
    }
}
