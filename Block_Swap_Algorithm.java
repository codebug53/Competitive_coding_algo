/*Block Swap Algorithm
  1. Start by checking if A!=B
  2. if true then check whether A<B
    -> if A<B got for Divide B into Bl(Bl = remaining except Br) and Br(Br=A)
    -> swap Br and A
    -> B = B-A
  3. if Flase:
    -> Divide A into Al(Al = remaining except Ar) and Ar(Ar = B)
    -> swap(Al, B)
    -> A = A-B
  4. at the swap A and B out of the loop for the final edge condition.*/

/*Example
  Initial array:
[1] [2] {3} {4} {5} {6} {7}

Iteration 1:
Condition: A < B (2 < 5)
Swapping Block A [0:2] with Block Br [5:7]
Before swap:
[1] [2] {6} {7}
After swap:
[6] [7] {1} {2}
Updated B: 3

Iteration 2:
Condition: A >= B (2 >= 3)
Swapping Block Al [0:3] with Block B [2:5]
Before swap:
[6] [7] {3} {4} {5}
After swap:
[4] [5] {3} {6} {7}
Updated A: -1, Updated startA: 3

Final swap of size 2 between blocks [3:5] and [2:4]
Before final swap:
[6] [7]
{3} {4}
After final swap:
[3] [4]
{6} {7}

Final rotated array:
[3, 4, 5, 6, 7, 1, 2]*/

import java.util.*;
public class Block_Swap_Algorithm{
  public static void swap(int a[], int A, int B, int r){
    for(int i =0; i< r; i++){
      a[A+i] = a[A+i]^a[B+i];
      a[B+i] = a[A+i]^a[B+i];
      a[A+i] = a[A+i] ^ a[B+i];
    }
  }
  public static void blockswap(int n, int a[], int r){
    if(r==0 || r == n) return;
    int A = r, B = n-r;
    while(A != B){
      if(A<B ){
        swap(a, r-A, r+B-A, A);
        B = B-A;
      }
      else{
        swap(a, r-A, r, B);
        A = A-B;
      }
    }
    swap(a, r-A, r,B);
    for(int i =0; i< a.length; i++){
      System.out.print(a[i]+" ");
    }
  }
  public static void main(String args[]){
    int a[] = {1,2,3,4,5,6,7};
    int r = 2;
    blockSwap(a.length, a, r);
    return;
  }
}
