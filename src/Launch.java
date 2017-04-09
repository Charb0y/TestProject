/**
 * Classe de lancement du projet
 * @author Loïc
 *
 */

public class Launch {

	// Attributs
	private boolean playing = false; // Initilalisé à false de base pour lancer le jeu	
	private String rules = "Dans ce jeu du pendu l'objectif est de trouvé le mot sélectionné par l'ordinateur."
			+ "\nLe nombre d'essai est illimité."
			+ "\n\tBonne chance !"; // Règle du jeu
	
	private String[] tabWords = new String[]{"Test","Tete","Ordinateur","Rien"};

	/**
	 * Méthode princpale de lancement du projet
	 * @param args
	 */
	public static void main (String args[]){
		/**
		 * On initialise un objet "Launch" pour éviter de créer des attributs static
		 * Pas obligatoire
		 */
		Launch launch = new Launch();
		
		System.out.println("Le jeu du pendu V.1");
		System.out.println(launch.rules); // On affiche les règles du jeu
		
		// TODO : 1 - Sélectionner un mot dans un tableau de mot prédéfini dans les attributs
		
		// TODO : 2 - Initialisation d'un tableau contenant le nombre de caractère présent
		// dans le mot avec les vraies lettre pour le première et dernière poisition et "-" pour le reste
		// On affiche le mot en même temps
			// TODO 3 : On affiche le mot à trouver

		while(launch.playing == false){ // /!\ Attention à la boucle infini /!\
			// TODO : 4 - On demande à l'utilisateur de saisir une lettre
			
			// TODO : 5 - On vérifie si la lettre est présente ou non
				// TODO : 6 - Si elle est présente on l'ajoute à son emplacement dans le tableau de caractère

				// TODO : 7 - On vérifie si oui ou non le mot est trouvé
					// TODO : 8 - Si le mot est trouvé on affiche un message de fin + arrête
				// TODO : 9 - Si mot pas trouvé on continue
		}
	}
}