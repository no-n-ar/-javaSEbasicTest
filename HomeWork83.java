import java.util.*;


public class HomeWork83{
	public static void main(String[] args){
		
		//work1();
		//aquare();   //work2
		//work3();
		//aquare2();   //work4
		//work5();
		//work6();
		//work7();
		//work8();
		//work9();
		//work10();
		//work11();
		//work12();
		//work13();
		
		work16();
	}
	
	
	//work1
	public static void work1(){
		int i = 1;
		int sum = 1;
		for(i = 1;i<=10;i++){
			 sum *= i;
		}
		System.out.println(sum);
	}
	
	//work2
	public static void aquare(){
		int i = 0;
		int j = 0;
		for(i=1;i<=5;i++){
			
			for(j=1;j<=5;j++){
				System.out.print('*');
				
			}
			System.out.println();
		}
	}
	
	//work3
	public static void work3(){
		int i = 1;
		int j = 0;
		int sum = 0;
		for(i = 1;i<=9;i++){
			for(j = 1;j<=i;j++){
				sum = i * j;
				System.out.print(j +"*"+ i +"="+ sum + "  ");
			}
			System.out.println();
		}
	}
	
	//work4
	public static void aquare2(){
		int i = 0;
		int j = 0;
		for(i=1;i<=10;i++){
			if(i>1 && i<10){
			
				for(j=1;j<=10;j++){
					if(j==1 || j ==10){
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}
			}else if(i == 1 || i == 10){
				for(j=1;j<=10;j++){
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}
	
	//work5
	public static void work5(){
		int n = 5;
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=2*n;j++){
				if(j==n-i+1){
					System.out.print("*****");
				}else if(j==n+i-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	//work6
	public static void work6(){
		byte[] arrayA = {1,7,9,11,13,15,17,19};
		byte[] arrayB = {2,4,6,8,10};
		byte[] arrayC = new byte[arrayA.length + arrayB.length];
		
		System.arraycopy(arrayA,0,arrayC,0,arrayA.length);
        System.arraycopy(arrayB,0,arrayC,arrayA.length,arrayB.length);
		Arrays.sort(arrayC);
        
        System.out.println(Arrays.toString(arrayA));
        System.out.println(Arrays.toString(arrayB));
        System.out.println(Arrays.toString(arrayC));
	}
	
	//work7
	public static void work7(){
		int x = 0,y = 0,z = 0;
		for(int i = 100;i<1000;i++) {
			x = i/100;
			y = (i%100)/10;
			z = (i%100)%10;
			if(x*x*x + y*y*y +z*z*z == i) {
				System.out.print(i+" ");
			}
		}

	}
	
	//work8
	public static void work8(){
		 for (int i = 1; i <= 1000; i++)
        {
            int sum=0;
            for (int j = 1; j < i; j++)
            {
            if(i%j==0)
            {
                sum+=j;
            }
                
            }
            if(i==sum)
            {
                System.out.println(i);
            }
        }
	}
	
	
	
	//work9
	public static void work9(){
		double height = 100;
		int i = 1;
		double sum = 0;
		for(i = 1;i<=10;i++){
			sum += height;
			height = height/2;
		}
		System.out.println(height);
		System.out.println(sum);
	}
	
	
	//work10
	public static void work10(){
		int i = 1;
		int sum = 0;
		for(i = 1;i<=100;i++){
			if(i%10 ==3){
				
			}else{
				sum += i;
			}
			
		}
		System.out.println(sum);
	}
	
	
	//work11 
	public static void work11(){
		int n = 10;
		if (n < 0) return;
        int[][] a = new int[n][n];
        for (int i = 0;i < n;i++) {
            
            for (int j = 0;j < i;j++) {
                if (j == 0 || j == n - 1) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
		
	}
	
	//work12
	public static void work12(){
		float sum=100,gongJiaGe=5f,muJiaGe=3f,xiaoJiaGe=1/3f;
        int gongGeShu=0,muGeShu=0,xiaoGeShu=0;
        for(gongGeShu=0;gongGeShu*5<100;gongGeShu++){
            for(muGeShu=0;muGeShu*3<100;muGeShu++){
                for(xiaoGeShu=0;xiaoGeShu<100;xiaoGeShu++){
                    int sum2=gongGeShu*15+muGeShu*9+xiaoGeShu;
                    if(sum2==300&&gongGeShu+muGeShu+xiaoGeShu==100){
                        System.out.println("公鸡"+gongGeShu+"母鸡"+muGeShu+"小鸡"+xiaoGeShu);
                    }
                }
                 
            }
        }
    
	}
	
	
	//work13
	public static void work13(){
		int i = 1;
		int num = 2;
		int time = 1;
		
		for(i= 1;i<=10;i++){
			num = num + num/2;
			
			System.out.println(3*time + "个月后有兔子" + num +"只");
			time++;
		}
	}
	
	//work15
	

	//work16
	public static void work16(){
		System.out.println("请输入一个四位数");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int a, aa, aaa, aaaa;
		a = number % 10;
		aa = number / 10 % 10;
		aaa = number / 100 % 10;
		aaaa = number / 1000;
		// 代替数字
		a = (a + 5) % 10;
		aa = (aa + 5) % 10;
		aaa = (aaa + 5) % 10;
		aaaa = (aaaa + 5) % 10;
		
		int result = a + aa*10 + aaa*100 + aaaa*1000;
		System.out.println("加密后的数为" + result);


	}
	
}

