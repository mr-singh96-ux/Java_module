// Create a class Book that stores the title, author, and price. Include constructors, a display method, and count how many books are created using a static variable.

package Classes.PracticeQues;

class Book{
    String title;
    String author;
    double price;
    static int book_count = 0;

    Book(String t, String a, double p){
        title = t;
        author = a;
        price = p;
        book_count++;
    }

    void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
    }
}

public class prac3{
    public static void main(String[] args) {
        Book b1 = new Book("Java", "Harsh", 23.5);
        Book b2 = new Book("C++", "Kirat", 2453.9);
        Book b3 = new Book("JavaScript", "Vansh", 2341.9);
        b1.display();
        b2.display();
        b3.display();
        System.out.println("Total Books: "+Book.book_count);
    }
}