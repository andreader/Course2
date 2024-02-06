package JavaCore.OOP;

public class PrintService {
    public void print(Gryffindor gryffindor) {
            System.out.println("Gryffindor's student" +
                    ", name - " + gryffindor.getName() +
                    ", surname - " + gryffindor.getSurname() +
                    ", spelling = " + gryffindor.getSpelling() +
                    ", transgressing = " + gryffindor.getTransgressing() +
                    ", nobility = " + gryffindor.getNobility() +
                    ", honor = " + gryffindor.getHonor() +
                    ", bravery = " + gryffindor.getBravery());
        System.out.println("");
    }

    public void print(Slytherin slytherin) {
            System.out.println("Slytherin's student" +
                    ", name - " + slytherin.getName() +
                    ", surname - " + slytherin.getSurname() +
                    ", spelling = " + slytherin.getSpelling() +
                    ", transgressing = " + slytherin.getTransgressing() +
                    ", slyness = " + slytherin.getSlyness() +
                    ", determination = " + slytherin.getDetermination() +
                    ", powerDesire = " + slytherin.getPowerDesire() +
                    ", ambition = " + slytherin.getAmbition() +
                    ", resourcefulness = " + slytherin.getResourcefulness());
        System.out.println("");
    }

    public void print(Hufflepuff hufflepuff) {
            System.out.println("Hufflepuff's student" +
                    ", name - " + hufflepuff.getName() +
                    ", surname - " + hufflepuff.getSurname() +
                    ", spelling = " + hufflepuff.getSpelling() +
                    ", transgressing = " + hufflepuff.getTransgressing() +
                    ", diligence = " + hufflepuff.getDiligence() +
                    ", devotion = " + hufflepuff.getDevotion() +
                    ", honesty = " + hufflepuff.getHonesty());
        System.out.println("");
    }

    public void print(Ravenclaw ravenclaw) {
            System.out.println("Ravenclaw's student" +
                    ", name - " + ravenclaw.getName() +
                    ", surname - " + ravenclaw.getSurname() +
                    ", spelling = " + ravenclaw.getSpelling() +
                    ", transgressing = " + ravenclaw.getTransgressing() +
                    ", smartness = " + ravenclaw.getSmartness() +
                    ", wisdom = " + ravenclaw.getWisdom() +
                    ", wit = " + ravenclaw.getWit() +
                    ", creativity = " + ravenclaw.getCreativity());
        System.out.println("");
    }
}
