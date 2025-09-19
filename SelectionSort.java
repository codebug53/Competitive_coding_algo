//selection sort
import java.util.*;
public class SelectionSort{
  public stativ void selectionsSort(int a[] , int n){
    for(int i =0; i< n; i++){
      int minInd = i;
      for(int j = i+1; j< n; j++){
        if(a[j] < a[minInd]){
          minInd = j;
        }
      }
      int temp  = a[i];
      a[i] = a[minInd];
      a[minInd]= temp;
    }
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i  =0 ; i< n ; i++){
      a[i] = sc.nextInt();
    }
    selectionsSort(a, n);
    for(int num : a){
      System.out.print(num+" ");
    }
  }
}
