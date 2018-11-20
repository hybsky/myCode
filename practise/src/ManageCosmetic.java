import java.util.Arrays;

public class ManageCosmetic {
    public static void main(String[] args) {
        importCosmeticManager cm = new importCosmeticManager();
        cm.add(new Cosmetic("雅诗兰黛","进口",1000));
        cm.add(new Cosmetic("郁美净","国产",5));
        cm.add(new Cosmetic("香奈儿","进口",800));
        cm.add(new Cosmetic("大宝","国产",20));
        cm.show();
    }
}
//定义一个化妆品类（Cosmetic）name,type,price
class Cosmetic{
    private String name;
    private String type;
    private int price;

    public Cosmetic(String name,String type,int price){
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void print(){
        System.out.println(name + "," + type + "," + price);
    }
}
/*
 * 定义一个化妆品管理类（CosmeticManager）
 * （1）实现进货功能
 * （2）可以输出所有化妆品信息功能
 */
class CosmeticManager{
    protected Cosmetic[] cs = new Cosmetic[5];
    protected int count = 0;
    public void add(Cosmetic c){
        if (cs.length == count){
            cs = Arrays.copyOf(cs , cs.length * 2);
        }
        cs[count] = c;
        count++;
    }
    public void show(){
        for (Cosmetic c:cs){
            if (c != null){
                c.print();
            }
        }
    }
}
//使用继承实现一个可按单价排序输出所有化妆品的功能
class SortCosmeticManager extends CosmeticManager{
    public void show() {
        Cosmetic[] css = Arrays.copyOf(cs,cs.length);
        for (int i = 0; i < count; i++){
            for (int j = i; j < count; j++){
                if (css[i].getPrice() > css[j].getPrice()){
                    Cosmetic temp = css[i];
                    css[i] = css[j];
                    css[j] = temp;
                }
            }
        }
        for (Cosmetic c:css){
            if (c != null){
                c.print();
            }
        }
    }
}
//使用继承实现一个只输出进口化妆品的功能
class importCosmeticManager extends CosmeticManager{
    public void show() {
        for (int i = 0; i < count; i++){
            if (cs[i].getType().equals("进口")){
                cs[i].print();
            }
        }
//        for (Cosmetic c:cs){
//            if (c != null){
//                if(c.getType().equals("进口")){
//                    c.print();
//                }
//            }
//        }
    }
}