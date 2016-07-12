package prob5;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;
	
	public Rectangle(double width, double height){
		super(4);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void resize(double rate) {
		width = width * rate;
		height = height * rate;
	}

	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public double getParimeter() {
		return (width+height)*2;
	}

}
