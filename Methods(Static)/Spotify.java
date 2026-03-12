class Spotify {

    
    static String songNames[] = {
        "Shape of You",
        "Believer",
        "Perfect",
        "Kesariya",
        "Blinding Lights"
    };

    
    public static void getSongNames() {

        System.out.println("getSongNames invoked");

        for(String songName : songNames) {
            System.out.println(songName);   
        }

        System.out.println("End of the Song List");
    }
}