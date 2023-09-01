package game;

/**
 * Classe qui s'occupe des plateaux
 */
public class Maps {
    /**
     * Nom du plateau
     */
    private String name;
    /**
     * Taille du plateau
     */
    private int length;

    /**
     * Créer la nouvelle map selon les choix de l'user
     * @param name Nom de la map
     * @param length Taille du plateau
     */
    Maps(String name, int length){
        this.name = name;
        this.length = length;
    }

    /**
     * Getter de nom de plateau
     * @return Le nom du plateau
     */
    public String getName() {
        return name;
    }

    /**
     * setter du nom de plateau
     * @param name Le nom du plateau choisi
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter de taille de plateau
     * @return Taille du plateau
     */
    public int getLength() {
        return length;
    }

    /**
     *Setter de taille de plateau
     * @param length La taille de plateau choisie
     */
    public void setLength(int length) {
        this.length = length;
    }
}

