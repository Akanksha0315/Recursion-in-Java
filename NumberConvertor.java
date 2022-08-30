//Program to convert a number from decimal to binary, octal or hexadecimal
// make class name Number_Conversion
import java.util.Scanner; //importing Scanner class from the util package
public class NumberConvertor //start of class
{
  //converting decimal to binary, octal or hexadecimal.
  String convert(int n, int d)
  {      
    String arr[]={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
    if(n!=0) //checking the number
    {
      do
      {
        //Converting number
        return convert(n/d,d)+arr[n%d];
      }
      while(n!=0); 
    }
    else
    {
      //0 remains 0 regardless of base.
      return "0";
    }
  }//end of convert() method
  public static void main(String args[]) //start of main()
  {
    NumberConvertor obj=new NumberConvertor();
    Scanner sc=new Scanner(System.in);     //taking input.
    System.out.println("\n\nEnter a decimal number to convert.");
    int n=sc.nextInt();   
    System.out.println("Enter base- 2, 8 or 16 for binary, octal or hexadecimal respectively");
    int d=sc.nextInt();    
    //checking validity of input
    if((d==2)||(d==8)||(d==16))
    {            
      String b=obj.convert(n,d); //calling function to convert
      //printing result
      System.out.println("Converted Number: " +b);
    }
    else
    {
      //If user enters a base apart from 2,8 or 16
      System.out.println("Enter valid base.");
    }
  } //end of main()
} //end of class
/**VDT
Variable  DataType               Description
   n        int     stores the decimal number to be converted
   d        int        stores the base to be converted to
   b      String          stores the converted number
 *  
 */