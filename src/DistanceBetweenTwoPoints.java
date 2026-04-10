import java.util.*;
import java.lang.*;
import java.io.*;

class PointDistance{

    int x1;
    int x2;
    int y1;
    int y2;
    double distance;

    void getInput(Scanner sc){
        this.x1 = sc.nextInt();
        this.y1 = sc.nextInt();
        this.x2 = sc.nextInt();
        this.y2 = sc.nextInt();
    }

    void calculateDistance(){
        distance = Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) );
    }

    void display(){
        System.out.printf("Distance = %.2f \n", distance);
    }

}

public class DistanceBetweenTwoPoints{

    public static void main(String[] args){

        PointDistance pd1 = new PointDistance();
        PointDistance pd2 = new PointDistance();

        Scanner scanner = new Scanner(System.in);

        pd1.getInput(scanner);
        pd1.calculateDistance();
        pd1.display();

        pd2.getInput(scanner);
        pd2.calculateDistance();
        pd2.display();
    }

}