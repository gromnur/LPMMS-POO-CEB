/*
 * OperandeInitiale.java                              23 nov. 2018
 * LPMMS2018-2019, aucun droits d'auteur, ni copyright, ni copyleft
 */
package lpmms.ceb;

/**
 * Op�rande dont la valeur est fix�e initialement, peut servir de "plaque"
 * initiale dans un compte est bon
 * 
 * @author frederic.barrios
 *
 */
public class OperandeInitiale implements Operande {

	/** Valeur de cette op�rande */
	private int valeur;

	/**
	 * Une op�rande tir�e lors de la fabrication d'un compte est bon
	 * 
	 * @param init valeur de cet op�rande
	 */
	public OperandeInitiale(int init) {
		valeur = init;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see lpmms.ceb.Operande#getValeur()
	 */
	@Override
	public int getValeur() {
		return valeur;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return toText();
	}
}
