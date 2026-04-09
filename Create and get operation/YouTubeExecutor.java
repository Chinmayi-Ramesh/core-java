class YouTubeExecutor {
    public static void main(String[] args){

        YouTube youTube = new YouTube();

        boolean added;

        added = youTube.addVideoTitleName("Java Tutorial");
        System.out.println(added);

        added = youTube.addVideoTitleName("Python Basics");
        System.out.println(added);

        added = youTube.addVideoTitleName("React Course");
        System.out.println(added);

        added = youTube.addVideoTitleName("Spring Boot");
        System.out.println(added);

        added = youTube.addVideoTitleName("DSA Explained");
        System.out.println(added);

        added = youTube.addVideoTitleName("SQL Tutorial");
        System.out.println(added);

        added = youTube.addVideoTitleName("AWS Guide");
        System.out.println(added);

        added = youTube.addVideoTitleName("DevOps Intro");
        System.out.println(added);

        added = youTube.addVideoTitleName("AI Basics");
        System.out.println(added);

        added = youTube.addVideoTitleName("ML Concepts");
        System.out.println(added);

        added = youTube.addVideoTitleName("Web Development");
        System.out.println(added);

        added = youTube.addVideoTitleName("Java Interview");
        System.out.println(added);

        added = youTube.addVideoTitleName("Coding Tips");
        System.out.println(added);

        added = youTube.addVideoTitleName("System Design");
        System.out.println(added);

        added = youTube.addVideoTitleName("Placement Prep");
        System.out.println(added);

        youTube.getVideoTitleNames();
    }
}