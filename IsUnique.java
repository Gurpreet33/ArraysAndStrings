//Implement an algorithm to check if all the characters in the string are unique.What if we cannot use additional data structure?

package ctci;

import java.util.*;


public class IsUnique {
	
	public static boolean func(String inp)
	{
		boolean[] temp=new boolean[128];
		
		int a;
		
		for(int i=0;i<inp.length();i++)
		{ a=inp.charAt(i);
		 if(temp[a]==false)
			 temp[a]=true;
		 else
			 return false;
			
		}
		
		return true;
		
	}
	
	
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String inp=sc.nextLine();
		
		boolean res=func(inp);
		
		System.out.println(res);
		sc.close();
	}

}
