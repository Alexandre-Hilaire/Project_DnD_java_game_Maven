package game;

/**
 * Création du dé à 6 faces
 */
public class Dice_6_faces implements Dices {
    private static final int faces = 6;
    @Override
    public int get_faces(){
        return faces;
    }
    @Override
    public int roll_dice() {
        return (int)(Math.random()* faces) + 1;
    }
}
