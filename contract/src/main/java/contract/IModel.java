package contract;

import java.util.Observable;

import entity.Map;

/**
 * The Interface IModel.
 *
 * @author Jean-Aymeric Diet
 */
public interface IModel {

    /**
     * Gets the hello world.
     *
     * @return the map 
     */
    Map getMap();

    /**
     * Load the map.
     *
     * the code
     */
    void loadMap();

	/**
	 * Gets the observable.
	 *
	 * @return the observable
	 */
	Observable getObservable();
}
