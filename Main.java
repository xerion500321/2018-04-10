import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Shape shape = new Shape();
        boolean flag = true;
        while (flag){
            System.out.println("設置圓形請按1");
            System.out.println("設置三角形請按2");
            System.out.println("設置矩形請按3");
            System.out.println("設置梯形請按4");
            System.out.println("查看建立物件數請按5");
            System.out.println("結束請按6");
            int a = scn.nextInt();
            switch (a){
                case 1:
                    System.out.println("設置半徑");
                    Circle circle = new Circle(scn.nextInt());
                    System.out.println("Area="+circle.getArea());
                    break;
                case 2:
                    System.out.println("設置兩邊及角度");
                    Triangle triangle = new Triangle(scn.nextInt(),scn.nextInt(),scn.nextDouble());
                    System.out.println("Area="+triangle.getArea());
                    break;
                case 3:
                    System.out.println("設置長寬");
                    Square square = new Square(scn.nextInt(),scn.nextInt());
                    System.out.println("Area="+square.getArea());
                    break;
                case 4:
                    System.out.println("設置上底、下底、高");
                    Trapezoidal trapezoidal = new Trapezoidal(scn.nextInt(),scn.nextInt(),scn.nextInt());
                    System.out.println("Area="+trapezoidal.getArea());
                case 5:
                    System.out.println("Circle:"+shape.getCir());
                    System.out.println("Triangle:"+shape.getTri());
                    System.out.println("Square:"+shape.getSqu());
                    System.out.println("Trapezoidal:"+shape.getTra());
                case 6:
                    flag = false;
                    System.out.println("謝謝您的使用!");
                    break;
            }
        }
    }
}
