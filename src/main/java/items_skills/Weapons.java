package items_skills;

public class Weapons {
    private String name;
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
