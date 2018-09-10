// Write a method to replace all spaces in a string with "%20";

package ctci;
import java.util.*;

public class URLify {

	public static String func(String s)
	{
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
	      if(s.charAt(i)==' ')
	      {
	    	  res=res.append("%20");
	    	  i++;
	      }
	      res=res.append(s.charAt(i));
	      
		 	}
		return res.toString();
	}
	
	
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		String s=sc.nextLine();
		
		String res=func(s);
		System.out.println(res);
		
		sc.close();
	}
	
}
