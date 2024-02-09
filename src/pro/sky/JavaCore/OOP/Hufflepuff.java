package JavaCore.OOP;

public class Hufflepuff extends Hogwarts{

    private int diligence;
    private int devotion;
    private int honesty;

    public Hufflepuff(String name, String surname, int spelling, int transgressing, int diligence, int devotion, int honesty) {
        super(name, surname, spelling, transgressing);
        this.diligence = diligence;
        this.devotion = devotion;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getDevotion() {
        return devotion;
    }

    public void setDevotion(int devotion) {
        this.devotion = devotion;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
