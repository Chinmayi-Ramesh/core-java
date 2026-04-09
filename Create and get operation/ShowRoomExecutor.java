class ShowRoomExecutor {
    public static void main(String[] args){

        ShowRoom showRoom = new ShowRoom();

        boolean added = showRoom.addManagerName("Ravi");
        System.out.println(added);

        added = showRoom.addManagerName("Kiran");
        System.out.println(added);

        added = showRoom.addManagerName("Anil");
        System.out.println(added);

        added = showRoom.addManagerName("Suresh");
        System.out.println(added);

        added = showRoom.addManagerName("Mahesh");
        System.out.println(added);

        added = showRoom.addManagerName("Ramesh");
        System.out.println(added);

        added = showRoom.addManagerName("Lokesh");
        System.out.println(added);

        added = showRoom.addManagerName("Arjun");
        System.out.println(added);

        showRoom.getManagerNames();
    }
}