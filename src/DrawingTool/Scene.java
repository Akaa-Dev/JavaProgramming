package DrawingTool;

import java.util.ArrayList;

public class Scene {
	
	private ArrayList<Train> trains = null;
	public Scene() { 
	trains = new ArrayList<Train>();
	}
	public void draw() {
		Train train1 = new Train();
		Train train2 = new Train();
		Train train3 = new Train();
		Train train4 = new Train();
		trains.add(train1);
		trains.add(train2);
		trains.add(train3);
		trains.add(train4);
		train1.draw(128,50);
		train2.draw(128,250);
		train3.draw(128,450);
		train4.draw(128,650);
	}
	
	
}
