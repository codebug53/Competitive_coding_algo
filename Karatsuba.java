/*#Karatsuba Algorithm
A number x can be represented as X = a* 10^(n/2)+b
similarly another number can be represented by Y = c * 10^(n/2) + d
now x*y can be written as:
x*y = (ac*10^n)+(ad+bc)*10^n/2+bd

-> Algorithamically:
  1. find a*c
  2. find b*d
  3. find ((a+b)*(c+d))-ac-bd =(ad+bc)
  4. n = number of digits of the number

-> code: */

import java.util.*;
public class Karatsuba{
  private static long multiply(long x, long y){
    if(x<10 || y<10) return x*y;
    int len = Math.max((int)Math.floor(Math.log10(x))+1,(int)Math.floor(Math.log10(y))+1);
    long a = x/(long)Math.pow(10,len/2);
    long b = x%(long)Math.pow(10,len/2);
    long c = y/(long)Math.pow(10,len/2);
    long d = y%(long)Math.pow(10,len/2);
    long ac = multiply(a,c);
    long bd = multiply(b,d);
    long ad_bc = multiply(a+b, c+d)-ac-bd;
    long res = ac*(long)Math.pow(10, len) + (ad_bc)*(long)Math.pow(10,len/2) + bd;
    return res;
  }
    
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long x = sc.nextLong();
    long y = sc.nextLong();
    long res = multiply(x,y);
    System.out.print("The value of the product is: "+res);
  }
}
