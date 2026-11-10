package ex01;

public class TwoWorkerDemo {

	public static void main(String[] args) {
		//첫번째 작업 흐름 객체 생성
		NumbersWorker numberWork = new NumbersWorker();
		//두번째 작업 흐름 객체 생성
		TextWorker textWork = new TextWorker();
		
		//두 작업 흐름이 실행되었나요?
		//객체가 생성될 때 자동 호출되는 생성자만 유일 자동실행
		//내가 run()을 불러야 한다. 이것은 권장하지 X.
		//위임 start()
		numberWork.start();  //start => run을 대신 실행
		textWork.start();
		
		//작업흐름은 현재 3개 = 메인 + numberWork + textWork

	}

}

// 첫번째 NumberWorker
class NumbersWorker extends Thread{
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("숫자: " + i );
		}
	}
}

// 두번째 TextWorker
class TextWorker extends Thread{
	public void run() {
		
	}
}