package week3;

public class SIRImplementation implements SIR {
    int noOfSusceptiblePeople,noOfVaccinatedPeople,noOfInfectedPeople,noOfRecoveredPeople;
    double rateOfInfection,rateOfRecovery;
    SIRImplementation(int noOfSusceptiblePeople, int noOfVaccinatedPeople, int noOfInfectedPeople, int noOfRecoveredPeople, double rateOfInfection, double rateOfRecovery){
        this.noOfSusceptiblePeople=noOfSusceptiblePeople;
        this.noOfVaccinatedPeople=noOfVaccinatedPeople;
        this.noOfInfectedPeople=noOfInfectedPeople;
        this.noOfRecoveredPeople=noOfRecoveredPeople;
        this.rateOfInfection=rateOfInfection;
        this.rateOfRecovery=rateOfRecovery;
    }
    @Override
    public int noOfInfectionsPerDay() {
        noOfSusceptiblePeople = noOfSusceptiblePeople - noOfVaccinatedPeople;
        noOfInfectedPeople = (int)(noOfInfectedPeople + rateOfInfection*noOfSusceptiblePeople*noOfInfectedPeople);
        noOfSusceptiblePeople = (int)(noOfSusceptiblePeople - rateOfInfection*noOfSusceptiblePeople*noOfInfectedPeople);
        noOfRecoveredPeople = (int)(noOfRecoveredPeople + rateOfRecovery*noOfInfectedPeople);
        noOfInfectedPeople = (int)(noOfInfectedPeople - rateOfRecovery*noOfInfectedPeople);
        return noOfInfectedPeople;
    }
}

