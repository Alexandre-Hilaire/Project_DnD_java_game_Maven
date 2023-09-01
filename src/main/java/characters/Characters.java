package characters;

/**
 * Classe abstraite, les classes de personnages héritent d'elle. Elle contient les caractéristiques communes à tout les personnages
 */
public abstract class Characters {
    /**
     * Le nom du personnage
     */
    public String name;
    /**
     * La santé du personnage
     */
    public int health;
    /**
     * La force du personnage
     */
    public int force;
    Characters (String name){
        this.name = name;
    }

    /**
     * Constructeur de personnages
     * @param name Le nom du personnage
     * @param health La santé du personnage
     * @param force La force du personnage
     */
    Characters (String name, int health, int force){
        this.name = name;
        this.health = health;
        this.force = force;
    }

    /**
     * Constructeur vide
     */
    Characters (){
    }

    /**
     * ToString pour afficher les caractéristiques des personnages
     * @return La description des personnage (Nom, Santé, Force)
     */
    public String toString() {
        return this.name + " " + this.health + " " + this.force;
    }

    /**
     * Getter de nom de personnage
     * @return le nom de l'instance actuelle
     */
    public String getName() {
        return this.name;
    }

    /**
     * setter de nom de personnage
     * @param name Le nouveau nom du personnage
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter de vie de personnage
     * @return La vie du personnage de l'instance actuelle
     */
    public int getHealth() {
        return this.health;
    }

    /**
     * Setter de la nouvelle vie du personnage actuel
     * @param health Nouvelle vie du personnage
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Getter de la force du personnage
     * @return la force du personnage de l'instance actuelle
     */
    public int getForce() {
        return this.force;
    }

    /**
     * Setter de force du personnage
     * @param force La nouvelle force du personnage
     */
    public void setForce(int force) {
        this.force = force;
    }

}
