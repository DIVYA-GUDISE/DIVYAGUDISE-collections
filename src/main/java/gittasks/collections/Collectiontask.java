package gittasks.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class CollectionOperation
{
private Scanner s;

public void method(ArrayList<Integer> list)
    {
    s = new Scanner(System.in);
    while(true)
    {
        System.out.println("Menu");
        System.out.println("1.Fetch(from the particular position):");
        System.out.println("2.Add:");
        System.out.println("3.Remove:");
        System.out.println("4.Display:");
        System.out.println("5.Exit from the loop");
        System.out.print("Enter your choice:");
        int ch=s.nextInt();
        if(ch==1)
        {
            System.out.print("Enter the index from 0 to "+list.size()+":");
            int m=s.nextInt();
            System.out.println("The value at the position "+m+" is : "+list.get(m));
        }
        if(ch==2)
        {
            System.out.print("Enter the element to add to the array list:");
            int m=s.nextInt();
            list.add(m);
        }
        if(ch==3)
        {
            System.out.print("Enter the index from 0 to "+list.size()+":");
            int m=s.nextInt();
            int x=list.get(m);
            System.out.println("The value removed from the array list is : "+x);
            list.remove(m);
        }
        if(ch==4)
        {
            System.out.println("The array list is: "+list);
        }
        if(ch==5)
        {
            System.out.println("----exit----");
            System.exit(0);
        }
    }
    }
}
public class Collectiontask
{
public static void main(String args[])
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(10,1,20,2,30,3,40,4,50,5));
        CollectionOperation c=new CollectionOperation();
        c.method(list1);
    }
}
