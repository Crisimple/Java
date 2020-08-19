/**
 * @file OOPThreeFeatures
 * @author crisimple
 * @date 2020/8/19 12:16 下午
 * @description 面向对象三大特征
 */

package com.crisimple.base;

public class OopThreeFeatures {

    public static void main(String[] args) {
        // main 方法
        System.out.println("----- 封装 -----");
        Country country = new Country();
        country.setPeople(20_0000_0000);
        country.getPeople();

        System.out.println("\n----- 继承 -----");
        China china = new China();
        china.setPeople(14_0000_0000);
        System.out.println(china.getPeople());
        System.out.println("\n.....（1）继承之间属性的调用.....");
        china.printName("这是个printName方法的属性名称");
        System.out.println("\n.....（2）继承之间属性的方法.....");
        china.printMethod();
        System.out.println("\n.....（3）继承中的方法重写.....");
        country.method();
        china.method();
        // 这里通过new 子类来初始化对象，是因为子类继承父类会先super调用父类
        Country co = new China();
        China ch = new China();
        co.method();
        ch.method();

    }
}

/**
 * 子类继承父类
 */
class China extends Country {

   private String name = "China的自带属性名称";

    /**
     * 子类的无参构造器
     */
   public China(){
//       super();   隐藏的代码，也可以显示写，调用了父类的无参构造器
       String name = "中国";
   }

    /**
     * 子类的有参构造器
     * @param name
     */
   public China(String name){
       System.out.println("China 的有参构造器" + name);
   }

   public void printName(String name) {
       System.out.println(name);
       System.out.println(this.name);
       System.out.println(super.getName());
   }

   public void printMethod() {
        printS();
        this.printS();
        super.printF();
   }

   public void printS() {
       System.out.println("China Method");
   }

   @Override
   public void method() {
       System.out.println("China.method()");
   }
}

/**
 * 封装实例
 */
class Country extends Object {
    /**
    * 类的私有属性
    */
   private String name = "我是父类的自导属性名称";
   private float area;
   private double people;

    /**
     * 统一提供一些可以操作这个属性的方法，set/get方法
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public double getPeople() {
        return people;
    }

    public void setPeople(double people) {
        if (people > 10_0000_0000) {
            this.people = people;
            System.out.println("超大国家");
        } else {
            System.out.println("小国家");
        }
    }

    public void printF() {
        System.out.println("County Method");
    }

    public void method() {
        System.out.println("Country.method()");
    }
}
