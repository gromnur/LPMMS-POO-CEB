/*
 * JeuConsole.java                              21 nov. 2018
 * LPMMS2018-2019, aucun droits d'auteur, ni copyright, ni copyleft
 */
package lpmms.ceb.ui;

import lpmms.ceb.Compte;
import lpmms.ceb.Niveau;

/**
 * Jeu du "Compte est bon" sur console texte
 * <ul>
 * <li>Choix d'un niveau</li>
 * <li>G�n�ration d'un compte par ce niveau</li>
 * <li>Demande de la solution sous forme texte au joueur</li>
 * <li>Bilan et score</li>
 * <li>Affichage des meilleures solutions calcul�es</li>
 * </ul>
 * 
 * @author frederic.barrios
 */
public class JeuConsole {

	/** Compte � r�soudre durant ce jeu console */
	private static Compte aCalculer;

	/** Eviter l'instanciation */
	private JeuConsole() {
	}

	/**
	 * Jeu du compte est bon sur console texte standard
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {

		// TODO choix du niveau
		// it�ration 1 : pas de choix => niveau classique

		/* D�finition du niveau standard */
		Niveau standard = new Niveau("classique",
				/* plaques disponibles pour tirage */
				new int[] { 1, 1, 2, 2, /* TODO � compl�ter */100 }, 6, // op�randes initiales
				101, // min de valeur du nombre � calculer
				999, // max de valeur du nombre � calculer
				45, // tps max de r�flexion avant r�ponse (en s)
				35); // tps max d'�nonc� de la solution (en s)

		/* Tirage du compte � r�soudre */
		aCalculer = standard.fabriquer();

		/* Affichage et d�but du chronom�trage */
		System.out.println("Voici le tirage : \n" + aCalculer);

		/* Demande de la solution */
		System.out.println("\n\nVotre solution : ");
		System.out.print("Compte trouv� : ");

		/* Affichage des meilleures solutions */
		
	}
}
