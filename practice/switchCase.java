import java.util.*;

public class switchCase{
	public static void main(String[] args){

		//function1();
		//function2();
		//function3();
	}
	
	
	public static void function1(){
		String str = "692116851128";
		int old = 0;
		int even = 0;
		for(int i = 0;i<str.length();i++){
			if(i%2 == 0){
				old +=str.charAt(i)-'0';
			}else{
				even +=str.charAt(i)-'0';
			}
		}
		System.out.println(old);
		System.out.println(even);
		
		int cc = 0;
		cc = old + even * 3;
		System.out.println(cc);
		
	}
	
	
	public static void function2(){
		int i = 1;
		boolean b = 3 + 4 > 4 || 5 != 6 && 7 > 8 + ++i;
		System.out.println(b);
	}
	
	public static void function3(){
		int score = 95;
		String level = null;
		switch(score/10){
		    case 10:level = "优秀";
			break;
		    case 9:level = "良好";
			break;
			default:level = "不及格";
		}
		System.out.println(level);
	}
	
	
	
}