import java.util.Scanner;
public class Maximum_subArrayProduct{
  public static int maximumProduct(int[] arr){
    int prefixProduct = 1;
    int suffixProduct = 1;
    int left = 0;
    int right = arr.length-1;
    int maxProduct = Integer.MIN_VALUE;
    while(left< arr.length && right>=0){
      if(prefixProduct == 0) prefixProduct = 1;
      if(suffixProduct == 0) suffixProduct = 1;
      prefixProduct *= arr[left++];
      suffixProduct *= arr[right--];
      maxProduct = Math.max(maxProduct , Math.max(prefixProduct, suffixProduct))
    }
    return maxProduct;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i< n; i++){
      arr[i] = sc.nextInt();
    }
    System.out.println(" The maximum sub array product is: " + maximumProduct(arr));
  }
}
