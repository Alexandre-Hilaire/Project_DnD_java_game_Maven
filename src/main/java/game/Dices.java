package game;

/**
 * Interface qui vérifie la bonne création des dés avec les méthodes communes obligatoires
 */
public interface Dices {
    /**
     * Les faces du dé
     * @return le nombre de faces
     */
    int get_faces();
    /**
     * La fonction de lancé de dé
     * @return le résultat du lancé
     */
    int roll_dice();
}
