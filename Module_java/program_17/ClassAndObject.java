package program_17;
class  Car{
    String make;
    String model;
    String date;
    Car(String make,String model,String date){
        this.make = make;
        this.model = model;
        this.date = date;
    }
    public void displayDetails(){
        System.out.println("Make:"+this.make+" Model:"+this.model+" Year:"+this.date);
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        Car obj = new Car("honda","1","2023");
        obj.displayDetails();
    }
}
