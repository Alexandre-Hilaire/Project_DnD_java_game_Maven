package characters;

/**
 * Classe de personnage Wizards qui hérite de la classe abstraite Characters
 */
public class Wizards extends Characters {
    private String spell;
    private String potion;

    /**
     * Create a Wizard, which is a Character with special attributes as magical tricks.
     * @param name The name of the Wizard
     * @param health The health point [3, 6]
     * @param force The force of the Wizard [8, 15]
     * @param spell Le sort du wizard
     * @param potion La potion du Wizard
     */
    public Wizards(String name, int health, int force, String spell, String potion) {
        super(name, health, force);
        this.spell = spell;
        this.potion = potion;
    }
    public Wizards (String name) {
        super(name);
    }
    public Wizards(){

    }

    @Override
    public String toString() {
        return "Le nom du Mage est" + this.getName() +
                "\n sort : " + this.getSpell() +
                "\n potion : " + this.getPotion() +
                "\n santé : " + this.getHealth() +
                "\n force : "+ this.getForce() +
                '}';
    }

    /**
     * Méthode qui permet de mettre à jour le nouvel objet new_wizards créer par l'user
     * @param new_name Le nouveau nom du wizard
     * @param new_health La nouvelle santé du wizard
     * @param new_force La nouvelle force du wizard
     */
    public void update_wizards (String new_name, int new_health, int new_force) {
        this.name = new_name;
        this.health = new_health;
        this.force = new_force;
    }
    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public String getPotion() {
        return potion;
    }

    public void setPotion(String potion) {
        this.potion = potion;
    }
}