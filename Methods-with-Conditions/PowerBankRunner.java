class PowerBankRunner {

    public static void main(String[] args){

        PowerBank.on();

        PowerBank.charge();
        int charge = PowerBank.chargeLevel;
        System.out.println("Charge Level: " + charge);

        PowerBank.useCharge();
        int chargeAfter = PowerBank.chargeLevel;
        System.out.println("Charge After: " + chargeAfter);

        PowerBank.off();
    }
}