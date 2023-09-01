package game;

/**
 * Création du dé à 6 faces implémenté de l'interface dice
 */
public class Dice_6_faces implements Dices {
    /**
     * Faces du dé
     */
    private static final int faces = 6;

    /**
     * Retourne les faces du dé
     * @return Les faces
     */
    @Override
    public int get_faces(){
        return faces;
    }

    /**
     * Lance le dé et donne un résultat aléatoire
     * @return résultat du lancé
     */
    @Override
    public int roll_dice() {
        return (int)(Math.random()* faces) + 1;
    }
}
