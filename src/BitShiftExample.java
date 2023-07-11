
public class BitShiftExample {

	public static void main(String[] args) {
		int num = 0b0000_0001;
		int result1 = num << 1;
		/*
		 * 0000_0001
		 * <<1
		 * ==========
		 * 0000_0010
		 */
		int result2 = num << 2;
		/*
		 * 0000_0001
		 * <<2
		 * ==========
		 * 0000_0100
		 */
		int result3 = num << 4;
		/*
		 * 0000_0001
		 * <<4
		 * ==========
		 * 0001_0000
		 */
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
	}

}
