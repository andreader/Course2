package pro.sky.javacore.oop_intro.hw3;

public class Human3 {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

    Human3(int yearOfBirth) {
        this(yearOfBirth, "-no information-", "-no information-", "-no information-");
    }

    Human3(int yearOfBirth, String name) {
        this(yearOfBirth, name, "-no information-", "-no information-");
    }

    Human3(int yearOfBirth, String name, String town) {
        this(yearOfBirth, name, town, "-no information-");

    }

    Human3(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }

        if (name == "" || name == null || name == " ") {
            this.name = "-no information-";
        } else this.name = name;

        if (town == "" || town == null || town == " ") {
            this.town = "-no information-";
        } else this.town = town;

        if (jobTitle == "" || jobTitle == null || jobTitle == " ") {
            this.jobTitle = "-no information-";
        } else this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Hi! My name is " + this.name + " and I'm from " + this.town + ". I was born in " +
                this.yearOfBirth + " year. " + "I'm a " + this.jobTitle + ". Nice to meet you.";
    }
}
