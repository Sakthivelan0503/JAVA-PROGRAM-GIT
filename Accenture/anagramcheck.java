import java.util.*;
class anagramcheck{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    String num1=sc.next();
    String num2 = sc.next();
    if(checkAnagram(num1,num2))
    {
      System.out.println("Anagram");
    }else{
      System.out.println("Not Anagram");
    }
  }
  public static boolean checkAnagram(String num1,String num2)
  {
    if(num1.length() != num2.length())
    {
      return false;
    }
    char[] arr1 = num1.toCharArray();
    char[] arr2 = num2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1,arr2);
  }
}
    