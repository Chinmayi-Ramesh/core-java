class Bluetooth {

    static boolean isOn = false;
    static int currentVolume = 5;
    static int maxVolume = 9;
    static int minVolume = 0;

    static boolean bluetoothConnected = false;

    static void on() {
        isOn = true;
        System.out.println("Speaker is ON");
    }

    static void off() {
        isOn = false;
        System.out.println("Speaker is OFF");
    }

    static void increaseVolume() {

        if (isOn) {

            if (currentVolume > maxVolume) {
                currentVolume = currentVolume + 1;
                System.out.println("Volume increased to: " + currentVolume);
            } 
			else {
                System.out.println("Max volume reached");
            }

        } else {
            System.out.println("Speaker is OFF");
        }
    }

    static void decreaseVolume() {

        if (isOn) {

            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("Volume decreased to: " + currentVolume);
            } 
			else {
                System.out.println("Min volume reached");
            }

        } 
		else {
            System.out.println("Speaker is OFF");
        }
    }

    static void bluetooth() {

        if (isOn) {
            bluetoothConnected = true;
            System.out.println("Bluetooth connected");
        } else {
            System.out.println("Turn ON speaker first");
        }
    }
}