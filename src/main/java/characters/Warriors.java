package characters;

/**
 * Classe de personnage Warrior qui hérite de la classe abstraite Characters
 */
public class Warriors extends Characters{
//    private String weapon;
    private String shield;

    /**
     * Constructeur d'un Warrior qui a des attributs spécifiques à sa classe comme les boucliers
     * @param name le nom du Guerrier
     * @param health la santé du Guerrier [5, 10]
     * @param force la force du Guerrier [5, 10]
     * @param shield Le bouclier du Warrior
     */
    public Warriors (String name, int health, int force, String shield){
        super(name, health, force);
        this.shield = shield;
    }
    public Warriors (String name){
        super(name);
    }
    public Warriors () {

    }
    @Override
    public String toString() {
        return  "Le nom du Guerrier est " + this.getName() +
                "\n, shield=" + this.getShield() +
                "\n, health=" + this.getHealth() +
                "\n, force=" + this.getForce() +
                '}';
    }

    /**
     * Méthode qui permet la mise à jour des données de l'objet new_warrior crée par l'user
     * @param new_name Le nouveau nom du Warrior
     * @param new_health La nouvelle santé du Warrior
     * @param new_force La nouvelle force du Warrior
     */
    public void update_warrior (String new_name, int new_health, int new_force) {
        this.name = new_name;
        this.health = new_health;
        this.force = new_force;
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

}