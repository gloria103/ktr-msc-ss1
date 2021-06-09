public abstract class Character implements Movable {
    protected String name;
    protected int agility = 2;
    protected int life = 50;
    protected int strength = 2;
    protected int wit = 2;
    protected final String RPGClass;

    public Character(String name, String rpgClass) {
        this.name = name;
        this.RPGClass = rpgClass;
    }

    public Character(String name) {
        this(name, Character.class.getSimpleName());
    }

    public Character() {
        this("");
    }

    public String getName() {
        return name;
    }

    public int getAgility() {
        return agility;
    }

    public int getLife() {
        return life;
    }

    public int getStrength() {
        return strength;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public String getRPGClass() {
        return RPGClass;
    }

    public void attack(String weapon) {
        System.out.println(this.name + ": Rrrrrrrrr....");
    }

    // partie 3
    public void moveRight() {
        System.out.println(this.name + ": moves right");
    }

    public void moveLeft() {
        System.out.println(this.name + ": moves left");
    }

    public void moveForward() {
        System.out.println(this.name + ": moves forward");
    }

    public void moveBack() {
        System.out.println(this.name + ": moves back");
    }

    // partie 4
    public final void unsheathe() {
        System.out.println(this.name + ": unsheathes his weapon.");
    }
}
