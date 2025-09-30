/*josephus trap
given n=7, and k =3
given the 1st array: [a, b, c*, d, e, f, g] remove the first third element;

after first iteration: [d, e, f*, g, a, b]
rotate it by three index then remove the third element iteratively do the same thing until only one person is alive and return the name of that person*/
// the recursive step formula to directly arrive at the conclusion is f(n) = (f(n-1, k)+k)%n;

import java.util.*;
public class josephus_trap{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int char[]  c= new char[n];
    for(int i =0; i< n; i++){
      c[i]= sc.next().charAt(0);
    }
    int res = fun(n,k);
    System.out.print(c[res]);
  }
  public sattic int fun(int n, int k){
    if(n==1) return 0;
    return (fun(n-1, k)+k)%n;
  }
}
