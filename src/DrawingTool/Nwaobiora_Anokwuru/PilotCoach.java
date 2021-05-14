package DrawingTool;

import java.awt.Point;

public class PilotCoach {
	private PilotDoor rightPilotDoor, leftPilotDoor;// aggregate
	private Connector connector;
	private Window rightPilotWindow, leftPilotWindow;
	private Wheel rightPilotWheel, leftPilotWheel;
	private int width;
	private int height;
	private Point position;
	private int YPOS;

	public PilotCoach(Point position, int width, int height) {
		this.width = width;
		this.height = height;
		this.position = position;
		YPOS = position.y + (int) (height * 0.65);
		connector = new Connector(new Point(position.x - 30, position.y + (int) (height * 0.65)), (int) (width * 0.22),
				(int) (height * 0.07));
		leftPilotWindow = new Window(new Point(position.x + (int) (width * 0.2), position.y + (int) (height * 0.15)),
				(int) (width * 0.07), (int) (height * 0.125));
		rightPilotWindow = new Window(new Point(position.x + (int) (width * 0.7), position.y + (int) (height * 0.15)),
				(int) (width * 0.07), (int) (height * 0.125));
		leftPilotWheel = new Wheel(new Point(position.x + (int) (width * 0.15), YPOS), width - (int) (width * 0.143));
		rightPilotWheel = new Wheel(new Point(position.x + (int) (width * 0.8), YPOS), width - (int) (width * 0.143));
		leftPilotDoor = new PilotDoor(new Point(position.x + (int) (width * 0.4), position.y + (int) (height * 0.05)),
				(int) (width * 0.07), (int) (height * 0.6));
		rightPilotDoor = new PilotDoor(new Point(position.x + (int) (width * 0.55), position.y + (int) (height * 0.05)),
				(int) (width * 0.07), (int) (height * 0.6));
	}

	public void draw(int startAngle, int arcAngle) {
		int xpos1 = 0;
		int xpos2 = 0;

		if (position.x < width) {
			xpos1 = position.x + (int) (width * 0.03);
			xpos2 = xpos1 + (int) (width * 0.48);
			leftPilotWindow.draw();
			connector.draw();
			leftPilotWheel.draw();
			leftPilotDoor.draw();
		} 
		else if (position.x > width) {
			xpos1 = position.x + (int) (width * 0.52);
			xpos2 = xpos1 + (int) (width * 0.46);
			rightPilotWindow.draw();
			rightPilotWheel.draw();
			rightPilotDoor.draw();
		}
		
		Drawing.pen().drawLine(xpos1, YPOS, xpos2, YPOS);
		Drawing.pen().drawArc(position.x, position.y, width, height, startAngle, arcAngle);
	}

}