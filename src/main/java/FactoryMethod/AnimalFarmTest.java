package FactoryMethod;

import jdk.nashorn.internal.ir.CallNode;

import javax.swing.*;
import java.awt.*;

public class AnimalFarmTest {
    public static void main(String[] args) {
        try {
            Animal a;
            AnimalFarm af;
            af = (AnimalFarm) ReadXML2.getObject();
            assert af != null;
            a = af.newAnimal();
            a.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

/**
 * 抽象产品：动物类
 */
interface Animal{
    public void show();
}

/**
 * 具体产品：马类
 */
class Horse implements Animal{
    JScrollPane sp;
    JFrame jf = new JFrame("工厂方法模式测试");

    public Horse(){
        Container contentPane = jf.getContentPane();
        JPanel pl = new JPanel();
        pl.setLayout(new GridLayout(1,1));
        pl.setBorder(BorderFactory.createTitledBorder("动物：马"));
        sp = new JScrollPane(pl);
        contentPane.add(sp,BorderLayout.CENTER);
        JLabel jl = new JLabel(new ImageIcon("src/main/resources/A_Horse.jpg"));
        pl.add(jl);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void show() {
        jf.setVisible(true);
    }
}

/**
 * 具体产品：牛类
 */
class Cattle implements Animal{
    JScrollPane sp;
    JFrame jf = new JFrame("工厂方法模式测试");

    public Cattle(){
        Container contentPane = jf.getContentPane();
        JPanel pl = new JPanel();
        pl.setLayout(new GridLayout(1,1));
        pl.setBorder(BorderFactory.createTitledBorder("动物：牛"));
        sp = new JScrollPane(pl);
        contentPane.add(sp,BorderLayout.CENTER);
        JLabel jl = new JLabel(new ImageIcon("src/main/resources/A_Cattle.jpg"));
        pl.add(jl);
        jf.pack();
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void show() {
        jf.setVisible(true);
    }
}

/**
 * 抽象工厂：畜牧场
 */
interface AnimalFarm{
    public Animal newAnimal();
}

/**
 * 具体工厂：养马场
 */
class HorseFarm implements AnimalFarm{

    public Animal newAnimal() {
        System.out.println("新马出生！");
        return new Horse();
    }
}

/**
 * 具体工厂：养牛场
 */
class CattleFarm implements AnimalFarm{

    public Animal newAnimal() {
        System.out.println("新牛出生！");
        return new Cattle();
    }
}