package DrawingTool;


public class Coach {
	private int width, height;
	private Window window1, window2,window3,window4,window5;
	private Wheel frontWheel;
	private Wheel backWheel;
	private Door door;
	
	public Coach(int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
		window1 = new Window();
		window2 = new Window();
		window3 = new Window();
		window4 = new Window();
		window5 = new Window();
		frontWheel = new Wheel();
		backWheel = new Wheel();
		door = new Door();
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
	
	public void draw(int left , int bottom) {
		int abscissa= left;
		int ordinate= bottom;
		Drawing.pen().drawRect(abscissa, ordinate, width, height);
		window1.draw(abscissa+20);
		window2.draw(abscissa+60);
		window3.draw(abscissa+190);
		window4.draw(abscissa+230);
		window5.draw(abscissa+270);
		frontWheel.draw(abscissa+20, ordinate+130);
		backWheel.draw(abscissa+210, ordinate+130);
		door.draw(abscissa+100, ordinate+10);
	}

	

}
