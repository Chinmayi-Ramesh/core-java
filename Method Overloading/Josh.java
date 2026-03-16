class Josh {
    public static void logIn(String userName, String password){
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }
    public static void logIn(long phoneNumber){
        System.out.println("Phone Number: " + phoneNumber);
    }
    public static void main(String[] args){
        logIn("user","pass");
        logIn(9876543210L);
    }
}