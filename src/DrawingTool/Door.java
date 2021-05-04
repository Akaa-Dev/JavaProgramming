package DrawingTool;

/*
 * public class Door {
 * 
 * public void drawDoor() { Drawing.pen().drawRect(400, 410, 70, 120);// door
 * Drawing.pen().drawLine(435, 410, 435, 450);// upper doorline
 * Drawing.pen().drawLine(435, 480, 435, 530);// lower doorline
 * 
 * //second coach door Drawing.pen().drawRect(715, 410, 70, 120);// door
 * Drawing.pen().drawLine(750, 410, 750, 450);// upper doorline
 * Drawing.pen().drawLine(750, 480, 750, 530);// lower doorline
 * 
 * //third coach door Drawing.pen().drawRect(1030, 410, 70, 120);// door
 * Drawing.pen().drawLine(1065, 410, 1065, 450);// upper doorline
 * Drawing.pen().drawLine(1065, 480, 1065, 530);// lower doorline }
 * 
 * }
 */
 public class Door extends RectangularObject{
	 
	 public Door() {
		super(width, height);
		
	}
	private static int height =120;
	 private  static int width =70;
	 private int doorCenter = width/2;
	 
	 public void draw(int left, int bottom){
		 int abscissa = left;
		 int ordinate = bottom;
		 int doorLinePos = abscissa+doorCenter;
		 int UPPERDOORLINESTART = bottom;
		 int UPPERDOORLINEEND = UPPERDOORLINESTART+40;
		 int LOWERDOORLINESTART = UPPERDOORLINESTART+70;
		 int LOWERDOORLINEEND = LOWERDOORLINESTART+50;
		 Drawing.pen().drawRect(abscissa,ordinate,width,height);
		 Drawing.pen().drawLine(doorLinePos, UPPERDOORLINESTART, doorLinePos, UPPERDOORLINEEND);
		 Drawing.pen().drawLine(doorLinePos,LOWERDOORLINESTART,doorLinePos,LOWERDOORLINEEND);
	 }
	 //DoorButton
	 public void draw(int left, int bottom, int shiftBy ) {//overloading
		    int height = 20;
		    int width = 30;
		    int BUTTONPOS = left+125;
		    int ordinate = bottom+50 ;
		    Drawing.pen().drawOval(BUTTONPOS, ordinate, height, width); // door button
		    Drawing.pen().fillOval(BUTTONPOS + shiftBy, ordinate, height, width);
		  }
	 public void drawPilotDoor(int left, int bottom) {
		 //height=120;
		 int width=30;
		 int doorEnd =0;
		 if(left<300) {
			 doorEnd=left+2;
		 }
		 else{
		   doorEnd=left+28;
		 }
		 Drawing.pen().drawRect(left,bottom,width,height);
		 Drawing.pen().drawLine(doorEnd,bottom,doorEnd,bottom+height);
	 }
	 
 }
 