/*Move hyphens to the beginning of the string:
algorithm:
  1. take two empty strings
  2. iterate through the string and segregate hyphens and the word
  3. at the end concatenate the string
*/
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String s1 = "";
    String s2 = "";
    for(int i =0; i < s.length; i++){
      if(s.chartAt(i) == '-')
      s1+='-';
      else s2+= s.charAt(i);
    }
    System.out.print(s1+s2);
  }
}
