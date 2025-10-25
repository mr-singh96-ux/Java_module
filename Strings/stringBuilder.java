package Strings;
public class stringBuilder{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Kirat");
        sb.append(" Bir Singh");
        System.out.println(sb);
        sb.capacity();
        System.out.println(sb);
    }
}