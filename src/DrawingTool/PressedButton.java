package DrawingTool;

import java.awt.Color;

public class PressedButton {

  public void drawButton() {
	Drawing.pen().setColor(Color.black);
    Drawing.pen().drawOval(425, 450, 20, 30); // door button
    Drawing.pen().setColor(Color.red);
    Drawing.pen().fillOval(428, 450, 20, 30); // door button

    //second coach button
    Drawing.pen().setColor(Color.black);
    Drawing.pen().drawOval(740, 450, 20, 30); // door button
    Drawing.pen().setColor(Color.red);
    Drawing.pen().fillOval(743, 450, 20, 30); // door button
    
  //third coach button
    Drawing.pen().setColor(Color.black);
    Drawing.pen().drawOval(1055, 450, 20, 30); // door button
    Drawing.pen().setColor(Color.red);
    Drawing.pen().fillOval(1058, 450, 20, 30); // door button
  }

}