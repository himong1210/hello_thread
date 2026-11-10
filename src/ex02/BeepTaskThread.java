package ex02;

import java.awt.Toolkit;

// Runnable 인터페이스를 이용한
// Thread 클래스 만들기
class ShowTask implements Runnable {

	@Override
	public void run() {
		for (var i = 0; i < 3; i++) {
			System.out.println("탕");
			try {
				//0.5초 쉬어감
				Thread.sleep(500);
			}catch (InterruptedException ie) {
				System.out.println("출력 중단됨!");
				return;
			}
		}
		
	}

}

class BeepTask implements Runnable {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (var i = 0; i < 3; i++) {
			toolkit.beep();
			System.out.println("삑");
			try {
				Thread.sleep(500);
			}catch (InterruptedException ie) {
				System.out.println("소리 중단됨!");
				return;
			}
		}
		
	}

}

// main class BeepTaskThread
public class BeepTaskThread {
	public static void main(String[] args) {
		// Runnable 부모가 가진 형식으로 형식 변환
		// 부모가 가진 능력만 쓸 수 있음
		// Runnable은 run()메소드만 가지고 있으므로
		// run()만 호출 가능
		// 1. ShowTask 객체 생성하여 부모 형식으로 고침
		Runnable task1 = new ShowTask();
		// 2. 관례상 run()는 직접 호출 금지.
		//    따라서 start()가 필요.
		//    그런데 Runnalbe은 start()함수가 없음
		// 3. 단짝친구 Thread의 start() 이용
		Thread thread1 = new Thread(task1);
		thread1.start();
		
		Runnable task2 = new BeepTask();
		Thread thread2 = new Thread(task2);
		thread2.start();
	}
}
