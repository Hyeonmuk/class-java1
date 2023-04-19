package 강의4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
	실습문제1_6();
	
}
	public static void 실습문제1_1 () {
		
		for(int i=0; i<=5; i++)
		{		
			System.out.print(i);
		}
	
	System.out.println();
	
		for(int j=1; j<=5; j++)
		{
		System.out.println(j);
		}
	
	}
	
	
	public static void 실습문제1_2 () {
		
		int sum = 0;
		
		for(int i=1; i<=10; i++)
		{
		sum += i;
		System.out.println("1부터 " + i + "까지의 합: "+sum);
		}
	
	}
	
	public static void 실습문제1_3() {
	
		for (int i = 0; i <= 10; i++)
		{
		    System.out.println(i + " " + (10 - i));
		}

	}
	
	public static void 실습문제1_4() {
		
		for(int i = 0; i<=4; i++)
		{	
			for(int j = 0; j <= i; j++)
			{
			System.out.print("*");
			}
			System.out.println();
		}
	
	
	}
	
	public static void 실습문제1_5( ) {
		
		for (int i = 2; i <= 9; i++) {
		    for (int j = 1; j <= 9; j++) {
		        System.out.println(i + " x " + j + " = " + (i * j) + "\t");
		    }
		    System.out.println();
		}

	}
	
	public static void 실습문제1_6() {
		
		for (int i = 1; i <= 5; i++) {
		    for (int j = 1; j <= 9; j++) {
		        if (j == i || j == 10 - i) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		}

		for (int i = 4; i >= 1; i--) {
		    for (int j = 1; j <= 9; j++) {
		        if (j == i || j == 10 - i) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.println();
		   
		}

}
	
	public static void 실습문제1_6_2() {
		final int MAX = 10;
		
			for(int i = 0; i<=MAX; i++)
			{
				for(int j = 0 ; j<=MAX; j++)
				{
					if(i==j \\)
				}
			}
	}
}
