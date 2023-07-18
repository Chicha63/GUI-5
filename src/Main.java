import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Map<String, List<Car>> map = new HashMap<>();
        String[] arr = {
                "salon A", "Mercedes", "130000",
                "salon B", "Mercedes", "120000",
                "salon C", "Ford", "110000",
                "salon B", "Opel", "90000",
                "salon C", "Honda", "95000",
                "salon A", "Ford", "105000",
                "salon A", "Renault", "75000"
        };
        fill(map, arr);
        cheapest(map);

        Car car = new Car();
        Car car1 = new Car();
        car.todo();
        System.out.println(car);
        System.out.println(car1);
        car1.todo();
        System.out.println(car1);
        Star star = new Star();
        star.delete(car1);
        Thread.sleep(1000);
        System.out.println(car1);
    }


    public static void cheapest(Map<String, List<Car>> map){
        Car cheapest = null;
        String cheapestSalon = "";
        for (String salon:
             map.keySet()) {
            for (Car car:
                 map.get(salon)) {
                if (cheapest == null || car.price < cheapest.price){
                    cheapest = car;
                    cheapestSalon = salon;
                }
            }
        }
        System.out.println(cheapest.manufacturer + " in " + cheapestSalon + " costs " + cheapest.price);
    }

    public static void fill(Map<String, List<Car>> toFill, String[] arr){
        for(int i = 0; i < arr.length; i+=3){
            List<Car> c;
            if (toFill.get(arr[i]) != null){
                c = (toFill.get(arr[i]));
                c.add(new Car(arr[i+1],Integer.parseInt(arr[i+2])));
                toFill.put(arr[i], c);
            }else {
                c = new ArrayList<>();
                c.add(new Car(arr[i+1], Integer.parseInt(arr[i+2])));
                toFill.put(arr[i], c);
            }
        }
        System.out.println(toFill);
    }
}