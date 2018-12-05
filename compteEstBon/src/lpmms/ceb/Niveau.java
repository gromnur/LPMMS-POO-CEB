/*
 * Niveau.java                              21 nov. 2018
 * LPMMS2018-2019, aucun droits d'auteur, ni copyright, ni copyleft
 */
package lpmms.ceb;

import java.util.List;

/**
 * TODO comment class responsibilities
 * 
 * @author frederic.barrios
 *
 */
public class Niveau {

	// TODO �tat d'instance

	/**
	 * TODO comment initialization state
	 * 
	 * @param libelle      nom de ce niveau
	 * @param jeuOperandes plaques disponibles pour tirage
	 * @param nbOperandes  nombre d'op�randes initiales
	 * @param min          min de valeur du nombre � calculer
	 * @param max          max de valeur du nombre � calculer
	 * @param tpsReflexion tps max de r�flexion avant r�ponse (en s)
	 * @param tpsEnonce    tps max d'�nonc� de la solution (en s)
	 */
	public Niveau(String libelle, int[] jeuOperandes, int nbOperandes, int min, int max, int tpsReflexion,
			int tpsEnonce) {

		// TODO Auto-generated constructor stub
		// TODO initialiser les champs pour les tirages
	}

	/**
	 * Fabrication (DP factory method) d'un Compte de ce niveau par des tirages
	 * al�atoires du nombre � calculer ainsi que des op�randes initiales.
	 * 
	 * @return le compte fabriqu�
	 */
	public Compte fabriquer() {
		// bouchon (user story)
		return new Compte(777, List.of(new OperandeInitiale(2), new OperandeInitiale(1), new OperandeInitiale(6),
				new OperandeInitiale(100), new OperandeInitiale(2), new OperandeInitiale(3)), 45, 35);
	}

}
