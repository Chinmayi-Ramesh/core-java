class YouTubeOne {

    String videoTitleNames[] = new String[15];
    int index;

    public boolean addVideoTitleName(String videoTitle){
        boolean isAdded = false;

        if(index < videoTitleNames.length){
            if(videoTitle != null && !videoTitle.isEmpty()){
                videoTitleNames[index++] = videoTitle;
                isAdded = true;
            } else System.out.println(videoTitle + " is not valid");
        } else System.out.println("Videos are full");

        return isAdded;
    }
 // fetch/get/read operation
    public void getVideoTitleNames(){
        System.out.println("The VideoTitleNames are:");
        for(String videoTitle : videoTitleNames){
            System.out.println(videoTitle);
        }
    }
}