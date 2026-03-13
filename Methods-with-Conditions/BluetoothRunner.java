class BluetoothRunner {

    public static void main(String[] args) {

        Bluetooth.on();
        boolean BluetoothState = Bluetooth.isOn;
        System.out.println("Bluetooth State: " + BluetoothState);

        Bluetooth.increaseVolume();
        int currentVolume = Bluetooth.currentVolume;
        System.out.println("Current Volume: " + currentVolume);

        Bluetooth.decreaseVolume();
        int volumeAfterDecrease = Bluetooth.currentVolume;
        System.out.println("Current Volume: " + volumeAfterDecrease);

        Bluetooth.bluetooth();
        boolean bluetoothStatus = Bluetooth.bluetoothConnected;
        System.out.println("Bluetooth Connected: " + bluetoothStatus);

        Bluetooth.off();
        boolean BluetoothOff = Bluetooth.isOn;
        System.out.println("Bluetooth State: " + BluetoothOff);
    }
}