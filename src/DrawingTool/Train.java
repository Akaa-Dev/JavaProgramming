package DrawingTool;

public class Train {
  private Coach frontCoach;
  private Coach middleCoach;
  private Coach endCoach;
  //private Door door;
  //private Wheel wheel;
  //private Window window;
  //private PressedButton button;
  //private Design design1;

  public Train() {
    frontCoach = new Coach(310,130);
    middleCoach = new Coach(310,130);
    endCoach = new Coach(310,130);
    //door = new Door();
    //wheel = new Wheel();
   // window = new Window();
   // button = new PressedButton();
    //design1 = new Design();
  }

  public void draw() {
    frontCoach.draw(300,400);
    middleCoach.draw(615, 400);
    endCoach.draw(930, 400);
	/*
	 * coach.drawFrontCoach(); door.drawDoor(); wheel.drawWheel();
	 * window.drawWindow(); button.drawButton(); design1.drawBodyLine();
	 */
  }

}