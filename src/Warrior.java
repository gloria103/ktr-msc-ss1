 // partie 2
public class Warrior extends Character {
    protected int agility=2;
    protected int life=100;
    protected int strength=10;
    protected int wit=3;
    protected String RPGClass = "Warior";

    public Warrior(String name) {
        super(name, Warrior.class.getSimpleName());
        System.out.println("" + this.name + ": My name will go down in history!");
    }

    @Override
    public void attack(String weapon) {
        if (weapon.equals("hammer") || weapon.equals("sword"))
        {
            super.attack("");
            System.out.println(this.getName() + ":" + " I'l crush you with my " + weapon);
        }
    }

    @Override
    public void moveRight() {
        System.out.println(this.name + ": moves right like a bad boy.");
    }

    @Override
    public void moveLeft() {
        System.out.println(this.name + ": moves left like a bad boy.");
    }

    @Override
    public void moveForward() {
        System.out.println(this.name + ": moves forward like a bad boy.");
    }

    @Override
    public void moveBack() {
        System.out.println(this.name + ": moves back like a bad boy.");
    }
}
