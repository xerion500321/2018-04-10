public class Circle extends Shape {
    public Circle(int r1) {
        if (r1 > 0) {
            r = r1;
            area = (r * r * Math.PI);
            cir++;
        } else {
            System.out.println("請輸入正確的數值");
        }
    }
    public int getCir() {
      return super.getCir();
    }
    public double getArea(){
        return super.getArea();
    }
}
