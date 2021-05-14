package DrawingTool;

import java.awt.Point;

public class WindowSet {
	private Window window1, window2, window3, window4, window5;

	public WindowSet(Point position, int width, int height) {
		int windowWidth = (int) (width * 0.08);
		int space = (int) (width * 0.13);
		Point windowPost1 = new Point(position.x + space, position.y);
		Point windowPost2 = new Point(windowPost1.x + space, position.y);
		Point windowPost3 = new Point(windowPost2.x + space * 3, position.y);
		Point windowPost4 = new Point(windowPost3.x + space, position.y);
		window1 = new Window(position, windowWidth, height);
		window2 = new Window(windowPost1, windowWidth, height);
		window3 = new Window(windowPost2, windowWidth, height);
		window4 = new Window(windowPost3, windowWidth, height);
		window5 = new Window(windowPost4, windowWidth, height);
	}

	public void draw() {
		window1.draw();
		window2.draw();
		window3.draw();
		window4.draw();
		window5.draw();
	}
}
