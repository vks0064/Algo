package cp5;
import java.util.Scanner;
public class marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double e,h,m;
Scanner sc =new Scanner(System.in);
System.out.println("enter english marks");
e=sc.nextDouble();
System.out.println("enter hindi marks");
h=sc.nextDouble();
System.out.println("enter math marks");
m=sc.nextDouble();

if(e>=60.00&&h>=60.00&&m>=60.00)
	System.out.println("RESULT : passed");
else
	if(e>=60.00&&h>=60.00&&m<60||e>=60&&h<60&&m>=60||e<60&&h>=60&&m>=60)
		System.out.println("RESULT : PROMOTED");
	else
		if(e>=60||h>=60||m>=60&&e<60||h<60||m<60)
			System.out.println("FAILED");

	}

}
