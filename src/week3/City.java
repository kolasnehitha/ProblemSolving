package week3;

public class City {
    public static void main(String args[])
    {
        int noOfSusceptiblePeople = 44000;
        int noOfVaccinatedPeople = 2400;
        int noOfInfectedPeople = 6;
        int noOfRecoveredPeople = 2;
        double rateOfInfectedPeople = 0.32;
        double rateOfRecoveredPeople = 0.67;

        SIR sir = new SIRImplementation(noOfSusceptiblePeople,noOfVaccinatedPeople,noOfInfectedPeople,noOfRecoveredPeople,rateOfInfectedPeople,rateOfRecoveredPeople);
        int countOfInfectedPeople = sir.noOfInfectionsPerDay();
        System.out.println("Number of Infected people in a city per day is " +countOfInfectedPeople);
    }
}
