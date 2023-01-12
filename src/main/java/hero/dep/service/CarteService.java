package hero.dep.service;

import java.io.IOException;
/**
 * @author Zakaria ouasbir
 *
 */
public interface CarteService {
	
	public char[][] readCarteFromFile(final String PathTOFIle)  throws IOException;
	
	
}
