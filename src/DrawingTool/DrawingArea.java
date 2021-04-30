package DrawingTool;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingArea extends JPanel {
  private static final long serialVersionUID = 1L;

  protected void paintComponent(Graphics pen) {
    super.paintComponent(pen);

    Drawing.set(pen);

    Train train = new Train();
    train.draw();

  }

}
