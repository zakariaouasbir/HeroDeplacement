package hero.dep.service.serviceImpl;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import hero.dep.model.Carte;
import hero.dep.service.CarteService;
import hero.dep.service.DeplacementService;

public class DeplacementServiceImplTest {

	DeplacementService deplacementService;
	CarteService carteService;
	Carte cart;

	@Before
	public void setUp() throws Exception {
		this.cart = new Carte();
		this.carteService = new CarteServiceImpl();
		this.deplacementService = new DeplacementServiceImpl();
	}

	@Test
	public void test() throws IOException {
		this.cart = this.deplacementService.setInitialData(this.cart, "SSSSEEEEEENN", 3, 0);
		this.cart.setCart(this.carteService.readCarteFromFile("src/main/resources/carte.txt"));
		assertEquals("9,2", this.deplacementService.calculateNewPosition(this.cart));
	}

}
