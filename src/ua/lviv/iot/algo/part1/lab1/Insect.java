package ua.lviv.iot.algo.part1.lab1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter
@ToString

public class Insect {

    private String name;
    private int numberOfLegs;
    private boolean hasWings;




    public Insect(String name, int numberOfLegs, boolean hasWings, boolean isDangerous, boolean isSleeping) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.hasWings = hasWings;
        this.isDangerous = isDangerous;
        this.isSleeping = isSleeping;
    }
    private static Insect instance = new Insect();
    public Insect() {}

    private boolean isDangerous;
    private boolean isSleeping;

    public static Insect getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isHasWings() {
        return hasWings;
    }

    public void setHasWings(boolean hasWings) {
        this.hasWings = hasWings;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }

    public boolean isSleeping() {
        return isSleeping;
    }

    public void setSleeping(boolean sleeping) {
        isSleeping = sleeping;
    }

    public boolean isPoisonous() {
        return false;
    }

    public void hibernate() {
        isSleeping = true;
    }

    public void wakeUp() {
        isSleeping = false;
    }
    public static void main(String[] args) {

        Insect[] insects = new Insect[4];

        insects[0] = new Insect();

        insects[1] = new Insect("Bee", 6, true, true, false);

        insects[2] =  Insect.getInstance();

        insects[3] =  Insect.getInstance();

        for (int i = 0; i < insects.length; i++) {
            System.out.println("Insect " + (i+1) + " has id: " + insects[i].hashCode());
        }
    }

}
