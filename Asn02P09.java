import java.util.*; 
 
class Asn02P09
{ 
           
    static String leftrotate(String str, int a) 
    { 
            String ans = str.substring(a) + str.substring(0, a); 
            return ans; 
    } 
   
    public static void main(String args[]) 
    { 
    	System.out.println("Enter a string");
    	Scanner read=new Scanner(System.in);
      String str1 = read.nextLine(); 
      System.out.println("enter the Numeber to rotate string:");
      int n=read.nextInt();
      System.out.println(leftrotate(str1, n)); 
    } 
} 
  
