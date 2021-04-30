package DrawingTool;

import java.awt.Color;

public class Design {
  public void drawBodyLine() {
    // body line
    Drawing.pen().setColor(Color.black);
    Drawing.pen().drawLine(300, 480, 400, 480); // left top line
    Drawing.pen().drawLine(300, 500, 400, 500); // left bottom line
    Drawing.pen().drawLine(470, 480, 610, 480); // right top line
    Drawing.pen().drawLine(470, 500, 610, 500); // right bottom line
    
    //second coach
    Drawing.pen().drawLine(615, 480, 715, 480); // left top line
    Drawing.pen().drawLine(615, 500, 715, 500); // left bottom line
    Drawing.pen().drawLine(785, 480, 925, 480); // right top line
    Drawing.pen().drawLine(785, 500, 925, 500); // right bottom line
    
    //third coach
    Drawing.pen().drawLine(930, 480, 1030, 480); // left top line
    Drawing.pen().drawLine(930, 500, 1030, 500); // left bottom line
    Drawing.pen().drawLine(1100, 480, 1240, 480); // right top line
    Drawing.pen().drawLine(1100, 500, 1240, 500); // right bottom line
    
    //pilot cabinet2
    Drawing.pen().drawLine(1240, 480, 1400, 480); // right top line
    Drawing.pen().drawLine(1240, 500, 1403, 500); // right bottom line
    //pilot cabinet1
    Drawing.pen().drawLine(133, 480, 300, 480); // right top line
    Drawing.pen().drawLine(140, 500, 300, 500); // right bottom line
    
  }

}