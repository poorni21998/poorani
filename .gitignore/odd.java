import java.io.*;
import java.util.*;
class abc
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.print("even");
        }
        else if(n%2!=0)
        {
            System.out.print("odd");
        }
        else
        {
            System.out.print("invalid");
        }
    
    }
}
