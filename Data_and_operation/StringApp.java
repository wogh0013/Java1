
public class StringApp {

	public static void main(String[] args) {
		System.out.println("Hello World"); // String (문자열 -> 큰 따옴표)
		System.out.println('H'); // Character (한 글자 -> 작은 따옴표)
		System.out.println("H"); // 큰 따옴표로 하면 한 글자라도 문자열 !
		
		System.out.println("Hello "
				+ "World");
		
		//new line
		System.out.println("Hello \nWorld");
		//escape (역슬래시를 통해서 뒤에 오는 임무를 일시적으로 해방시킨다)
		System.out.println("Hello \"World\""); // Hello "World"
		            // 역슬래시 뒤에 오는 따옴표는 일반 문자열이 된다. \"
		
	}

}
