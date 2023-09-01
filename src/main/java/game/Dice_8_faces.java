package game;

/**
 * Création d\'un dé à 8 faces
 */
public class Dice_8_faces implements Dices{
    /**
     * Faces du dé
     */
    private static final int faces = 8;

    /**
     *
     * @return Le nombre de faces du dé
     */
    @Override
    public int get_faces () {
        return faces;
    }

    /**
     *
     * @return Le résultat du lancé du dé
     */
    @Override
    public int roll_dice (){
        return (int)(Math.random()*faces) + 1;
    }
}
