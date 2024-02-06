package JavaCore.OOP;

public class Main {
    public static void main(String[] args) {
        PrintService printService = new PrintService();
        CompareService compareService = new CompareService();
        Gryffindor harry = new Gryffindor("Harry", "Potter", 8, 9, 10, 10, 10);
        Gryffindor hermione = new Gryffindor("Hermione", "Granger", 10, 10, 8, 9, 3);
        Gryffindor ron = new Gryffindor("Ron", "Weasley", 4, 6, 7, 8, 6);

        printService.print(harry);
        compareService.compareGryffindors(harry, hermione);


        Slytherin draco = new Slytherin("Draco", "Malfoy", 7, 8, 9, 9, 9, 9, 9);
        Slytherin graham = new Slytherin("Graham", "Montague", 8, 8, 7, 8, 3, 8, 7);
        Slytherin gregory = new Slytherin("Gregory", "Goyle", 5, 5, 6, 7, 5, 6, 7);
        printService.print(draco);
        compareService.compareSlytherins(draco, graham);

        Hufflepuff zacharias = new Hufflepuff("Zacharias", "Smith", 8, 9, 10, 10, 10);
        Hufflepuff cedric = new Hufflepuff("Cedric", "Diggory", 4, 6, 7, 8, 6);
        Hufflepuff justin = new Hufflepuff("Justin", "Finch-Fletchley", 10, 10, 8, 9, 3);
        printService.print(zacharias);
        compareService.compareHufflepuffs(zacharias, cedric);


        Ravenclaw cho = new Ravenclaw("Cho", "Chang", 7, 6, 10, 9, 8, 9);
        Ravenclaw padma = new Ravenclaw("Padma", "Patil", 6, 5, 7, 6, 5, 7);
        Ravenclaw marcus = new Ravenclaw("Marcus", "Belby", 8, 5, 8, 5, 8, 6);
        printService.print(marcus);
        compareService.compareRavenclaws(cho, padma);
        compareService.compareHogwartsMagic(padma, cho);

    }
}
