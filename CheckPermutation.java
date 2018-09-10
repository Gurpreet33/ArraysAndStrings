//Given two strings, write an algorithm to check if one is permutation of other.

package ctci;
import java.util.*;


public class CheckPermutation {
	
	public static boolean func(String s1,String s2)
	{   if(s1.length()!=s2.length())
		return false;
		
		int[] temp=new int[128];
		int a,b;
		
		for(int i=0;i<s1.length();i++)
		{ a=s1.charAt(i);
		  temp[a]++;	
		  b=s2.charAt(i);
		  temp[b]--;
		}
		for(int i=0;i<128;i++)
		{
			if(temp[i]!=0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		boolean res=func(s1,s2);
		System.out.println(res);
		sc.close();
	}
	
}
