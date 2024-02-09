package JavaCore.OOP;

public class CompareService {

    public void compareGryffindors(Gryffindor gryffindor1, Gryffindor gryffindor2) {
        int total1 = gryffindor1.getSpelling() + gryffindor1.getTransgressing()
                + gryffindor1.getNobility() +
                gryffindor1.getHonor() + gryffindor1.getBravery();
        int total2 = gryffindor2.getSpelling() + gryffindor2.getTransgressing()
                + gryffindor2.getNobility() +
                gryffindor2.getHonor() + gryffindor2.getBravery();

        if (total1 > total2) {
            System.out.println("Gryffindor's student " +
                    gryffindor1.getName() + " " + gryffindor1.getSurname() +
                    " is better, than " +
                    "Gryffindor's student " +
                    gryffindor2.getName() + " " + gryffindor2.getSurname());
        } else {
            System.out.println("Gryffindor's student " +
                    gryffindor2.getName() + " " + gryffindor2.getSurname() +
                    " is better, than " +
                    "Gryffindor's student " +
                    gryffindor1.getName() + " " + gryffindor1.getSurname());
        }
        System.out.println("");

    }

    public void compareSlytherins(Slytherin slytherin1, Slytherin slytherin2) {
        int total1 = slytherin1.getSpelling() + slytherin1.getTransgressing() +
                slytherin1.getSlyness() +
                slytherin1.getDetermination() + slytherin1.getPowerDesire() +
                slytherin1.getAmbition() + slytherin1.getResourcefulness();
        int total2 = slytherin2.getSpelling() + slytherin2.getTransgressing() +
                slytherin2.getSlyness() +
                slytherin2.getDetermination() + slytherin2.getPowerDesire() +
                slytherin2.getAmbition() + slytherin2.getResourcefulness();

        if (total1 > total2) {
            System.out.println("Slytherin's student " +
                    slytherin1.getName() + " " + slytherin1.getSurname() +
                    " is better, than " +
                    "Slytherin's student " +
                    slytherin2.getName() + " " + slytherin2.getSurname());
        } else {
            System.out.println("Slytherin's student " +
                    slytherin2.getName() + " " + slytherin2.getSurname() +
                    " is better, than " +
                    "Slytherin's student " +
                    slytherin1.getName() + " " + slytherin1.getSurname());
        }
        System.out.println("");

    }

    public void compareHufflepuffs(Hufflepuff hufflepuff1, Hufflepuff hufflepuff2) {
        int total1 = hufflepuff1.getSpelling() + hufflepuff1.getTransgressing() +
                hufflepuff1.getDiligence() +
                hufflepuff1.getDevotion() + hufflepuff1.getHonesty();

        int total2 = hufflepuff2.getSpelling() + hufflepuff2.getTransgressing() +
                hufflepuff2.getDiligence() +
                hufflepuff2.getDevotion() + hufflepuff2.getHonesty();

        if (total1 > total2) {
            System.out.println("Hufflepuff's student " +
                    hufflepuff1.getName() + " " + hufflepuff1.getSurname() +
                    " is better, than " +
                    "Hufflepuff's student " +
                    hufflepuff2.getName() + " " + hufflepuff2.getSurname());
        } else {
            System.out.println("Hufflepuff's student " +
                    hufflepuff2.getName() + " " + hufflepuff2.getSurname() +
                    " is better, than " +
                    "Hufflepuff's student " +
                    hufflepuff1.getName() + " " + hufflepuff1.getSurname());
        }
        System.out.println("");
    }

    public void compareRavenclaws(Ravenclaw ravenclaw1, Ravenclaw ravenclaw2) {
        int total1 = ravenclaw1.getSpelling() + ravenclaw1.getTransgressing() +
                ravenclaw1.getCreativity() + ravenclaw1.getWit() +
                ravenclaw1.getWisdom() + ravenclaw1.getSmartness();

        int total2 = ravenclaw2.getSpelling() + ravenclaw2.getTransgressing() +
                ravenclaw2.getCreativity() + ravenclaw2.getWit() +
                ravenclaw2.getWisdom() + ravenclaw2.getSmartness();

        if (total1 > total2) {
            System.out.println("Ravenclaw's student " +
                    ravenclaw1.getName() + " " + ravenclaw1.getSurname() +
                    " is better, than " +
                    "Ravenclaw's student " +
                    ravenclaw2.getName() + " " + ravenclaw2.getSurname());
        } else {
            System.out.println("Ravenclaw's student " +
                    ravenclaw2.getName() + " " + ravenclaw2.getSurname() +
                    " is better, than " +
                    "Ravenclaw's student " +
                    ravenclaw1.getName() + " " + ravenclaw1.getSurname());
        }
        System.out.println("");
    }

    public void compareHogwartsMagic(Hogwarts hogwart1, Hogwarts hogwart2) {
        int total1 = hogwart1.getSpelling() + hogwart1.getTransgressing();
        int total2 = hogwart2.getSpelling() + hogwart2.getTransgressing();

        System.out.print("Hogwart's student ");
        if (total1 > total2) {
            System.out.print(hogwart1.getName() + " " + hogwart1.getSurname());
        } else System.out.print(hogwart2.getName() + " " + hogwart2.getSurname());

        System.out.print("'s magic power is stronger, than " +
                "Hogwart's student ");
        if (total1 < total2) {
            System.out.print(hogwart1.getName() + " " + hogwart1.getSurname());
        } else System.out.print(hogwart2.getName() + " " + hogwart2.getSurname());
        System.out.print("'s");

    }


}

