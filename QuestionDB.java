import java.util.*;

public class QuestionDB{
	public static void main(String[] args){
		
		practiceFour();
		parcticeFive();
		afterClassWork1();
		afterClassWork2();
	}
	
	//练习四
	public static void practiceFour(){
		int x = 2;
		int y = 1;
		boolean z = (x != 2 && y == y++);
		System.out.println(z);    //false
		System.out.println("y="+y);    //y=1
	}
	
	//练习五
	public static void parcticeFive(){
		int x = 1;
		int y = 2;
		int z = 3;
		System.out.println(y += z--/++x);  //3
	}
	
	//课后作业1
	public static void afterClassWork1(){
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入a的值");
		int a = sca.nextInt();
		System.out.println("请输入b的值");
		int b = sca.nextInt();
		int c = 0;
		
		c = a;
		a = b;
		b = c;
		System.out.println(a);
		System.out.println(b);
	}
	
	//课后作业2
	public static void afterClassWork2(){
		Scanner sca = new Scanner(System.in);
		int i = sca.nextInt();
		int x = i/100;
		int y = (i/10)%10;
		int z = i%10%10;
		System.out.println(x + y + z);
	}
	
	
}