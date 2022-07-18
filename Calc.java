package arithmeticcalc;
import java.util.Scanner;
public class Calc {
	public static void main(String[] args) {
		double a;
		double b;
		double result;
		char operator;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		System.out.println("Enter another number");
		b=sc.nextInt();
		System.out.println("Enter the operators (+,-,*,%)");
		operator = sc.next().charAt(0);
		switch(operator) {
		case '+':
			result= a+b;
			System.out.println(a + "+"+b + "= " +result );
			break;
		case '-' :
			result = a-b;
			System.out.println(a+ "-"+ b+"="+result);
			break;
		case '*' :
			result = a*b;
			System.out.println(a+ "*"+ b+"="+result);
			break;
		case '/' :
			result = a/b;
			System.out.println(a+ "/"+ b+"="+result);
			break;
			default :
				System.out.println("Invalid operator");
		}
	}

}
