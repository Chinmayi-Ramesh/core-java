class SpotifyExecutor {
    public static void main(String[] args){

        Spotify sp = new Spotify();

        boolean added;

        added = sp.addArtistName("Puneeth Rajkumar");
        System.out.println(added);

        added = sp.addArtistName("Sudeep");
        System.out.println(added);

        added = sp.addArtistName("Yash");
        System.out.println(added);

        added = sp.addArtistName("Vijay Prakash");
        System.out.println(added);

        added = sp.addArtistName("Sonu Nigam");
        System.out.println(added);

        added = sp.addArtistName("Shreya Ghoshal");
        System.out.println(added);

        added = sp.addArtistName("Rajesh Krishnan");
        System.out.println(added);

        added = sp.addArtistName("Chandan Shetty");
        System.out.println(added);

        added = sp.addArtistName("Arjun Janya");
        System.out.println(added);

        added = sp.addArtistName("Anuradha Bhat");
        System.out.println(added);

        sp.getArtistNames();
    }
}