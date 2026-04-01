class PopCornNewExec {

    static {
        System.out.println("Static block of executor class");
    }

    public static void main(String args[]) 
	{

        PopCornNew ref = new PopCornNew();
        ref.display();
    }
}