
public class Casting {
	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1;
		double b2 = (double)1;
		System.out.println(b); // 정수지만 double형으로 저장해서 1.0이 출력됨
		
//		int c = 1.1;
		double d = 1.1;
		int e = (int)1.1; // 1.1을 강제로 int형으로 변환
		System.out.println(e);
		
		// 1 to String
		String f = Integer.toString(1);
		System.out.println(f.getClass()); // 숫자가 아니라 문자 1
		
	}
}
