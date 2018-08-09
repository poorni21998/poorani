import java.io.*;
import java.util.*;
class abc
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.print("positive");
        }
        else if(n<0)
        {
            System.out.print("negative");
        }
        else
        {
            System.out.print("zero");
        }
    
    }
}
