package controller;

import contract.ControllerOrder;
import contract.IController;
import contract.IModel;
import contract.IView;

/**
 * The Class Controller.
 */
public final class Controller implements IController {

	/** The view. */
	private IView		view;

	/** The model. */
	private IModel	model;

	private int firstLightCycleX = 0;
	
	private int firstLightCycleY = 0;
	
	private int secondLightCycleX = 400;
	
	private int secondLightCycleY = 600;
	
	/**
	 * Instantiates a new controller.
	 *
	 * @param view
	 *          the view
	 * @param model
	 *          the model
	 */
	public Controller(final IView view, final IModel model) {
		this.setView(view);
		this.setModel(model);
	}

	/**
     * Sets the view.
     *
     * @param pview
     *            the new view
     */
	private void setView(final IView pview) {
		this.view = pview;
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *          the new model
	 */
	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
     * Order perform.
     *
     * @param controllerOrder
     *            the controller order
     */
	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IController#orderPerform(contract.ControllerOrder)
	 */
	public void orderPerform(final ControllerOrder controllerOrder) {
		switch (controllerOrder) {
			case UP:
				this.model.getMap().moveUp(firstLightCycleX, firstLightCycleY, "Red");
				firstLightCycleY--;
				break;
			case DOWN:
				this.model.getMap().moveDown(firstLightCycleX, firstLightCycleY, "Red");
				firstLightCycleY++;
				break;
			case RIGHT:
				this.model.getMap().moveRight(firstLightCycleX, firstLightCycleY, "Red");
				firstLightCycleX++;
				break;
			case LEFT:
				this.model.getMap().moveLeft(firstLightCycleX, firstLightCycleY, "Red");
				firstLightCycleX--;
				break;
			case UP1:
				this.model.getMap().moveUp(secondLightCycleX, secondLightCycleY, "Blue");
				secondLightCycleY--;
				break;
			case DOWN1:
				this.model.getMap().moveDown(secondLightCycleX, secondLightCycleY, "Blue");
				secondLightCycleY++;
				break;
			case RIGHT1:
				this.model.getMap().moveRight(secondLightCycleX, secondLightCycleY, "Blue");
				secondLightCycleX++;
				break;
			case LEFT1:
				this.model.getMap().moveLeft(secondLightCycleX, secondLightCycleY, "Blue");
				secondLightCycleX--;
				break;
			default:
				break;
		}
	}

	@Override
	public void control() {
		// TODO Auto-generated method stub
		
	}

}
