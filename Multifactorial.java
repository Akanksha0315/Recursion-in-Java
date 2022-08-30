/* 
 * Write a program to find the multifactorial of a number. 
 * 
 * Multifactiorial is just like factorial but instead of decreasing 
 * the subsequent number by one, in multifactorial it is decreased by
 * a given factor. Eg: Multifactorial of 6 with factor 2 is 48 i.e. 6*4*2
 */

import java.io.*; //importing io package
class Multifactorial //start of class
{
    static int factorial=1; //declaring variables
    
    static int mFact(int num, int fact)
    {
        if (num>0)
        {
            factorial=factorial*num; //calculating multifactorial
            return mFact(num-fact,fact); //recursive function calls itself
        }
        else
        {
            return factorial; //return the multifactorial
        }
    }
    
    public static void main(String args[])throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("\n\nEnter number."); //taking input
        int n= Integer.parseInt(br.readLine());
        System.out.println("Enter factor."); //taking input
        int f= Integer.parseInt(br.readLine());
        //recursive function 'fact' is called
        int val=mFact(n,f); 
        //Printing result
        System.out.println("Multifactorial of "+n+" with factor "+f+" is "+val);
    } 
}//end of class


/*
 *           Variable Description Table
 * 
 * S.No.    Variable Name        Data Type              Description
 *  1             m                 int         stores no. of rows & columns of matrix
 *  2           A[][]               int         stores integer array
 *  3             p                 int         flag variable
 *  4             q                 int         flag variable
 *  5             i                 int         loop control variable
 *  6             j                 int         loop control variable
 *  
 */
