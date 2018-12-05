/*
 * Compte.java                              23 nov. 2018
 * LPMMS2018-2019, aucun droits d'auteur, ni copyright, ni copyleft
 */
package lpmms.ceb;

import java.util.List;
import java.util.Vector;

/**
 * TODO comment class responsibilities
 * 
 * @author frederic.barrios
 */
public class Compte {

	/** Le nombre � calculer � partir des op�randes */
	private int aResoudre;

	/** Les op�randes disponibles � un instant t */
	private Vector<Operande> disponibles;

	/** tps max de r�flexion avant r�ponse (en s) */
	private int tpsReflexion;

	/** tps max d'�nonc� de la solution (en s) */
	private int tpsEnonce;

	/**
	 * Le compte initalement � r�soudre
	 * 
	 * @param aResoudre    le nombre � calculer
	 * @param disponibles  les op�randes initiales
	 * @param tpsReflexion tps max de r�flexion avant r�ponse (en s)
	 * @param tpsEnonce    tps max d'�nonc� de la solution (en s)
	 */
	public Compte(int aResoudre, List<OperandeInitiale> disponibles, int tpsReflexion, int tpsEnonce) {

		this.aResoudre = aResoudre;
		// TODO clonage pour conserver l'�tat initial ???
		this.disponibles = new Vector<Operande>(disponibles);
		this.tpsReflexion = tpsReflexion;
		this.tpsEnonce = tpsEnonce;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder affichageCompte = new StringBuilder("Op�randes : ");
		for (Operande dispo : disponibles) {
			affichageCompte.append('\t').append(dispo);
		}
		affichageCompte.append("\nA trouver : ").append(aResoudre).append('\n');

		return affichageCompte.toString();
	}

}
