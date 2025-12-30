// First Unique Character

public class que7{
    public static void main(String[] args) {
        String s = "Kirat";
        boolean found = false;
        Character ch = null;
        for(char c : s.toCharArray()){
            int a = s.indexOf(c);
            int b = s.lastIndexOf(c);
            if(a==b){
                ch = c;
                found = true;
                break;
            }
        }

        if(found){
            System.out.println(ch);
        }else{
            System.out.println("-1");
        }
    }
}