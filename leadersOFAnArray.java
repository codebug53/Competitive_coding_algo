import java.util.*;
public class leadersOfAnArray{
  private static List<Integer> leaders(int arr[]){
    int max = Integer.MIN_VALUE;
    List<Integer> list = new LinkedList<>();
    for(int i = arr.length-1; i >= 0 ; i--){
      if(arr[i]>max){
        max = arr[i];
        list.add(arr[i]);
      }
    }
    return list;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Size of the Array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i< n; i++){
      arr[i] = sc.nextInt();
    }
    List<Integer> list = leaders(arr);
    for(int num : list){
        System.out.print(num+" ");
    }
  }
}
