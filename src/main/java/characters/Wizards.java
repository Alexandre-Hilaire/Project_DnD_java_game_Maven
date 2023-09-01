package characters;

/**
 * Classe de personnage Wizards qui hérite de la classe abstraite Characters
 */
public class Wizards extends Characters {
    /**
     * Constructeur du sort amené à disparaitre grâce à sa propre classe
     */
    private String spell;
    /**
     * Constructeur de la potion amené à disparaitre grâce à sa propre classe
     */
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

    /**
     * Constructeur avec juste le nom du wizard
     * @param name Le nom du wizard
     */
    public Wizards (String name) {
        super(name);
    }

    /**
     * Constructeur vide
     */
    public Wizards(){

    }

    /**
     * toString pour afficher les caractéristiques du wizard
     * @return Une chaîne de caractère
     */
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

    /**
     * Getter du sort
     * @return le sort
     */
    public String getSpell() {
        return spell;
    }

    /**
     * Setter du sort
     * @param spell le nouveau sort
     */
    public void setSpell(String spell) {
        this.spell = spell;
    }

    /**
     * Getter de potion
     * @return potion
     */
    public String getPotion() {
        return potion;
    }

    /**
     * setter de potion
     * @param potion La nouvelle potion
     */
    public void setPotion(String potion) {
        this.potion = potion;
    }
}