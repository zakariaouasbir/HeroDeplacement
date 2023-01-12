package hero.dep.service;

import hero.dep.model.Carte;

/**
 * @author Zakaria ouasbir
 *
 */
public interface DeplacementService {

	public Carte setInitialData(Carte cart, String directions, int n, int m);

	public String calculateNewPosition(Carte cart);

}
