class BangaloreOne {

    int pinCodes[] = new int[5];
    int index;

    public boolean addPinCode(int pinCode) {
        System.out.println("Invoked addPinCode");
        boolean isPinCodeAdded = false;

        if (pinCode != 0 && pinCode > 0) {
            pinCodes[index++] = pinCode;
            isPinCodeAdded = true;
        } else 
            System.out.println(pinCode + " is invalid");
        

        return isPinCodeAdded;
    }

    public void getpinCodes() {
        System.out.println("The Available PinCodes are:");
        for (int pinCode : pinCodes) {
            System.out.println(pinCode);
        }
    }
}