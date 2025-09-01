import java.util.*;
public class swapTwoNibbles{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print((n & 0x0f)<<4 | (n&0xf0)>>4);
  }
}
