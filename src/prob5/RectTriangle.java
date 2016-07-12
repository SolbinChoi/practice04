package prob5;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	public RectTriangle(double width, double height) {
		super(3); // 변을 3으로 지정
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double getArea() {
		return width * height / 2;
	}

	@Override
	public double getParimeter() {
		return Math.sqrt(width*width)+(height+height);
	}

}
