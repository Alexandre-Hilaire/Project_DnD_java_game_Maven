package exceptions;

public class PropertiesException extends Exception {
    /**
     * Fait appel à la superClasse Exception pour afficher un message d'erreur
     */
    public PropertiesException()
    {
        super("Impossible de lire le fichier des identifiants");
    }
}
