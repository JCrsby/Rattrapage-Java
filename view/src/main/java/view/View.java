package view;

import java.awt.event.KeyEvent;

import javax.swing.SwingUtilities;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class View.
 *
 * @author jeremy
 */
public final class View implements IView, Runnable {

	/** The frame. */
	private final ViewFrame frame;

	/**
	 * Instantiates a new view.
	 *
	 * @param model
	 *          the model
	 */
	public View(final IModel model) {
		this.frame = new ViewFrame(model);
		SwingUtilities.invokeLater(this);
	}

	/**
	 * Key code to controller order.
	 *
	 * @param keyCode
	 *          the key code
	 * @return the controller order
	 */
	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) {
		switch (keyCode) {
			case KeyEvent.VK_Z:
				return ControllerOrder.UP;
			case KeyEvent.VK_S:
				return ControllerOrder.DOWN;
			case KeyEvent.VK_D:
				return ControllerOrder.RIGHT;
			case KeyEvent.VK_Q:
				return ControllerOrder.LEFT;
			case KeyEvent.VK_O:
				return ControllerOrder.UP1;
			case KeyEvent.VK_L:
				return ControllerOrder.DOWN1;
			case KeyEvent.VK_M:
				return ControllerOrder.RIGHT1;
			case KeyEvent.VK_K:
				return ControllerOrder.LEFT1;
			default:
				return ControllerOrder.NULL;
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		this.frame.setVisible(true);
		this.frame.repaint();
	}

	/**
	 * Sets the controller.
	 *
	 * @param controller
	 *          the new controller
	 */
	public void setController(final IController controller) {
		this.frame.setController(controller);
	}
}
