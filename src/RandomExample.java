
public class RandomExample {

	public static void main(String[] args) {

		System.out.println(Math.random());
		
		// 1. 주사위 [ 1 ~ 6 ] 
		System.out.println((int)(Math.random()*6)+1);
		// 2. 30 ~ 37의 랜덤수
		System.out.println((int)(Math.random()*8)+30);
		// 3. A ~ Z까지의 알파벳
		char ch = (char)(Math.random()*26 +'A');
		System.out.println(ch);
		// 4. 로또
		
		
	}

}
