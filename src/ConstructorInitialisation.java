class Student{
    int id;
    String name;
    double money;
    Student(int i, String na, double mo){
        id = i;
        name = na;
        money = mo;
    }
}
public class ConstructorInitialisation{
    public static void main(String[] args){

        Student s1 = new Student(101, "ajeet", 45000.0);
        Student s2 = new Student(102, "irfan", 25000.0);

        System.out.println(s1.id + " " + s1.name + " " + s1.money);
        System.out.println(s2.id + " " + s2.name + " " + s2.money);
    }
}