class HungamaExecutor {
    public static void main(String[] args){

        Hungama hungama = new Hungama();

        boolean added;

        added = hungama.addShowName("ComedyShow");
        System.out.println(added);

        added = hungama.addShowName("DanceShow");
        System.out.println(added);

        added = hungama.addShowName("MusicShow");
        System.out.println(added);

        added = hungama.addShowName("RealityShow");
        System.out.println(added);

        added = hungama.addShowName("DramaShow");
        System.out.println(added);

        added = hungama.addShowName("KidsShow");
        System.out.println(added);

        added = hungama.addShowName("GameShow");
        System.out.println(added);

        added = hungama.addShowName("TalkShow");
        System.out.println(added);

        added = hungama.addShowName("NewsShow");
        System.out.println(added);

        added = hungama.addShowName("TravelShow");
        System.out.println(added);

        added = hungama.addShowName("FoodShow");
        System.out.println(added);

        added = hungama.addShowName("SportsShow");
        System.out.println(added);

        added = hungama.addShowName("TalentShow");
        System.out.println(added);

        added = hungama.addShowName("QuizShow");
        System.out.println(added);

        hungama.getShowNames();
    }
}