package DrawingTool;

import java.awt.Point;
import java.util.ArrayList;

public class Scene {
	private ArrayList<Train> trains = null;

	public Scene() {
		trains = new ArrayList<Train>();

		Point train1Position = new Point(128, 400);
		int train1Width = RandomNumber.between(1385, 1395);
		int train1Height = RandomNumber.between(110, 150);
		addNewTrains(train1Position, train1Width, train1Height);

		Point train2Position = new Point(128, 100);
		int train2Width = 1300;
		int train2Height = 120;
		addNewTrains(train2Position, train2Width, train2Height);

		Point train3Position = new Point(128, 600);
		int train3Width = RandomNumber.between(1220, 1250);
		int train3Height = 120;
		addNewTrains(train3Position, train3Width, train3Height);
	}

	public void drawTrains() {
		for (Train train : this.trains) {
			train.draw();
		}
	}

	public void addNewTrains(Point position, int width, int height) {
		Train train = new Train(position, width, height);
		if (vacantSpace(train))
			trains.add(train);
	}

	public boolean vacantSpace(Train other) {
		boolean anyIntersection = false;
		for (Train train : trains) {
			anyIntersection = anyIntersection || train.intersects(other);
		}
		return !anyIntersection;
	}

	public void draw() {
		drawTrains();
	}
}
