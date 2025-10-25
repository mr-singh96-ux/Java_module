import java.util.*;
public class new1{
    class Result {
  static String revWordsOrder(String str) {
        StringTokenizer str1 = new StringTokenizer(str);
        int n = str1.countTokens();
      String[] arr = new String[n];
        for(int i=0; i<n ;i++){
              arr[i] = str1.nextToken();       
        }
      StringBuilder sb = new StringBuilder();
      for(int i=n-1; i>=0; i--){
          sb.append(arr[i]+" ");
      }
      
      return sb.toString().trim();
        }
      }
public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine().trim());
        while(t-- > 0){
            String str = in.nextLine();
            System.out.println(Result.revWordsOrder(str));
        }
    }
}