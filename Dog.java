public class Dog {
    int dogAge;
    String dogName;
    String furColor;
    String dogBreed;
    
    public Dog(int age, String name, String color, String breed) {
    dogAge = age;
    dogName = name;
    furColor = color;
    dogBreed = breed;
  }

  public static void main(String[] args) {
    Dog Kylie = new Dog(2, "Kylie","brown", "Yorkie");
    Dog Techno = new Dog(7,"Techno", "black and golden", "Pit Bull");
    System.out.println(Kylie.dogAge + " " + Kylie.dogName);
    System.out.println(Techno.dogName + " is  " + Techno.dogAge );
   
  }
}
