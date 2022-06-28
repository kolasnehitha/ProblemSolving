package week1;

import java.util.*;
public class Route {
   int distance(String startLocation,String endLocation,int[][] distanceList){
       int xCoordinate=LocationsList.locationsList.indexOf(startLocation);
       int yCoordinate=LocationsList.locationsList.indexOf(endLocation);
       return distanceList[xCoordinate][yCoordinate];
   }
}
