import Menus.Menu;
import exceptions.DatabaseException;
import exceptions.PropertiesException;


public class Main {
    /**
     * Méthode de la class main qui lance le programme en créant un nouveau menu principal
     * @param args tableau qui permet de passer des arguments en ligne de commandes lors de l'exécution du programme
     * @throws PropertiesException exception de properties qui gère si le fichier .env est lisible/correct ou non
     * @throws DatabaseException exception qui gère les échecs de connexion à la bdd
     */
    public static void main(String[] args) throws PropertiesException, DatabaseException { //Début du programme
        Menu menu = new Menu(); // Création du menu
        menu.menu();
    }
}