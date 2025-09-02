/*we need to find the longest sequence of conseqeutive 1s after flipping the bit*/
import java.util.*;
public class FlippingBit{
  public static int longestSequence(int n){
    if(~n == 0) return Integer.BYTES*8;
    int currelen = 0;
    int prevlen = 0;
    int maxlen = 1;
    while(n!=0){
      if((n & 1) == 1){
        currLen++;
      }
      else{
        prevLen = ((n & 2) == 0) ? 0;currLen;
        currLen = 0; 
      }
      maxLen = Math.max(maxlen, prevlen+1+ currLen);
      n>>=1;
    }
    return maxLen;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int ans = longSequence(n);
    System.out.print(ans);
  }
}
