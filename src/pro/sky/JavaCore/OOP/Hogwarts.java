package JavaCore.OOP;

public class Hogwarts {
    private String name;
    private String surname;
    private int spelling;
    private int transgressing;

    public Hogwarts(String name, String surname, int spelling, int transgressing) {
        this.name = name;
        this.surname = surname;
        this.spelling = spelling;
        this.transgressing = transgressing;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSpelling() {
        return spelling;
    }

    public void setSpelling(int spelling) {
        this.spelling = spelling;
    }

    public int getTransgressing() {
        return transgressing;
    }

    public void setTransgressing(int transgressing) {
        this.transgressing = transgressing;
    }
}
