package ctci;
import java.util.*;

public class OneEdit {
	
	public static boolean func(String s1,String s2)
	{
		int len1=s1.length();
		int len2=s2.length();
		if((len1-len2)>1 || (len1-len2)<-1)
		return false;
		
		boolean res=false;
		if(len1==len2)
		res= samlen(s1,s2);	
		
		if(len1>len2)
			res= difflen(s1,s2);
		
		if(len1<len2)
			res= difflen(s2,s1);
		
		return res;
		
		
	}
	
	
	public static boolean samlen(String s1,String s2)
	{   boolean flag=false;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(i))
				continue;
			else if(s1.charAt(i)!=s2.charAt(i) && flag==false)
				flag=true;
			else if(s1.charAt(i)!=s2.charAt(i) && flag==true)
				return false;
		}
		if(flag==false)
			return false;
		return true;
	}
	
	public static boolean difflen(String s1,String s2)
	{   boolean flag=false;
	    int j=0;
		for(int i=0;i<s2.length();)
		{
		if(s1.charAt(j++)==s2.charAt(i++))
			continue;
		else if(s1.charAt(j)!=s2.charAt(i) && flag==false)
			{flag=true;
			 j++;
			}
		else if(s1.charAt(j)!=s2.charAt(i) && flag==true)
			return false;
		}
		if(j==s2.length()&&flag==true)
			return false;
		return true;
	  	
	}
	
	
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s1=sc.nextLine();
      String s2=sc.nextLine();
      
      boolean res=func(s1,s2);
      System.out.println(res);
      
      sc.close();

	}

}
