public class ManualGear implements CarType{

    @Override
    public void setCarType(Car car) {
        car.setType("Manual Geared");
    }
}
