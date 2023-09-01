package items_skills;

public class Spells {
    private String name;
    private int damages;

    /**
     * Créer un objet sort pour le wizard
     * @param name Nom du sort
     * @param damages Points d'effet du sort
     */
    public Spells(String name, int damages){
        this.name = name;
        this.damages = damages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamages() {
        return damages;
    }

    public void setDamages(int damages) {
        this.damages = damages;
    }
}
