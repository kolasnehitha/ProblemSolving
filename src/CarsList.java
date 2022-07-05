import java.util.ArrayList;
import java.util.List;

public class CarsList {
       private static CarsList instance = null;
       private CarsList() {

       }
       public static CarsList getInstance() {
              if (instance == null) {
                     instance = new CarsList();
              }
              return instance;
       }
       static List<Car> carsList=new ArrayList<>();

}
