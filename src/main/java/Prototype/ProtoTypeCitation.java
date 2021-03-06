package Prototype;

public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        citation obj1 = new citation("张三", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "韶关学院");
        obj1.display();
        citation obj2 = (citation) obj1.clone();
        obj2.setName("李四");
        obj2.display();
    }
}

/**
 * 奖状类
 */
class citation implements Cloneable{
    String name;
    String info;
    String collage;

    citation(String name, String info, String collage) {
        this.name = name;
        this.info = info;
        this.collage = collage;
        System.out.println("奖状创建成功！");
    }

    String getName() {
        return (this.name);
    }

    void setName(String name) {
        this.name = name;
    }

    void display(){
        System.out.println(name + info + collage);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("奖状拷贝成功！");
        return (citation)super.clone();
    }
}
