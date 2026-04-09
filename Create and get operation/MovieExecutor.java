class MovieExecutor {
    public static void main(String[] args){

        Movie movie = new Movie();

        boolean added;

        added = movie.addCast("Darshan");
        System.out.println(added);

        added = movie.addCast("Sudeep");
        System.out.println(added);

        added = movie.addCast("Darshan");
        System.out.println(added);

        added = movie.addCast("Puneeth Rajkumar");
        System.out.println(added);

        added = movie.addCast("Rakshit Shetty");
        System.out.println(added);

        added = movie.addCast("Rishab Shetty");
        System.out.println(added);

        added = movie.addCast("Upendra");
        System.out.println(added);

        added = movie.addCast("Shivarajkumar");
        System.out.println(added);

        added = movie.addCast("Dhananjaya");
        System.out.println(added);

        movie.getCasts();
    }
}