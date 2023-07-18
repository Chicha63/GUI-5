public class Car {
    String manufacturer;
    int price;
    Car(String m, int p){
        manufacturer = m;
        price = p;
    }
    Car(){
        manufacturer = "";
        price = 2147483647;
    }
    public void todo(){

    }
    @Override
    public String toString(){
        return (manufacturer + " " + price);
    }
}
