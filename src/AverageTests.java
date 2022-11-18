import java.util.Scanner;

public class AverageTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double n1,n2,n3, average=0;
	
	Scanner recebe = new Scanner(System.in);
	
	System.out.println("Type note 1");
	n1=recebe.nextDouble();
	System.out.println("Type note 2");
	n2=recebe.nextDouble();
	System.out.println("Type note 3");
	n3=recebe.nextDouble();
	
	if((n1>n2)&&(n1>n3))
	{ 
		average = ((n1*4)+(n2*3)+(n3*3))/10;
	}
	else if ((n2>n1)&&(n2>n3))
	{
		average = ((n2*4)+(n1*3)+(n3*3))/10;
	}
	else {
		average = ((n3*4)+(n2*3)+(n1*3))/10;
	}
		System.out.println("test average is : "+ average );
	
	}
}
