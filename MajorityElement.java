/*This is the optimized approach
  1. Initialize a HashMap to count the frequency
  2. iterate through the HashMap to get the values for the keys 
  3. If a value exists such that it is more than half of the size of the array then print it
  4. If such number doesn't exist print a appropriate message
*/

import java.util.*;
public class MajorityElement{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for(int i=0; i< n ; i++){
      arr[i] = sc.nextInt();
    }

    for(int num : arr){
      map.put(num, map.getOrDefault(num,0)+1);
    }

    for(int key: map.keySet()){
      int temp = map.get(key);
      if(temp>n/2) {
          System.out.print("The majority element is: "+ key);
          return;
      }  
    }
    System.out.print("No such element exist");
  }
}


/*This is another approach where you can go for find the element with highest frequency
  then iterating through the array to find the frequency of that array and checking if the frequency is more than half of the size or not*/
/*import java.util.Scanner;
public class MajorityElement{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0; i<n; i++){
      arr[i] = sc.nextInt();
    }
    int count =0; 
    int ele =-1;
    for(int i=0; i< n; i++){
      if(c == 0){
        ele = a[i]; 
        c++;
      }
      else if(a[i] == ele) c++;
      else c;
    }
    c =0; 
    for(int i=0; i< n; i++){
      if(a[i] == ele) c++;
    }
    if(c> n/2) System.out.print(ele);
    else System.out.print(-1);
  }
}*/
