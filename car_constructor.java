public class Car {
    int modelYear;
    String modelName;
    String paintColor;
    
    public Car(int year, String name, String color) {
    modelYear = year;
    modelName = name;
    paintColor = color;
  }

  public static void main(String[] args) {
    Car C1 = new Car(1969, "Mustang","blue");
    Car car2 = new Car(2020,"BMW", "black");
    System.out.println(C1.modelYear + " " + C1.modelName);
    System.out.println(car2.paintColor + " " + car2.modelName + " made in the year " + car2.modelYear);
  }
}
