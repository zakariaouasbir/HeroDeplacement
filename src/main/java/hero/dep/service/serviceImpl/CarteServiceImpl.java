package hero.dep.service.serviceImpl;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import hero.dep.service.CarteService;

/**
 * @author Zakaria ouasbir
 *
 */
public class CarteServiceImpl implements CarteService {

	@SuppressWarnings("finally")
	public char[][] readCarteFromFile(final String pathTOFile) throws IOException {
		int index;
		char[][] cart = new char[20][20];
		try (FileInputStream fis = new FileInputStream(pathTOFile);
				InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
				BufferedReader reader = new BufferedReader(isr)) {
			index = 0;
			String str;
			while ((str = reader.readLine()) != null) {
				int indexj = 0;
				char[] characters = str.toCharArray();
				for (char c : characters) {
					cart[indexj][index] = c;
					indexj++;
				}
				index++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			return cart;
		}
	}

}
