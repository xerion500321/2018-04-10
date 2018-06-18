public class Square extends Shape{
    public Square(int length1,int width1){
       if(length1>0 && width1>0){
           length = length1;
           width = width1;
           area = length*width;
           squ ++;
       }
       else {
           System.out.println("請輸入正確的數值");
       }
    }

    public int getSqu() {
        return super.getSqu();
    }
    public double getArea(){
        return super.getArea();
    }
}
