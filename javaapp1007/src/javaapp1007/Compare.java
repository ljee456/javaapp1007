package javaapp1007;

public class Compare {

	public static void main(String[] args) {
		System.out.println(10 == 10); //2개가 동일하므로 true
		System.out.println(10 != 10); //2개가 다르지 않으므로 false
		
		
		//실수를 비교 할 때는 주의
		//1.0-0.8은 0.2인데 2개는 다르다고 나옴
		//실수 계산식과 실수 데이터를 직접 비교하는 것은 위험
		System.out.println((1.0 - 0.8) == 0.2);
		
		
		//문자열은 == 로 비교할 수 있는데 미리 입력된 리터럴을 가지고 비교할 때는
		//==로 비교 가능하지만 입력받아서 비교할 때는 ==을 사용하게 되면 동일한
		//문자열이더라도 false가 나올 수가 있으므로 equals를 사용해야 한다
		String id = "jae";
		System.out.println(id == "jae");
		System.out.println(id.equals("jae"));
		
	}

}
