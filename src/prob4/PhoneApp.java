package prob4;

public class PhoneApp {

	public static void main(String[] args) {

		Phone phone = new SmartPhone(); // 이렇게 쓰는 이유는 phone에 있는 메소드와 변수들을 모두 쓰기 위해서

		phone.execute("음악"); 
		phone.execute("통화");
		phone.execute("앱");

	}
}
