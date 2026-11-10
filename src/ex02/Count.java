package ex02;

public class Count {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("오늘도 화이팅!");
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("숫자: " + i);
			Thread.sleep(1000);
		}

	}

}
