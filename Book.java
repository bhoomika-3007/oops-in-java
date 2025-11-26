// Constructor Overloading

class Book {
    String name, author;
    double price;

    Book(String name) {
        this.name = name;
    }

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java");
        Book b2 = new Book("Java", "James Gosling");
        Book b3 = new Book("Java", "James Gosling", 500);
    }
}
