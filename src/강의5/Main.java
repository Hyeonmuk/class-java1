package 강의5;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
	실습문제1_2();
	
}
	public static void 실습문제1_1 () {
		
		int[] number = new int[5];
		int sum = 0;
		
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		number[3] = 40;
		number[4] = 50;
		
		for(int i : number) {
			sum += i;
			System.out.println(sum);
		}
		
		double average = (double) sum / number.length;
	    System.out.println("평균: " + average);
	}
	
	public static void 실습문제1_2 () {
		
		int[] arr = {10, 5, 30, 20, 50, 40, 25, 15, 35, 45};
	    int max = arr[0];
	    int min = arr[0];
	    for (int i = 1; i < arr.length; i++) {
	        if (arr[i] > max) {
	            max = arr[i];
	        }
	        if (arr[i] < min) {
	            min = arr[i];
	        }
	    }
	    System.out.println("최대값: " + max);
	    System.out.println("최소값: " + min);
	}
	
	public static void 실습문제1_3 () {
		
	}
	
}
	