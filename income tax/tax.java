package cp5;
import java.util.Scanner;
public class tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double sal,t=0;
System.out.println("enter your annual income:");
Scanner sc=new Scanner(System.in);
sal=sc.nextDouble();

if(sal>0&&sal<=180000)
	System.out.println("SLOT A NO TAX LIABILITY");
else
	if(sal>180000&&sal<=300000)
	{
		t=sal*0.10;
		System.out.println("SLOT B TAX LIABILITY:Rs."+t);
	}
	else
		if(sal>300000&&sal<=500000)
		{
			t=sal*0.20;
			System.out.println("SLOT C TAX LIABILITY:"+t);
		}
		else
			if(sal>500000&&sal<=1000000)
			{
				t=sal*0.30;
				System.out.println("SLOT D TAX LIABILITY:"+t);
	}
sc.close();
	}
}

