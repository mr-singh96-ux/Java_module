// Create a class Movie with name, rating, and ticketPrice. Add overloaded constructors and a method to calculate total income for a given number of tickets sold.
package Classes.PracticeQues;
class Movie{
    String movie;
    int rating;
    double price;
    int sold;

    Movie(String movie, int rating, double price, int sold){
        this.movie = movie;
        this.rating = rating;
        this.price = price;
        this.sold = sold;
    }
    void display(){
        System.out.println("Movie: "+movie);
        System.out.println("Rating: "+rating);
        System.out.println("Price: "+price);
        System.out.println("Sold: "+sold);
    }

    double totalIncome(){
        return sold*price;
    }
}
public class prac11{
    public static void main(String[] args) {
        Movie m1 = new Movie("J&J3", 5, 199, 509);
        Movie m2 = new Movie("CMP3", 5, 200, 509);
        m1.display();
        System.out.println(m1.totalIncome());
        System.out.println();
        m2.display();
        System.out.println(m2.totalIncome());
    }
}