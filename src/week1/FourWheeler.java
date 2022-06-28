package week1;

public class FourWheeler implements Transport {
    @Override
    public int timeEstimation(int distance) {
        return distance*2;
    }
}
