class MobilePhoneOne {

    public static void main(String[] args){

        MobilePhone.on();
        boolean state = MobilePhone.isOn;
        System.out.println("Mobile State: " + state);

        MobilePhone.useBattery();
        int battery = MobilePhone.battery;
        System.out.println("Battery: " + battery);

        MobilePhone.charge();
        int batteryAfter = MobilePhone.battery;
        System.out.println("Battery After Charge: " + batteryAfter);

        MobilePhone.off();
        state = MobilePhone.isOn;
        System.out.println("Mobile State: " + state);
    }
}