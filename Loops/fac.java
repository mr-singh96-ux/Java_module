public class fac{
    public static void main(String[] args) {
        int i = 1, fact = 1;
        while(i <= 5){
            fact *= i;
            i++;
        }
        System.out.println(fact);
    }
}