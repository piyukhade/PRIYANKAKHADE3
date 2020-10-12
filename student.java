import java.util.Scanner;
public class student
{
	public static void main(String[] args)
	{
		int m1,m2,m3,m4,m5,total;
		float percentage;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the marks of 5 subjects:");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		m4=sc.nextInt();
		m5=sc.nextInt();
		
		total=m1+m2+m3+m4+m5;
		percentage=(total/5);
		
		if(percentage>=75)
		{
			System.out.println("You have "+percentage+"% with A grade");
		}
		else if(percentage>=50)
		{
			System.out.println("You have "+percentage+"% with B grade");
		}
		else if(percentage>=35)
		{
			System.out.println("You have "+percentage+"% with C grade");
		}
		else
		{
			System.out.println("You are failed with "+percentage+"%");
		}
	}
}
