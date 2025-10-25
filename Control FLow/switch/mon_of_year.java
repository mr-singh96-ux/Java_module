import java.util.*;

public class mon_of_year {
    public static void main(String[] args) {
        int month;
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        String monthName = switch(month){
            case 1-> "Jan";
            case 2 -> "Feb";
            case 3 -> "Mar";
            case 4 -> "Apr";
            case 5 -> "May";
            case 6 -> "Jun";
            case 7 -> "Jul";
            case 8 -> "Aug";
            case 9 -> "Sept";
            case 10 -> "Oct";
            case 11 -> "Nov";
            case 12 -> "Dec";
            default ->"Invalid Input";
        };
        System.out.println(monthName);
    }
}
