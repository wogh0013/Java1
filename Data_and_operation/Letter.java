
public class Letter {

	public static void main(String[] args) {
		
		// 변수를 활용하면 replace보다 간편하게 바꿀 수 있다. 변수만 바꿔도 이름 부분을 쉽게 변경 o
		String name = "jaeho";
		System.out.println("Hello, " + name + " ... " + name + " ... bye");
		
		// 누가 봐도 코드의 의미를 파악할 수 있게 작성하는 것이 중요하다 (클린코드) 
		double VAT = 10.0;
		System.out.println(VAT); // 누가 봐도 부가가치세를 의미하는 것을 알 수 있따.
	}

}
