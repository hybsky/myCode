public class ReWrite {
    public static void main(String[] args) {
        StudentRe s = new StudentRe(1,"zs",12);
        System.out.println(s);
        StudentRe s2 = new StudentRe(1,"zs",12);
        System.out.println(s.equal(s2));
    }
}
class StudentRe{
    private int id;
    private String name;
    private int age;
    public StudentRe(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    public String toString() {
//        return id  + name + age;
//    }


    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean equal(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof StudentRe){
            StudentRe s = (StudentRe)obj;
            if (this.id != s.id){
                return false;
            }
            if(!this.name.equals(s.name)){
                return false;
            }
            if(this.age != s.age){
                return false;
            }
            return true;
        }
        return false;
    }
}
