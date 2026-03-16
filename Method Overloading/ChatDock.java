class ChatDock{
public static void logIn(String userName,String password){
System.out.println(userName);
System.out.println(password);
}
public static void logIn(long phoneNumber){
System.out.println(phoneNumber);
}
public static void main(String[] args){
logIn("user","pass");
logIn(9876543206L);
}
}