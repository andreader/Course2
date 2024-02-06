package JavaCore.OOP;

public class Slytherin extends Hogwarts {
    private int slyness;
    private int determination;
    private int powerDesire;
    private int ambition;
    private int resourcefulness;

    public Slytherin(String name, String surname, int spelling, int transgressing, int slyness, int determination, int powerDesire, int ambition, int resourcefulness) {
        super(name, surname, spelling, transgressing);
        this.slyness = slyness;
        this.determination = determination;
        this.powerDesire = powerDesire;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
    }

    public int getSlyness() {
        return slyness;
    }

    public void setSlyness(int slyness) {
        this.slyness = slyness;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getPowerDesire() {
        return powerDesire;
    }

    public void setPowerDesire(int powerDesire) {
        this.powerDesire = powerDesire;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
}
