import java.util.Scanner;

public class kthlar {
    static int kthLargest(int arr[], int size, int k) {
  for(int i = 0; i < size; i++){
      for(int j =0 ;j < size-i-1; j++){
          if(arr[j] > arr[j+1]){
              int temp = arr[j];
              arr[j] = arr[j+1];
              arr[j+1]= temp;
          }
      }
  }
    size = size-1;
    return arr[size - k];
}

    public static void main(String[] args)
{
  int T, i, k, size = 0;
  Scanner sc = new Scanner(System.in);
  T = Integer.parseInt(sc.nextLine().trim());
  while (T>0)
  {
    k = Integer.parseInt(sc.nextLine().trim());
    size = Integer.parseInt(sc.nextLine().trim());
    int arr[] = new int[size];
    for( i = 0; i < size; i++) 
      arr[i] = sc.nextInt();
    System.out.println(kthLargest(arr, size, k));
    T--;
  }
  sc.close();
}
}
