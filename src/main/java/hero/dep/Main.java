package hero.dep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import hero.dep.model.Carte;
import hero.dep.service.CarteService;
import hero.dep.service.DeplacementService;
import hero.dep.service.serviceImpl.CarteServiceImpl;
import hero.dep.service.serviceImpl.DeplacementServiceImpl;

/**
 * @author Zakaria ouasbir
 *
 */
public class Main {
	public final String PATH_TO_CARTE = "src/main/resources/carte.txt";
	public static DeplacementService deplacementService;
	public static CarteService carteService;
	public static Carte cart;

	public static void main(String[] args) throws IOException {
		cart = new Carte();
		carteService = new CarteServiceImpl();
		deplacementService = new DeplacementServiceImpl();

		System.out.println("Le fichier suivant est fourni en entrée :");
		System.out.println();
		BufferedReader readerLine1 = new BufferedReader(new InputStreamReader(System.in));
		String coordonnées = readerLine1.readLine();

		BufferedReader readerLine2 = new BufferedReader(new InputStreamReader(System.in));
		String directions = readerLine2.readLine();

		String[] xy = coordonnées.split(",");
		int x = Integer.parseInt(xy[0]);
		int y = Integer.parseInt(xy[1]);

		cart = deplacementService.setInitialData(cart, directions, x, y);
		cart.setCart(carteService.readCarteFromFile("src/main/resources/carte.txt"));
		System.out.println("Le personnage doit se trouver en (" + deplacementService.calculateNewPosition(cart) + ")");

	}

}
