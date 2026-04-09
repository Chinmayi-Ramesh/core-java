class UniverseExecutor {
    public static void main(String[] args){

        Universe universe = new Universe();

        boolean added;

        added = universe.addGalaxy("MilkyWay");
        System.out.println(added);

        added = universe.addGalaxy("Andromeda");
        System.out.println(added);

        added = universe.addGalaxy("Sombrero");
        System.out.println(added);

        added = universe.addGalaxy("Whirlpool");
        System.out.println(added);

        added = universe.addGalaxy("Pinwheel");
        System.out.println(added);

        added = universe.addGalaxy("Cartwheel");
        System.out.println(added);

        added = universe.addGalaxy("BlackEye");
        System.out.println(added);

        added = universe.addGalaxy("Sunflower");
        System.out.println(added);

        added = universe.addGalaxy("Cigar");
        System.out.println(added);

        added = universe.addGalaxy("Tadpole");
        System.out.println(added);

        added = universe.addGalaxy("Hoag");
        System.out.println(added);

        universe.getGalaxies();
    }
}