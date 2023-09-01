package game;

/**
 * Création d'un dé pipé qui retourne toujours 1
 */
public class Dice_always_1 implements Dices{
    private static final int faces = 1;

    /**
     *
     * @return Le nombre de faces du dé
     */
    @Override
    public int get_faces(){
        return faces;
    }
    /**
     *
     * @return Le résultat du lancé du dé
     */
    @Override
    public int roll_dice(){
        return 1;
    }
}
