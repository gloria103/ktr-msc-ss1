import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        // partie 1
        Character perso = new TestCharacter("Jean-Luc");
        System.out.println(perso.getName());
        System.out.println(perso.getLife());
        System.out.println(perso.getAgility());
        System.out.println(perso.getStrength());
        System.out.println(perso.getWit());
        System.out.println(perso.getRPGClass());
        perso.attack("my weapon");

        // partie 2
        System.out.println("============= PARTIE 2");
        Character warrior = new Warrior("Jean-Luc");
        Character mage = new Mage("Robert");
        warrior.attack("hammer");
        mage.attack("magic");
        System.out.println("============= PARTIE 3");
        warrior.moveRight();
        warrior.moveLeft();
        warrior.moveBack();
        warrior.moveForward();
        mage.moveRight();
        mage.moveLeft();
        mage.moveBack();
        mage.moveForward();

    }
}

