package DrawingTool;

import java.awt.Point;

public class Train implements LocatedRectangle {
	//private int left, bottom;
	private Coach frontCoach; // composite
	private Coach middleCoach; // composite
	private Coach endCoach; // composite
	private Coach pilotCoachLeft; // composite
	private Coach pilotCoachRight; // composite
	// private Door door;
	// private Wheel wheel;
	// private Window window;
	// private PressedButton button;
	// private Design design1;

	public Train() {
		/*
		 * left = this.left; bottom = this.bottom;
		 */
		frontCoach = new Coach(310, 130);
		middleCoach = new Coach(310, 130);
		endCoach = new Coach(310, 130);
		pilotCoachLeft = new Coach(310,130);
		pilotCoachRight = new Coach(310,130);
		// door = new Door();
		// wheel = new Wheel();
		// window = new Window();
		// button = new PressedButton();
		// design1 = new Design();
	}
	/*
	 * public int getLeft() { return left; }
	 * 
	 * public void setLeft(int left) { this.left = left; }
	 * 
	 * public int getBottom() { return bottom; }
	 * 
	 * public void setBottom(int bottom) { this.bottom = bottom; }
	 */


	/*
	 * public void draw() { frontCoach.draw(300,400); middleCoach.draw(615, 400);
	 * endCoach.draw(930, 400); pilotCoachLeft.draw(128,90,107);
	 * pilotCoachRight.draw(1055,-270,-107);
	 * 
	 * coach.drawFrontCoach(); door.drawDoor(); wheel.drawWheel();
	 * window.drawWindow(); button.drawButton(); design1.drawBodyLine();
	 * 
	 * }
	 */
	public void draw(int left, int bottom) {
		frontCoach.draw(left+172,bottom);
		middleCoach.draw(left+487, bottom);
		endCoach.draw(left+802, bottom);
		pilotCoachLeft.draw(left,bottom, 90, 107);
		pilotCoachRight.draw(left+927, bottom, -270, -107);
	}
	@Override
	public Point address() {
		Point point =  new Point();
		point.x = 128;
		point.y = 300;
		return point  ;
	}
	@Override
	public int width() {
		return 0;
	}
	@Override
	public int height() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void draw() {
		
		
	}

	
}