public class roster{
    String studentName;
    int studentAge;
    int studentGrade;
    
    public roster(String name, int age, int grade){
    studentName = name;
    studentAge = age;
    studentGrade = grade;}
    
    public static void main(String [] args){
        roster student1 = new roster("Sade Adu, ",8, 3);
        roster student2 = new roster("Avril Lavagne, ", 16, 10);
        
        System.out.println("Hello, my name is " + student1.studentName + "and I am in grade level " + student1.studentGrade + " and I am " + student1.studentAge + " years old.");
        System.out.println("Hola, my name is " + student2.studentName + "and I am in grade level " + student2.studentGrade + " and I am " + student2.studentAge + " years old.");
    }
}


//$javac roster.java
//$java -Xmx128M -Xms16M roster
//Hello, my name is Sade Adu, and I am in grade level 3 and I am 8 years old.
//Hola, my name is Avril Lavagne, and I am in grade level 10 and I am 16 years old.
