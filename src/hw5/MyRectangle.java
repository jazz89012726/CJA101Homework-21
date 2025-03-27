package hw5;

public class MyRectangle {
	double width;
	double depth;

	public MyRectangle() {
	}

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	// 寬度
	void setWidth(double width) {
		this.width = width;
	}

	// 深度
	void setDepth(double depth) {
		this.depth = depth;
	}

	// 面積
	double getArea() {
		return width * depth;
	}
}