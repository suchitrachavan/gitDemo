package javapractise;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Classbinary   {
	
	@Parameters({"URL"})
	public void logo2(String URL){
	
	String dd1 = "010101";
	int count0 = 0;
	int count1=0;
	int flag=1;
	int n=dd1.length();
	int cnt=0;
	for(int i=0;i<n;i++)
	{
		char var=dd1.charAt(i);
		if(var == '0')
		{
			count0=count0+1;
		}
		else
		{
			count1=count1+1;
		}
		if(count0==count1)
		{
			 flag = 0;
			 cnt++;
		}
		else
		{
			flag=1;
		}
	}
	
	if(flag==0)
	{
		System.out.println("equals"+cnt);
	}
	else
	{
		System.out.println("not equals"+cnt);
	}
	System.out.println(URL);
	}
	
	
}
