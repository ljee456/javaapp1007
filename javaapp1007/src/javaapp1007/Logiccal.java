package javaapp1007;

public class Logiccal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int su = 12; 
		
		//위의 수가 3의 배수인지 확인
		//3의 배수는 3으로 나눈 나머지가 0인 수
		if(su % 3 == 0) {
			System.out.println("3의 배수");
		}else {
			System.out.println("3의 배수 아님");
		}
		
		//3의 배수이고 4의 배수인지 확인
		//&&(그리고) 대신에 ||를 설정하면 또는 이된다
		if(su % 3 == 0 && su % 4 == 0) {
			System.out.println("3의 배수이고 4의 배수임");
		}else {
			System.out.println("3과 4의 공통 배수는 아님");
		}
		
		//다음 년도가 윤년이면 윤년이라고 출력하고 윤년이 아니면 윤년이 아니라고 출력
		int year = 2020;
		//윤년이 되는 2가지 조건 - 둘 중에 하나만 만족
		//4의 배수이고 100의 배수는 아닌 경우
		//400의 배수인 경우
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("year는 윤년");
		}else
			System.out.println("year는 윤년 아님");

	}

}
