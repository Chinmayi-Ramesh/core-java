class Spotify {

    String artistNames[] = new String[10];
    int index;

    public boolean addArtistName(String artist){
        boolean isAdded = false;

        if(index < artistNames.length){
            if(artist != null && !artist.isEmpty()){
                artistNames[index++] = artist;
                isAdded = true;
            } else {
                System.out.println(artist + " is not valid");
            }
        } else {
            System.out.println("Artists are full");
        }

        return isAdded;
    }

    public void getArtistNames(){
        System.out.println("Artist Names are:");
        for(String a : artistNames){
            System.out.println(a);
        }
    }
}