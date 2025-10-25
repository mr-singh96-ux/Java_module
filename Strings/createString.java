package Strings;

public class createString{
    public static void main(String[] args) {
        char[] str = {'K','i','r','a','t'};
        String s1 = "Kirat";
        String s2 = new String("Kiratbir Singh Khalsa");
        String s3 = new String(s1);
        String s4 = String.valueOf(1234);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        for(char c:str){
            System.out.print(c);
        }
        System.out.println();
        String s5 = new String("Hello");
        s5 = s5.concat(" C++");
        System.out.println(s5);
        s5 = s5.replace("C++", "Java");
        System.out.println(s5);
        System.out.println(s1.equals(s3));
        
        
        int s = 0;
        for(String word : s2.split(" ")){
            System.out.println(word);
            s++;
        }
        System.out.println(s);
    }
}