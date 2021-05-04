package DrawingTool;

/*public class Window {
	
  public void drawWindow(int left, int bottom) {
		
	Drawing.pen().drawOval(160,425, 45, 20);
	Drawing.pen().fillOval(160,425, 45, 20);
	Drawing.pen().drawRect(230, 430, 45, 25);// pilot window
    Drawing.pen().drawRect(320, 430, 25, 25);// first window
    Drawing.pen().drawRect(360, 430, 25, 25);// second window
    Drawing.pen().drawRect(490, 430, 25, 25);// third window
    Drawing.pen().drawRect(530, 430, 25, 25);// fourth window
    Drawing.pen().drawRect(570, 430, 25, 25);// fifth window
    
    //second coach windows
    Drawing.pen().drawRect(635, 430, 25, 25);// sixth window
    Drawing.pen().drawRect(675, 430, 25, 25);// seventh window
    Drawing.pen().drawRect(805, 430, 25, 25);// eighth window
    Drawing.pen().drawRect(845, 430, 25, 25);// ninth window
    Drawing.pen().drawRect(885, 430, 25, 25);// tenth window
    
    //third coach windows
    Drawing.pen().drawRect(950, 430, 25, 25);// Eleventh window
    Drawing.pen().drawRect(990, 430, 25, 25);// twelfth window
    Drawing.pen().drawRect(1120, 430, 25, 25);// thirteenth window
    Drawing.pen().drawRect(1160, 430, 25, 25);// fourteenth window
    Drawing.pen().drawRect(1200, 430, 25, 25);// fifteenth window
    Drawing.pen().drawRect(1260, 430, 45, 25);// pilot window 
     
  }*/
  public class Window extends RectangularObject{
	    private static  int height=25;
		private static int width = 25; 
		
	  public Window() {
		 super(width,height);
			
	  }

		/*
		 * public void draw(int left, int windowLevel) { int abscissa= left;
		 * Drawing.pen().drawRect(abscissa, windowLevel, width, height); }
		 */
	  @Override
		public void draw(int left, int windowLevel) {
		  Drawing.pen().drawRect(left , windowLevel,width ,height);
		}
}
