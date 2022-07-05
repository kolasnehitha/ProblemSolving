public class Automatic implements Gear{
    @Override
    public void setCarType(Car car) {
        car.setType("Auto Geared");
    }
}
