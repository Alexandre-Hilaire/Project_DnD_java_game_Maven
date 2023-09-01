package MySQL;

import characters.Warriors;
import characters.Wizards;
import characters.Characters;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.*;
import exceptions.PropertiesException;
import exceptions.DatabaseException;

/**
 * Classe qui gère la connexion à la BDD et d'envoyer les résultats de requêtes
 */
public class BDD_connexion {
    //Singleton pour permettre une seule instanciation de la connexion
    /**
     * Connection nulle au départ
     */
    private static Connection connection = null;

    /**
     * Permet de lancer la tentative de connexion
     * @throws PropertiesException exception de properties qui gère si le fichier .env est lisible/correct ou non
     * @throws DatabaseException exception qui gère les échecs de connexion à la bdd
     */
    private BDD_connexion() throws PropertiesException, DatabaseException {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(".env"));
        } catch (IOException e) {
            throw new PropertiesException();
        }
        String url = prop.getProperty("url");
        String username = prop.getProperty("login");
        String password = prop.getProperty("pass");
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connexion réussie !");
        } catch (SQLException e) {
            throw new DatabaseException();
        }
    }

    /**
     * Si l'user a besoin d'une connexion et qu'il n'y en a pas une, on la demande
     * @return connection
     * @throws PropertiesException exception de properties qui gère si le fichier .env est lisible/correct ou non
     * @throws DatabaseException exception qui gère les échecs de connexion à la bdd
     */
    public static Connection getConnection() throws PropertiesException, DatabaseException {
        if (connection == null){
            new BDD_connexion();
        }
        return connection;
    }

    /**
     * Permet de fermer la connexion quand l'user n'a plus besoin des données de la bdd
     * @throws DatabaseException exception qui gère les échecs de déconnexions de la bdd
     */
    public static void close_connection() throws DatabaseException {
        if (connection != null) {
            try{
                connection.close();
                System.out.println("fermeture de la connexion");
            }
            catch (SQLException e) {
                throw new DatabaseException();
            }
        }
    }

    /**
     * Afficher tous les personnages dans la bdd
     * @return Une liste de personnages
     * @throws PropertiesException Si le fichier .env n'a pas été trouvé
     * @throws DatabaseException Si la bdd n'est pas accessible ou la table n'existe pas, etc.
     */
    public static List<Characters> select_heroes() throws PropertiesException, DatabaseException {
        Connection connection = getConnection();
        List<Characters> characters = new ArrayList<>();
        String query = "SELECT * FROM Player_heroes";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String heroes_class = resultSet.getString("class");
                String name = resultSet.getString("name");
                int health = resultSet.getInt("health");
                int force_value = resultSet.getInt("force_value");
                String weapons_spells = resultSet.getString("weapons_spells");
                String shields_potions = resultSet.getString("shields_potions");
                System.out.println(id + " , class : " + heroes_class + ", Name : " + name + ", Health " + health + ", Force : " + force_value + ", " + weapons_spells + ", " + shields_potions);

                if (heroes_class.equals("Warrior")) {
                    characters.add(new Warriors(name, health, force_value, shields_potions));
                }
                else if (heroes_class.equals("Wizard")) {
                    characters.add(new Wizards(name, health, force_value, weapons_spells, shields_potions));
                }

            }
        }
        catch (SQLException e) {
            System.out.println("erreur SQL : " + e.getMessage());
            throw new DatabaseException();
        }
        return characters;
    }
}