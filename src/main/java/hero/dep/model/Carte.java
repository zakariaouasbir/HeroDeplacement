package hero.dep.model;

import java.util.List;

/**
 * @author Zakaria ouasbir
 *
 */
public class Carte {
	private final int CARTE_N_SIZE = 20;
	private final int CARTE_M_SIZE = 20;
	private int n; // coordonnée X
	private int m; // coordonnées Y
	private char[][] cart;
	private List<Character> directions; // directions founit par l'utilisateur

	public Carte() {
		this.cart = new char[this.CARTE_N_SIZE][this.CARTE_M_SIZE];
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public char[][] getCart() {
		return cart;
	}

	public void setCart(char[][] cart) {
		this.cart = cart;
	}

	public List<Character> getDirections() {
		return directions;
	}

	public void setDirections(List<Character> directions) {
		this.directions = directions;
	}

	public void calculateNewPosition(char direction) {
		switch (direction) {
		case 'S':
			if (this.m < CARTE_N_SIZE - 1 && this.cart[this.n][this.m + 1] != '#')
				this.m++;
			break;
		case 'N':
			if (this.m > 0 && this.cart[this.n][this.m - 1] != '#')
				this.m--;
			break;
		case 'E':
			if (this.n < CARTE_N_SIZE - 1 && this.cart[this.n + 1][this.m] != '#')
				this.n++;
			break;
		case 'O':
			if (this.n > 0 && this.cart[this.n - 1][this.m] != '#')
				this.n--;
			break;
		}
	}

	public String getNewPosition() {
		return this.n + "," + this.m;
	}

}
