package ctci;
import java.util.*;

public class PalindromePermutation {

	   public static boolean func(String inp)
	   {
		   int[] temp=new int[Character.getNumericValue('z')- Character.getNumericValue('a')+1];
		   
		   int val;
		   
		   for(int i=0;i<inp.length();i++)
		   { val=inp.charAt(i);
		   	 if(inp.charAt(i)==' ')
		   		 continue;
		    
		     if(val>=65&&val<=90)
		    	 val=val+32;
		     if(temp[val-97]==0)
		     {
		    	 temp[val-97]++;
		     }
		     else
		    	 temp[val-97]--;
			   
			   
		   }
		   boolean flag=false;
		   for(int i=0;i<temp.length;i++)
		   {
			   
			   if(temp[i]==0)
				   continue;
			   else if(temp[i]>0 && flag==false)
				   flag=true;
			   else if(temp[i]>0 && flag==true)
				   return false;
		   }
		   return true;
		   
	   }
	
	
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inp=sc.nextLine();
		
		boolean res=func(inp);
		System.out.println(res);
		
		sc.close();

	}

}
