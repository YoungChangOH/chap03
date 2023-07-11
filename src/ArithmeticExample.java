
public class ArithmeticExample {

	public static void main(String[] args) {
		/*
		 * epoch time(unix time) : 1970/01/01 00:00:00 ~ 경과 시간 
		 * GMT, UTC(세계 표준시각)
		 * 
		 */
		long current = System.currentTimeMillis()/1000; // 초로 변환
		long hour = current/60/60%24+9;// 한국 현재 시각 : 영국과 9시간 시차
				//long hour = current/60/60%24;// 영국 표준시각
		long minute = current/60%60;
		long secound = current%60;
		
		int year = 0;
		int month = 0;
		int day = 0;
		int week = 0;
		
		System.out.println(current); // 에폭시 타임
		System.out.printf("%02d:%02d:%02d:%02d\n", day, hour, minute, secound);
		
		
		System.out.printf("%04d/%02d/%02d %d %02d:%02d:%02d\n", year, month, week, day, hour, minute, secound);
	}
	

}
