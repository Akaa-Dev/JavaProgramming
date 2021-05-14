package DrawingTool;

import java.awt.Point;

public class Coach {
	private int width, height, left, bottom;
	private WindowSet window;// aggregate
	private Wheel frontWheel; // aggregate
	private Wheel backWheel; // aggregate
	private Door door; // aggregate

	public Coach(Point position, int width, int height) {
		this.left = position.x;
		this.bottom = position.y;
		this.setWidth(width);
		this.setHeight(height);
		frontWheel = new Wheel(new Point(left + (int) (width * 0.10), bottom + height), width);
		backWheel = new Wheel(new Point(left + (int) (width * 0.8), bottom + height), width);
		window = new WindowSet(new Point(left + (int) (width * 0.06), bottom + (int) (height * 0.23)), (width),
				(int) (height * 0.19));
		door = new Door(new Point(left + (int) (width * 0.45), bottom + (int) (height * 0.08)), (int) (width * 0.21),
				(int) (height * 0.92));
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		int abscissa = left;
		int ordinate = bottom;
		Drawing.pen().drawRect(abscissa, ordinate, width, height);
		window.draw();
		frontWheel.draw();
		backWheel.draw();
		door.draw();
	}
}
