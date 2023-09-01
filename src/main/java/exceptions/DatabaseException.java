package exceptions;

/**
 * Classe d'exception qui gère les problèmes de connexion / déconnexion
 */
public class DatabaseException extends Exception {
    /**
     * Fait appel à la superClasse Exception pour afficher un message d'erreur
     */
    public DatabaseException()
    {
        super("Echec de la (dé)connexion fin du processus");
    }
}
