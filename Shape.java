public class Shape {
    protected int r,x,y,length,width,c,d,height;
    protected double area,e;
    protected static int cir,tri,squ,tra;
    private int sum;
    public Shape(){
    }
    public int getCir(){
        return cir;
    }
    public int getTri(){
        return tri;
    }
    public int getSqu(){
        return squ;
    }
    public int getTra(){
        return tra;
    }
    public double getArea(){
        return area;
    }
    public double getSum(){
        sum = cir + tri + tra +squ;
        return sum;
    }
}
