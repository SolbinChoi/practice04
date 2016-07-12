package prob5;

public abstract class Shape {
	private int countSides; // 변의 수
	
	public Shape(int countSides){
		this.countSides = countSides;
	}
	public abstract double getArea(); // 넓이 구하기
	
	public abstract double getParimeter(); // 둘레 길이

}
