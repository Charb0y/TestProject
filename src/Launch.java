/**
 * Classe de lancement du projet
 * @author Lo�c
 *
 */

public class Launch {

	// Attributs
	private boolean playing = false; // Initilalis� � false de base pour lancer le jeu	
	private String rules = "Dans ce jeu du pendu l'objectif est de trouv� le mot s�lectionn� par l'ordinateur."
			+ "\nLe nombre d'essai est illimit�."
			+ "\n\tBonne chance !"; // R�gle du jeu
	
	private String[] tabWords = new String[]{"Test","Tete","Ordinateur","Rien"};

	/**
	 * M�thode princpale de lancement du projet
	 * @param args
	 */
	public static void main (String args[]){
		/**
		 * On initialise un objet "Launch" pour �viter de cr�er des attributs static
		 * Pas obligatoire
		 */
		Launch launch = new Launch();
		
		System.out.println("Le jeu du pendu V.1");
		System.out.println(launch.rules); // On affiche les r�gles du jeu
		
		// TODO : 1 - S�lectionner un mot dans un tableau de mot pr�d�fini dans les attributs
		
		// TODO : 2 - Initialisation d'un tableau contenant le nombre de caract�re pr�sent
		// dans le mot avec les vraies lettre pour le premi�re et derni�re poisition et "-" pour le reste
		// On affiche le mot en m�me temps
			// TODO 3 : On affiche le mot � trouver

		while(launch.playing == false){ // /!\ Attention � la boucle infini /!\
			// TODO : 4 - On demande � l'utilisateur de saisir une lettre
			
			// TODO : 5 - On v�rifie si la lettre est pr�sente ou non
				// TODO : 6 - Si elle est pr�sente on l'ajoute � son emplacement dans le tableau de caract�re

				// TODO : 7 - On v�rifie si oui ou non le mot est trouv�
					// TODO : 8 - Si le mot est trouv� on affiche un message de fin + arr�te
				// TODO : 9 - Si mot pas trouv� on continue
		}
	}
}