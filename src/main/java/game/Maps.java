package game;

public class Maps {
    private String name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

