// partie 2
public class Mage extends Character {
    protected int agility=10;
    protected int life=70;
    protected int strength=3;
    protected int wit=10;
    protected String RPGClass = "Mage";

    public Mage(String name) {
        super(name, Mage.class.getSimpleName());
        System.out.println("[" + this.getName() + "]: May the gods be with me.");
    }

    @Override
    public void attack(String weapon) {
        if (weapon.equals("magic") || weapon.equals("wand"))
        {
            super.attack("");
            System.out.println(this.getName() + ":" + " Feel the power of my " + weapon);
        }
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right furtively.");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left furtively.");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward furtively.");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back furtively.");
    }
}
