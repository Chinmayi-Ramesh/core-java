class BangaloreOneExecutor {

    public static void main(String[] a) {

        BangaloreOne ref = new BangaloreOne();

        boolean added = ref.addPinCode(560040);
        System.out.println(added);

        added = ref.addPinCode(560048);
        System.out.println(added);

        added = ref.addPinCode(560032);
        System.out.println(added);

        added = ref.addPinCode(560038);
        System.out.println(added);

        added = ref.addPinCode(560009);
        System.out.println(added);

        ref.getpinCodes();
    }
}