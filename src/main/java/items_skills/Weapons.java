package items_skills;

/**
 * Class de création d'armes
 */
public class Weapons {
    /**
     * Nom de l'arme
     */
    private String name;
    /**
     * Dégats de l'arme
     */
    private int damages;

    /**
     * Créer une arme pour la classe Warrior
     * @param name Nom de l'arme
     * @param damages Dégats de l'arme
     */
    public Weapons(String name, int damages){
        this.name = name;
        this.damages = damages;
    }

    /**
     * Getter de nom de l'arme
     * @return nom de l'arme
     */
    public String getName() {
        return name;
    }

    /**
     * Setter de nom de l'arme
     * @param name nom de l'arme choisi
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter de dégats de l'arme
     * @return Dégats de l'arme
     */
    public int getDamages() {
        return damages;
    }

    /**
     * Setter de dégats de l'arme
     * @param damages Dégats de l'arme choisie
     */
    public void setDamages(int damages) {
        this.damages = damages;
    }
}
