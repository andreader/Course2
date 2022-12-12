package pro.sky.javacore.incapsulation.hw1;

public class Human1 {
    private int yearOfBirth;
    private String name;
    private String town;
    private String jobTitle;

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0)
            this.yearOfBirth = 0;
        else this.yearOfBirth = yearOfBirth;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "-no information-";
        } else this.town = town;
    }

    public void setName (String name) {
        if (name == null || name.isEmpty() || name.isBlank())
            this.name = "-no information-";
        else this.name = name;
    }

    public void setJobTitle (String jobTitle) {
        if (jobTitle == null || jobTitle.isBlank() || jobTitle.isEmpty())
            this.jobTitle = "-no information-";
        else this.jobTitle = jobTitle;
    }

    public Human1(int yearOfBirth, String name, String town, String jobTitle) {
        setYearOfBirth(yearOfBirth);
        setName(name);
        setTown(town);
        setJobTitle(jobTitle);
    }

    public Human1(int yearOfBirth) {
        this(yearOfBirth, "-no information-", "-no information-", "-no information-");
    }

    public Human1(int yearOfBirth, String name) {
        this(yearOfBirth, name, "-no information-", "-no information-");
    }

    public Human1(int yearOfBirth, String name, String town) {
        this(yearOfBirth, name, town, "-no information-");

    }
    @Override
    public String toString() {
        return "Hi! My name is " + getName() + " and I'm from " + getTown() + ". I was born in " +
                getYearOfBirth() + " year. " + "I'm a " + getJobTitle() + ". Nice to meet you.";
    }
}
