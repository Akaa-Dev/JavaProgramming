package DrawingTool;

import java.awt.Point;

public class Train implements LocatedRectangle {
	private int left, bottom, width, height;
	private Point rootedAt;
	private Coach frontCoach; // composite
	private Coach middleCoach; // composite
	private Coach endCoach; // composite
	private PilotCoach pilotCoachLeft; // composite
	private PilotCoach pilotCoachRight; // composite

	public Train(Point rootedAt, int width, int height) {
		this.width = width;
		this.height = height;
		left = rootedAt.x;
		bottom = rootedAt.y;
		this.rootedAt = rootedAt;
		frontCoach = new Coach(new Point((int) (width * 0.22), bottom), (int) (width * 0.222), height);
		middleCoach = new Coach(new Point((int) (width * 0.44), bottom), (int) (width * 0.222), height);
		endCoach = new Coach(new Point((int) (width * 0.66), bottom), (int) (width * 0.222), height);
		pilotCoachLeft = new PilotCoach(new Point(left, bottom), (int) (width * 0.25), height + (int) (height * 0.55));
		pilotCoachRight = new PilotCoach(new Point(left + (int) (width * 0.66), bottom), (int) (width * 0.25),
				height + (int) (height * 0.55));
	}

	public void draw() {
		frontCoach.draw();
		middleCoach.draw();
		endCoach.draw();
		pilotCoachLeft.draw(90, 107);
		pilotCoachRight.draw(-270, -107);
	}

	@Override
	public Point address() {
		return rootedAt;
	}

	@Override
	public int width() {
		return width;
	}

	@Override
	public int height() {
		return height;
	}
}