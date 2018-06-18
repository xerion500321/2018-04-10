public class Trapezoidal extends Shape {
    public Trapezoidal(int c1,int d1,int height1){
        if(c1>0 && d1>0 && height1>0){
            c = c1;
            d = d1;
            height = height1;
            area = (c + d)*height/2;
            tra ++;
        }
        else {
            System.out.println("請輸入正確的數值");
        }
    }
    public int getTra(){
        return super.getTra();
    }
    public double getArea(){
        return super.getArea();
    }
}
