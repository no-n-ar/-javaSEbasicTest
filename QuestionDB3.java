import java.util.*;

public class QuestionDB3{
	public static void main(String[] args){
		
		//practice1();
		//practice2();
		//practice3();
		//practice4();
		work1();
	}
	
	//练习一
	public static void practice1(){
		Scanner sca = new Scanner(System.in);
		int x = sca.nextInt();
		if(x%2==0){
			System.out.println("输入的值是偶数");
		}
		System.out.println(x);
	}
	
	//练习二
	public static void practice2(){
		Random random = new Random();
		int x = random.nextInt(60);
		int y = random.nextInt(60);
		if(x>y){
			System.out.println(x);
		}else if(x<y){
			System.out.println(y);
		}else{
			System.out.println("这两数等了");
		}
	}
	
	//练习三
	public static void practice3(){
		int i = 1;
		int sum = 0;
		while(i <= 100){
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		while(i<100){
			if(i%2==1){
				sum += i;
				i++;
			}else{
				i++;
			}
			
		}
		System.out.println(sum);
		
		do{
			sum += i;
			i++;
		}while(i<=100);
		System.out.println(sum);
	}
	
	//练习四
	public static void practice4(){
		int i = 1;
		int sum = 0;
		for(i = 1;i<=10;i++){
			 sum += i;
		}
		System.out.println(sum);
	}
	
	//课后作业
	//work1
	public static void work1(){
		Scanner sca = new Scanner(System.in);
		double x = sca.nextInt();
		double price = 1000;
		int a = 100000;
		int b = 200000;
		int c = 400000;
		int d = 600000;
		int e = 1000000;
		if(x<=a){
			price = price + price*10/100;
		}else if(x>a && x<=b){
			price = price + (price-a)*7.5/100 + a*10/100;
		}else if(x>b && x<=c){
			price = price + a*10/100 + (b-a)*7.5/100 +(x-b)*5/100;
		}else if(x>c && x<=d){
			price = price + a*10/100 + (b-a)*7.5/100 + (c-b)*5/100 + (d-c)*3/100;
		}else if(x>d && x<=e){
			price = price + a*10/100 + (b-a)*7.5/100 + (c-b)*5/100 + (d-c)*3/100+1.5/100;
		}else{
			price = price + a*10/100 + (b-a)*7.5/100 + (c-b)*5/100 + (d-c)*3/100+1.5/100 + (e-d)*1/100;
		}
		System.out.println(price);
	}
		
	
	
}