class Machine {

    int machineId;
    String type;
    int capacity;
    boolean isWorking;

    public void getMachineDetails() {
        System.out.println("Machine Id: " + machineId);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity);
        System.out.println("Is Working: " + isWorking);
    }
}