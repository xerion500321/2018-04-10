public class Triangle extends Shape {
    public Triangle(int x1,int y1,double e1){
        if(x1>0 && y1>0 && e1<=180){
            x = x1;
            y = y1;
            e = e1;
            area = x*y*Math.sin(e);
            tri ++;
        }
        else {
            System.out.println("請輸入正確的數值");
        }
    }
    public int getTri(){
        return super.getTri();
    }
    public double getArea(){
        return super.getArea();
    }
}
