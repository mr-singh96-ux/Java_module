//Unique element in the arrays

package CodingChallengesQues;
import java.util.*;
public class q1 {
    public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5};
    int[] b = {1, 2, 3, 4};
    int xor = 0;
    for(int num : a){
        xor ^= num;
    }

    for(int num : b){
        xor ^= num;
    }

    System.out.println(xor);
    }
}
