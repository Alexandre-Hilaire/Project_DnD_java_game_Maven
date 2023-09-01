package game;

/**
 * Classe qui gere le dépassement du plateau
 */
public class Character_out_of_playground extends Exception{
    /**
     * Fait appel à la superClasse Exception pour afficher le message d'erreur
     * @param message Le message d'erreur
     */
    public Character_out_of_playground (String message) {
        super(message);
    }
}
