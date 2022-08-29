package lesson_06;

public class Person {
    String tckn;
    String firstName;
    String lastName;

    /*
    Person sınıfının içerisinde CarTest tipinde bir nesne yarattık.
     */
    CarTest vehicle;

    public String getInfo(){
        String info = "Person Info : " + tckn + " " + firstName + " " + lastName;
        if(vehicle != null){
            info +=" and has a car. " + vehicle.getInfo();
        }
        else{
            info += " and has no car.";
        }
        return info;
    }
}
