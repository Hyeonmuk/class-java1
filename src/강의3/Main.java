package 강의3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
	실습문제3_1();
	
}
	public static void 실습문제1_1 () {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int number = scan.nextInt();
		
		if(number<50) {
		System.out.println("50미만 입니다.");
		}
		
		if(number>49) {
		System.out.println("50이상 입니다.");
		}
	}
	
	public static void 실습문제1_2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		String input = scan.nextLine();
		
		int number = Integer.parseInt(input);
		
		if(number % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아닙니다.");
		}
	}
	
	public static void 실습문제1_3() {
		Scanner scan = new Scanner(System.in);
		System.out.println("성적을 입력하세요");
		int number = scan.nextInt();
		
		if(number >= 90)
			System.out.println("A학점 입니다.");
		else if(number >= 80)
			System.out.println("B학점 입니다.");
		else if(number >= 70)
			System.out.println("C학점 입니다.");
		else if(number >= 60)
			System.out.println("D학점 입니다.");
		else
			System.out.println("F학점 입니다.");
		
	}
	
	public static void 실습문제1_4() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		
		int max = number1;
		
		if(number2>max) {
			max = number2;
		}
		if(number3>max) {
			max = number3;
		}
			
		System.out.println("입력한 3개의 정수 중 최대값은 "+max+"입니다.");
	}
	
	public static void 실습문제2_1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("월을 입력하세요:");
		int month = scan.nextInt();
		
		switch(month)
		{
		case 3,4,5:
		System.out.println("봄입니다.");
		break;
		case 6,7,8:
		System.out.println("여름입니다.");
		break;
		case 9,10,11:
		System.out.println("가을입니다.");
		break;
		case 12,1,2:
		System.out.println("겨울입니다.");
		break;
		}
		
	}
	
	public static void 실습문제2_2() {
		int computer = (int)(Math.random()*3);
	    String[] choices = {"가위", "바위", "보"};

	    Scanner scan = new Scanner(System.in);
	    System.out.println("가위(1) 바위(2) 보(3) 선택하세요");
	    int user = scan.nextInt();

	    switch (user) {
	        case 1:
	        	  System.out.println("당신은 가위입니다.");
		          System.out.println("컴퓨터는 " + choices[computer] + "입니다.");
	            if (computer == 0) {
	                System.out.println("비겼습니다.");
	            } else if (computer == 1) {
	                System.out.println("컴퓨터가 이겼습니다.");
	            } else {
	                System.out.println("당신이 이겼습니다!");
	            }
	          
	            break;
	        case 2:
	        	System.out.println("당신은 바위입니다.");
	            System.out.println("컴퓨터는 " + choices[computer] + "입니다.");
	            if (computer == 0) {
	                System.out.println("당신이 이겼습니다!");
	            } else if (computer == 1) {
	                System.out.println("비겼습니다.");
	            } else {
	                System.out.println("컴퓨터가 이겼습니다.");
	            }
	        
	            break;
	        case 3:
	        	 System.out.println("당신은 보입니다.");
		         System.out.println("컴퓨터는 " + choices[computer] + "입니다.");
	            if (computer == 0) {
	                System.out.println("컴퓨터가 이겼습니다.");
	            } else if (computer == 1) {
	                System.out.println("당신이 이겼습니다!");
	            } else {
	                System.out.println("비겼습니다.");
	            }  
	            break;
	        default:
	            System.out.println("잘못된 입력입니다.");
	    }
	}
	
	public static void 실습문제3_1() {
	Scanner scan = new Scanner(System.in);
	System.out.println("정수를 입력하세요");
	int number = scan.nextInt();
	
	if(number<0)
		System.out.println("음수입니다");
	else if(number>0)
		System.out.println("양수입니다");
	else
		System.out.println("0입니다");
	
	}
	
	public static void 실습문제3_2() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 3개를 입력하세요");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		
		int middle;
		
		if(num1 >=)
	}
	
	
}
