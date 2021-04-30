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
 public class Door{
	 private int height =120;
	 private int width =70;
	 
	 public void draw(int left, int bottom){
		 int abscissa = left;
		 int ordinate = bottom;
		 Drawing.pen().drawRect(abscissa,ordinate,width,height);
		 Drawing.pen().drawLine(abscissa+135, 410, 435, 530);
	 }
	 
 }
 