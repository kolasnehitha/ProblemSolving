package week1;

public class Locations {

//this method is to check whether the entered locations are existing in the LocationsList or not
    boolean checkLocation(String startLocation,String endLocation){
        if(LocationsList.locationsList.contains(startLocation) && LocationsList.locationsList.contains(endLocation))
            return true;
        else
            return false;
    }
}
