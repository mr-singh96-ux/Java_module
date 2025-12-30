// Reverse Words in String 

public class que8{
    public static void main(String[] args) {
        String s = "Hello Coders";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String ns : arr){
            StringBuilder sn = new StringBuilder(ns);
            sb.append(sn.reverse());
            sb.append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}