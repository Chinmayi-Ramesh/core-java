class MilitaryExecutor {
    public static void main(String[] args){

        Military military = new Military();

        boolean added = military.addWeaponName("Rifle");
        System.out.println(added);

        added = military.addWeaponName("Pistol");
        System.out.println(added);

        added = military.addWeaponName("Tank");
        System.out.println(added);

        added = military.addWeaponName("Missile");
        System.out.println(added);

        added = military.addWeaponName("Grenade");
        System.out.println(added);

        added = military.addWeaponName("Drone");
        System.out.println(added);

        added = military.addWeaponName("Rocket");
        System.out.println(added);

        added = military.addWeaponName("Submarine");
        System.out.println(added);

        added = military.addWeaponName("Helicopter");
        System.out.println(added);

        added = military.addWeaponName("Jet");
        System.out.println(added);

        added = military.addWeaponName("Cannon");
        System.out.println(added);

        added = military.addWeaponName("Radar");
        System.out.println(added);

        added = military.addWeaponName("Bomb");
        System.out.println(added);

        added = military.addWeaponName("Mortar");
        System.out.println(added);

        added = military.addWeaponName("Knife");
        System.out.println(added);

        added = military.addWeaponName("Gunship");
        System.out.println(added);

        added = military.addWeaponName("Warship");
        System.out.println(added);

        added = military.addWeaponName("Torpedo");
        System.out.println(added);

        added = military.addWeaponName("Bazooka");
        System.out.println(added);

        added = military.addWeaponName("Sniper");
        System.out.println(added);

        added = military.addWeaponName("Shield");
        System.out.println(added);

        military.getWeaponNames();
    }
}