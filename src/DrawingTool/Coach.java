package DrawingTool;


public class Coach {
	private int width, height;
	private Window window1, window2,window3,window4,window5,pilotWindow; // aggregate
	private Wheel frontWheel; // aggregate
	private Wheel backWheel;
	private Wheel pilotWheel;// aggregate
	private Door door;// aggregate
	private Door pilotDoor;

	public Coach(int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
		window1 = new Window();
		window2 = new Window();
		window3 = new Window();
		window4 = new Window();
		window5 = new Window();
		pilotWindow = new Window();
		frontWheel = new Wheel();
		backWheel = new Wheel();
		pilotWheel = new Wheel();
		door = new Door();
		pilotDoor = new Door();
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
		int WINDOWLEVEL = bottom+30;
		Drawing.pen().drawRect(abscissa, ordinate, width, height);
		window1.draw(abscissa+20,WINDOWLEVEL);
		window2.draw(abscissa+60,WINDOWLEVEL);
		window3.draw(abscissa+190,WINDOWLEVEL);
		window4.draw(abscissa+230,WINDOWLEVEL);
		window5.draw(abscissa+270,WINDOWLEVEL);
		frontWheel.draw(abscissa+20, ordinate+130);
		backWheel.draw(abscissa+210, ordinate+130);
		door.draw(abscissa+100, ordinate+10);
		door.draw(abscissa,ordinate,3);
	}
	 public void draw(int left, int bottom,int startAngle,int arcAngle) {
			int abscissa = left; 
			int ordinate = bottom;
			int width=350; 
			int height=200;
			int XPOS1=0;
			int XPOS2=0;
			int pilotDoorPos=0;
			int YPOS = bottom+130;
			int WINDOWLEVEL = bottom +30;
			if (abscissa <=300) {
				 XPOS1= abscissa+9;
				 XPOS2= XPOS1 +163;	
				 pilotDoorPos = left+140;
			}
				else if(abscissa>300) {
					XPOS1=abscissa+185;
					XPOS2 = XPOS1 +156;
					pilotDoorPos=XPOS1+2;
			}
			Drawing.pen().drawLine(XPOS1, YPOS, XPOS2,YPOS);
			Drawing.pen().drawArc(abscissa, ordinate, width, height, startAngle, arcAngle);
			pilotWheel.draw(XPOS1+72, YPOS);
			pilotDoor.drawPilotDoor(pilotDoorPos, bottom+10);
			pilotWindow.draw(XPOS1+72,WINDOWLEVEL);
		}
}
