package pro.sky.javacore.oop_intro.hw2;

public class Human2 {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human2(int yearOfBirth, String name, String town, String jobTitle) {
        this.yearOfBirth = yearOfBirth;
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Hi! My name is " + this.name +
                " and I'm from " + this.town +
                "! I was born in " + this.yearOfBirth + " year. " +
                "I'm a " + this.jobTitle +
                ". Nice to meet you!";
    }
}
