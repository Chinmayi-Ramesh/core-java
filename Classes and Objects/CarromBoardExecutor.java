class CarromBoardExecutor {
	
	public static void main(String[] args){
		
		CarromBoard board = new CarromBoard();
		board.boardId = 1;
		board.brandName = "Amazon";
		board.price = 2000.00;
		board.material = "Wooden";
		board.color = "Black";
		
		System.out.println("The Board Id is: " + board.boardId);
		System.out.println("Brand: " + board.brandName);
        System.out.println("Price: " + board.price);
		System.out.println("Materials:" + board.material);
		System.out.println("Color:"+ board.color);
		
		
		CarromBoard board1 = new CarromBoard();
		board1.boardId = 2;
		board1.brandName = "Amazon";
		board1.price = 1500.00;
		board1.material = "Wooden";
		board1.color = "White";
		
		System.out.println("The Board Id is: " + board1.boardId);
		System.out.println("Brand: " + board1.brandName);
        System.out.println("Price: " + board1.price);
		System.out.println("Materials:" + board1.material);
		System.out.println("Color:"+ board1.color);
		
		
		CarromBoard board2 = new CarromBoard();
		board2.boardId = 3;
		board2.brandName = "Flipkart";
		board2.price = 1900.00;
		board2.material = "Wooden";
		board2.color = "Brown";
		
		System.out.println("The Board Id is: " + board2.boardId);
		System.out.println("Brand: " + board2.brandName);
        System.out.println("Price: " + board2.price);
		System.out.println("Materials:" +board2.material);
		System.out.println("Color:"+ board2.color);
	}
}



