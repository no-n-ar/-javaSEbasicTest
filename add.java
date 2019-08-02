public class add{
	public static void main(String[] args){
		int a = 1;
		a = ++a;
		a = a++;
		a = a++ + ++a;
		System.out.println(a-- + ++a + a++ + a);
		System.out.println(a);
		
		
		int x = 3;
		int y = x++ + ++x + x * 10;
		System.out.println(x);
		System.out.println(y);
		
	}


}