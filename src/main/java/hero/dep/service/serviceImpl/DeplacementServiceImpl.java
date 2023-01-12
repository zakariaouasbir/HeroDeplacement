package hero.dep.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import hero.dep.model.Carte;
import hero.dep.service.DeplacementService;

/**
 * @author Zakaria ouasbir
 *
 */
public class DeplacementServiceImpl implements DeplacementService {

	@Override
	public Carte setInitialData(Carte cart, String directions, int n, int m) {
		cart.setN(n);
		cart.setM(m);
		List<Character> charactersList = new ArrayList<>();
		for (char ch : directions.toCharArray()) {
			charactersList.add(ch);
		}
		cart.setDirections(charactersList);
		return cart;
	}

	@Override
	public String calculateNewPosition(Carte cart) {
		cart.getDirections().stream().forEach(cart::calculateNewPosition);
		return cart.getNewPosition();
	}

}
