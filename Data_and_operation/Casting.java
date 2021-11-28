
public class Casting {
	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b); // 실수형 타입에 정수를 담아도, 출력하면 실수로 출력된다. 손실 x
		
		// int c = 1.1; // 정수형 타입에 실수를 담을 수는 없다. because 손실이 발생한다.
		double d = 1.1; // int d = 1.1; 로 작성했을 때, 빨간 줄 위에 커서를 올려놓으면 자동변환 o
		int e = (int) 1.1; // 강제형변환 -> 손실이 일어남 (1.1 -> 1로 되면서 소숫점 밑 부분이 사라짐)
		System.out.println(e); // 1
		
		// int to String (ex. 1 to String)
		// 구글링 - java int to string casting
		// String strI = Integer.toString(i);
		String f = Integer.toString(1);
		System.out.println(f); // 출력되는 1은 정수가 아닌 문자열
		System.out.println(f.getClass()); // 변수 f의 데이터 타입을 알려주는 메소드
	}
}
