package com.text.project.collections;

import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int choose=0;
        Scanner o=new Scanner(System.in);
        
        collectionss object=new collectionss();
        object.adddata();
        while(true) 
        {
        	System.out.println("-----------------");
        	System.out.print(" 0:exit\n 1:insert data\n 2:delete data\n 3:search data\n 4:print data\n ");
        	System.out.println("-----------------");
        	System.out.print("choose the numer= ");
        	choose=o.nextInt();
        	if(choose==0)
        		break;
        	else if(choose==1)
        	{
        		System.out.print("enter a value= ");
        		object.insert(o.nextInt());
        	}
        	else if(choose==2)
        	{
        		System.out.print("enter an element to delete= ");
        		object.delete(o.nextInt());
        	}
        	else if(choose==3)
        	{
        		System.out.print("enter a element to search= ");
        		int position=object.search(o.nextInt());
        		if(position==-1)
        			System.out.println("element is not present");
        		else
        			System.out.println("element is at position "+position);
        	}
        	else if(choose==4)
        	{
        		object.print();
        	}
        	else
        	{
        		System.out.println("choose correct option");
        	}
        }
        System.out.println("Thank you");
    }
}
