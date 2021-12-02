import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;

//인스턴스를 사용하는 이유는 재사용성 !!!!
//일회성 작업일 때 : 인스턴스를 생성하지 않고, 클래스.메서드로 바로 접근
//여러 번 사용할 때 : 인스턴스를 생성하여 접근

public class InstanceApp {
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
	}
}
