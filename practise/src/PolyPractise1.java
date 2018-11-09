public class PolyPractise1 {
    public static void main(String[] args) {
        BenzPoly b1 = new BenzPoly();
        System.out.println(b1.getColorPoly());
        CarPoly c1 = new BenzPoly();
        System.out.println(c1.getColorPoly());
    }
}
class CarPoly{
    private String color = "无色";
    public String getColorPoly() {
        return color;
    }
    public void setColorPoly(String color){
        this.color = color;
    }
}
class BenzPoly extends CarPoly{
    private String color = "黑色";
    public String getColorPoly() {
        return color;
        //return super.getColorPoly();
    }
//    public void setColorPoly(String color){
//        //this.color = color;
//        super.setColorPoly(color);
//    }
}