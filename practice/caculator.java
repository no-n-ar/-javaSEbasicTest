import java.util.*;

public class caculator{
	public static void main(String[] args){
	    Scanner sc1 = new Scanner(System.in);
		//Scanner sc2 = new Scanner(System.in);
		//Scanner sc3 = new Scanner(System.in);
		//Scanner sc4 = new Scanner(System.in);
		System.out.println(sum(sc1.nextInt(),sc2.nextInt(),sc3.nextInt(),sc4.nextInt()));
		//System.out.println(sum(21,30,50,0));
		System.out.println(minus(60,50));
		System.out.println(multiply(6,5));
		System.out.println(divide(60,5));
	}
	
	public static double sum(double num1,double num2,double num3,double num4){
		double sumResult = num1 + num2 + num3 + num4;
		return sumResult;
	}
	
	public static double minus(double num1,double num2){
		double minusResult = num1 - num2;
		return minusResult;
	}
	
	public static double multiply(double num1,double num2){
		double minusResult = num1 * num2;
		return minusResult;
	}
	
	public static double divide(double num1,double num2){
		double minusResult = num1 / num2;
		return minusResult;
	}
}