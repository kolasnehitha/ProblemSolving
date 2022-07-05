import java.util.Scanner;

public class CarManufacture {
    public static void main(String[] args){
        CarsList ListObject=CarsList.getInstance();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Application Starts!!");
        System.out.println("Hello Manufacturer!");
        while(true) {
            System.out.println("Choose any option \n 1-> List of cars \n 2-> Add a new car \n 3-> End application");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    if (ListObject.carsList == null)
                        System.out.println("No cars");
                    else {
                        for (int i = 0; i < ListObject.carsList.size(); i++) {
                            Car car = ListObject.carsList.get(i);
                            System.out.println("\t Name:" + car.getName() + "\t Type:" + car.getType() + "\t Price:" + car.getCost() + "\t Type Of Fuel:" + car.getTypeOfFuel());
                        }
                    }
                    break;
                case 2:
                    Car car = new Car();
                    System.out.println("Enter Car Name:");
                    car.setName(scanner.next());
                    System.out.println("Choose Car Type: \n 1-> Manual Geared \n 2-> Auto Geared");
                    CarType carType = switch (scanner.nextInt()) {
                        case 1 -> new ManualGear();
                        case 2 -> new AutoGear();
                        default -> throw new IllegalStateException("Unexpected value: " + scanner.nextInt());
                    };
                    carType.setCarType(car);
                    System.out.println("Enter cost of the car:");
                    car.setCost(scanner.next());
                    System.out.println("Enter type of the fuel:");
                    car.setTypeOfFuel(scanner.next());
                    ListObject.carsList.add(car);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
