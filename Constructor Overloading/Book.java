class Book {

    String title;
    String author;
    int pages;
    boolean available;
    double price;

    Book() {}

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    Book(String title, String author, int pages, boolean available) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.available = available;
    }

    Book(String title, String author, int pages, boolean available, double price) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.available = available;
        this.price = price;
    }

    void display() {
        System.out.println("The title of the book is :" + title );
		System.out.println("The title of the author is :" + author );
		System.out.println("The title of the pages is :" + pages );
		System.out.println("The title of the available is :" + available );
		System.out.println("The title of the price is :" + price );
		
		System.out.println("The title of the book is :" + title );
    }
}