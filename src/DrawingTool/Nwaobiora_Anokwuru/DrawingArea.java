/**
 * @author Eberechukwu Faustina Nwaobiora
 * @author Emmanuel Anokwuru Akachukwu
 */
package DrawingTool;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);

		Drawing.set(pen);

		Scene scene = new Scene();
		scene.draw();

	}

}
