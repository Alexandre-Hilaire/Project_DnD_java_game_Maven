package game;
import Menus.Menu;

import java.util.Scanner;
public class Game {
    /**
     * Menu de création d'une nouvelle partie avec un nouveau plateau personnalisable par l'user
     */
    public void new_game() {
        //int player_position = 1 ; // Le joueur débute à la première case
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Créez le plateau \n, quel nom lui donnez vous ? \n nom du plateau : ");
        String name = keyboard.nextLine();
        System.out.println("Choisissez la taille du plateau : ");
        int length = keyboard.nextInt();
        Maps map = new Maps(name, length);
        int map_length = map.getLength();
        System.out.println("Description de la carte : \n nom: " + map.getName() + "Taille : " + map.getLength());
        play(map_length);
    }

    /**
     * Permet de faire jouer le jeu avec la nouvelle map crée par l'user
     * @param map_length La taille de la map
     */
    public void play(int map_length) {
        int player_position = 1; // Le joueur débute à la première case
        boolean play = true;
        while ((player_position < map_length) && (play)) {
            switch (player_input()) {
                case 0:
                    System.out.println("Merci d'avoir joué");
                    System.exit(0);
                    break;
                case 1:
                    try {
                        player_position = moving(player_position, map_length);
                    } catch (Character_out_of_playground e) {
                        System.out.println("exception " + e.getMessage());
                        play = false;
                    break;
                    }

            }
        }
//        Menu menu = new Menu(); // Retour au menu principal
//        menu.menu();
    }

    /**
     * Permet de déplacer le personnage avec un dé
     * @param player_position La position du personnage
     * @param map_length La taille de la map
     * @return La position du joueur : player_position
     * @throws Character_out_of_playground Controller la limite de la map par rapport à la player_position
     */
    public int moving(int player_position, int map_length)  throws Character_out_of_playground {

        Dice_6_faces dice_6_faces = new Dice_6_faces();
        int dice_result = dice_6_faces.roll_dice();
        System.out.println("Lancement du dé de déplacement \n Résultat du dé : " + dice_result);
        player_position += dice_result;

        if (player_position == map_length){
            System.out.println("Bravo vous avez gagné !");
        }
        else if (player_position > map_length) {
            throw new Character_out_of_playground("Le joueur est sorti du plateau");
        }
        else {
            System.out.println("La position du personnage est la case " + player_position);
        }

        return player_position;
    }

//    public boolean playground_limit(int playground_length,int player_position) {
//        boolean playground_end = false;
//        if (player_position >= playground_length) {
//            player_position = playground_length;
//            playground_end = true;
//            System.out.println("Le personnage est arrivé au bout du plateau à la case " + player_position);
//        }
//        return playground_end;
//    }

    /**
     * Donne le choix au joueur à chaque tour de lancer un dé
     * @return Le choix de l'user : player_input
     */
    public int player_input (){
        int player_input;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Que voulez-vous faire ? \n 1 : Lancer un dés de déplacement \n 0 : Quitter le jeu");
        player_input = keyboard.nextInt();
        return player_input;
    }
}
