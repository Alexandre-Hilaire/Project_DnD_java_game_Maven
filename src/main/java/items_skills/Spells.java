package items_skills;

/**
 * Classe de création des sorts
 */
public class Spells {
    /**
     * Nom de sort
     */
    private String name;
    /**
     * Valeur d'effet de sort
     */
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

    /**
     * Getter de nom de sort
     * @return nom de sort
     */
    public String getName() {
        return name;
    }

    /**
     * Setter de nom de sort
     * @param name Le nom de sort choisi
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter de valeur d'effet de sort
     * @return Valeur d'effet
     */
    public int getDamages() {
        return damages;
    }
    /**
     * Setter de valeur d'effet de sort
     * @param damages Valeur d'effet de sort choisie
     */
    public void setDamages(int damages) {
        this.damages = damages;
    }
}
