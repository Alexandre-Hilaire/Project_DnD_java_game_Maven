package game;

/**
 * Création d'un double dés à 6 faces
 */
public class Double_dice_6_faces implements Dices{
    private final Dice_6_faces dice_1;
    private final Dice_6_faces dice_2;

    public Double_dice_6_faces(Dice_6_faces dice_1, Dice_6_faces dice_2){
        this.dice_1 = dice_1;
        this.dice_2 = dice_2;
    }

    /**
     *
     * @return Le nombre de faces des deux dés
     */
    @Override
    public int get_faces(){
        return dice_1.get_faces() + dice_2.get_faces();
    }

    /**
     *
     * @return Le résultat du lancé des deux dés
     */
    @Override
    public int roll_dice (){
        int dice_1_result = dice_1.roll_dice();
        int dice_2_result = dice_2.roll_dice();
        return dice_1_result + dice_2_result;
    }
}
