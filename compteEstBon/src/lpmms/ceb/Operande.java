/*
 * Operande.java                              23 nov. 2018
 * LPMMS2018-2019, aucun droits d'auteur, ni copyright, ni copyleft
 */
package lpmms.ceb;

/**
 * Op�rande du compte est bon, disponible pour les calculs
 * 
 * @author frederic.barrios
 */
public interface Operande {

	/** @return valeur (initiale ou calcul�e) de cet op�rande */
	public int getValeur();

	/**
	 * Profondeur de calcul de cet op�rande c'est-�-dire le nombre d'op�rations
	 * ayant conduit � cet op�rande
	 * 
	 * @return
	 *         <ul>
	 *         <li>0 si op�rande non calcul�e</li>
	 *         <li>nb de calculs infixe dont est issu cet op�rande</li>
	 *         </ul>
	 */
	public default int getProfondeur() {
		return 0; // op�rande non issue d'un calcul
	}

	/**
	 * Mise sous format texte de cet op�rande
	 * 
	 * @return valeur en base 10 sous forme texte
	 */
	public default String toText() {
		return Integer.toString(getValeur());
	}
}
