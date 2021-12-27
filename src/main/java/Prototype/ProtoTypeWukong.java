package Prototype;

import javax.swing.*;
import java.awt.*;

public class ProtoTypeWukong {
    public static void main(String[] args) {
        JFrame jf = new JFrame("原型模型测试");
        jf.setLayout(new GridLayout(1,2));
        Container contentPane = jf.getContentPane();
        SunWuKong obj1 = new SunWuKong();
        contentPane.add(obj1);
        SunWuKong obj2 = (SunWuKong) obj1.clone();
        contentPane.add(obj2);
        jf.pack();
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class SunWuKong extends JPanel implements Cloneable{

    private static final long serialVersionUID = -1716256407215028497L;

    public SunWuKong(){
        JLabel l1 = new JLabel(new ImageIcon("src/main/resources/Wukong.jpg"));
        this.add(l1);
    }

    @Override
    public Object clone(){
        SunWuKong w = null;
        try {
            w = (SunWuKong)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("拷贝悟空失败！");
        }
        return w;
    }
}
