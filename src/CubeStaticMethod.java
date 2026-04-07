import java.util.Scanner;

class Cube {
    static int findCube(int n) {
        return n * n * n;
    }
}

public class CubeStaticMethod{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Cube = " + Cube.findCube(n));
    }
}