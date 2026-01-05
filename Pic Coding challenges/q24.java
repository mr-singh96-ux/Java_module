//Capitalize first letter of each word
public class q24 {
    public static void main(String[] args) {
        String s = "code quotient";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : arr){
            sb.append(str.toUpperCase().charAt(0));
            sb.append(str.substring(1));
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());
    }
    
}
