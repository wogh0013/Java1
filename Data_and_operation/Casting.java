
public class Casting {
	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double) 1;
		System.out.println(b); // �Ǽ��� Ÿ�Կ� ������ ��Ƶ�, ����ϸ� �Ǽ��� ��µȴ�. �ս� x
		
		// int c = 1.1; // ������ Ÿ�Կ� �Ǽ��� ���� ���� ����. because �ս��� �߻��Ѵ�.
		double d = 1.1; // int d = 1.1; �� �ۼ����� ��, ���� �� ���� Ŀ���� �÷������� �ڵ���ȯ o
		int e = (int) 1.1; // ��������ȯ -> �ս��� �Ͼ (1.1 -> 1�� �Ǹ鼭 �Ҽ��� �� �κ��� �����)
		System.out.println(e); // 1
		
		// int to String (ex. 1 to String)
		// ���۸� - java int to string casting
		// String strI = Integer.toString(i);
		String f = Integer.toString(1);
		System.out.println(f); // ��µǴ� 1�� ������ �ƴ� ���ڿ�
		System.out.println(f.getClass()); // ���� f�� ������ Ÿ���� �˷��ִ� �޼ҵ�
	}
}
