package javaapp1007;

public class unary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수선언
		boolean result = true;
		int x = 10;
		
		//!을 붙이면 반대로 결과를 출력
		System.out.println("!result = "+ (!result));
		
		//증감 연산자 사용
		x++; //변수의 값을 1증가 시킴
		System.out.println("x++ = " + x);  //11
		
		//앞에다 붙이면 증감을 먼저하고 명령에 사용
		//증감을 먼저해서 12를 만들고 출력
		System.out.println(++x);
		
		//명령어에 사용을 하고 증감을 수행
		//출력을 하고 증감을 하기 때문에 12를  출력하고 x는 13이 된다
		System.out.println(x++);
	}

}
