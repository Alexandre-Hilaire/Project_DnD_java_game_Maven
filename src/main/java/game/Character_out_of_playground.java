package game;

public class Character_out_of_playground extends Exception{
    /**
     * Fait appel à la superClasse Exception pour afficher le message d'erreur
     * @param message
     */
    public Character_out_of_playground (String message) {
        super(message);
    }
}
