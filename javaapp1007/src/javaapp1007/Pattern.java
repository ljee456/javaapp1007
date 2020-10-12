package javaapp1007;

public class Pattern {

	public static void main(String[] args) {
		try {
			int x = 0;
			while(true) {
				Thread.sleep(1000);
				if(x % 4 == 0)
					System.out.println("빨강");
				else if(x % 4 == 1)
					System.out.println("녹색");
				else if(x % 4 == 2)
					System.out.println("파랑");
				else if(x % 4 == 3)
					System.out.println("노랑");
				
				x++;
				
			}
		}catch(Exception e) {}

	}

}
