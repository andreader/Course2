package pro.sky.javacore.oop_intro.hw1;

public class Human1 {
    public int yearOfBirth;
    public String name;
    public String town;
    public String jobTitle;

    @Override
    public String toString() {
        return "Hi! My name is " + this.name +
                " and I'm from " + this.town +
                "! I was born in " + this.yearOfBirth + " year. " +
                "I'm a " + this.jobTitle +
                ". Nice to meet you!";
    }
}
