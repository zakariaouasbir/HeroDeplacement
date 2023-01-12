package hero.dep.service.serviceImpl;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import hero.dep.service.CarteService;

public class CarteServiceImplTest {

	CarteService carteService;

	@Before
	public void setUp() throws Exception {
		this.carteService = new CarteServiceImpl();
	}

	@Test
	public void test() throws IOException {
		assertNotNull(this.carteService.readCarteFromFile("src/main/resources/carte.txt"));
	}

}
