package week1;

import java.util.Scanner;

public class Maps {
    public static void main(String[] args){
        Route routeObject=new Route();
        Scanner sc=new Scanner(System.in);
        int[][] Distance=new int[][]{{1,2,3},{2,4,5},{3,5,6}};
        System.out.println("Enter start Location");
        String startLocation=sc.next();
        System.out.println("Enter end Location");
        String endLocation=sc.next();
        Locations locationslist=new Locations();
        if(!locationslist.checkLocation(startLocation,endLocation)){
            System.out.println("check entered locations");
        }
        else {
            Route routeCalculation = new Route();
            int routeDistance = routeCalculation.distance(startLocation, endLocation, Distance);
            System.out.println("Distance from start point to end point is " + routeDistance + " kms");
            System.out.println("Two types of transports 1. Two Wheeler 2. Three Wheeler \n choose any one");
            Transport transportType = null;
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    transportType = new TwoWheeler();
                    break;
                case 2:
                    transportType = new FourWheeler();
            }
            System.out.println("calculated estimation time :" + transportType.timeEstimation(routeDistance)+" mins");
        }
    }
}
