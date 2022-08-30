/* Program to solve the tower of hanoi for a number of
 * discs inputted by the user  */
import java.util.Stack; //importing class Stack from util package
import java.util.*; //importing the util package
public class TowerOfHanoi //start of class
{
  Stack tower[]; //declaring instance variable
  //declaring static variable
  public static int ndiscs;
  TowerOfHanoi() //constructor
  {
    tower=new Stack[3]; //initialising
    //creating new stacks in each index of tower[]
    tower[0]=new Stack();
    tower[1]=new Stack();  
    tower[2]=new Stack();
  }//end of constructor
  public void toh(int n) 
  {    
    for(int d=n;d>0;d--) 
    {
      tower[0].push(d); //entering discs in tower
    }
    display(); //calling the display() function
    move(n,0,1,2); //calling the move() function
  }//endof toh() method
  public void move(int n,int a, int b, int c)
  {
    //solving the tower of hanoi
    if(n>0)
    {
      move(n-1,a,c,b); //recursively calling move() again
      Object d=tower[a].pop();
      tower[c].push(d); //moving discs
      display();
      move(n-1,b,a,c); //recursively calling move() again
     }
  }//end of move method
  public void display() //printing the tower
  {
    System.out.println("  A  |  B  |  C  ");
    System.out.println("--------------------");
    for(int i=ndiscs-1;i>=0;i--)
    {
      //declaring and initialising variables
      String d1=" ",d2=" " , d3=" ";  
      try //explicitly handling an exception
      {
        d1=String.valueOf(tower[0].get(i));
      }
      catch(Exception e){}
      try //explicitly handling an exception
      {
        d2=String.valueOf(tower[1].get(i));
      }
      catch(Exception e){}
      try //explicitly handling an exception
      {
        d3=String.valueOf(tower[2].get(i));
      }
      catch(Exception e){}
      //printing discs
       System.out.println("  "+d1+"  |  "+d2+"  |  "+d3); 
    }
    System.out.println("\n");
  }// end of display() method
  public static void main(String args[]) //start of main()
  {
    Scanner sc=new Scanner(System.in);
    //taking input
    System.out.print("Enter the number of discs: ");
    int no=sc.nextInt(); 
    //initialising variable
    ndiscs=no;
    //creating object of the class
    TowerOfHanoi st=new TowerOfHanoi();
    st.toh(no); //calling function toh()
  } //end of main()
} //end of class
/*
 *               Variable Description Table    
 * S.No.   Variable Name     Data Type          Description  
 *  1         tower[]          Stack       stores all three towers
 *  2         ndiscs           int         stores the no. of discs
 *  3           n              int         actual parameter that has no. of discs
 *  4           d              int         loop control variable
 *  5           a              int         represents tower 1
 *  6           b              int         represents tower 2
 *  7           c              int         represents tower 3
 *  8           i              int         loop control variable
 *  9          d1             String       stores one of the discs
 *  10         d2             String       stores one of the discs
 *  11         d3             String       stores one of the discs
 *  12         no              int         stores the no. of discs
 */