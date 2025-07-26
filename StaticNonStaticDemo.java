public class StaticNonStaticDemo {
    static int staticVar = 10;
           int nonStaticVar = 20;

    public static void main(String[] args) {
        StaticNonStaticDemo obj1 = new StaticNonStaticDemo();
        StaticNonStaticDemo obj2 = new StaticNonStaticDemo();

        obj1.staticVar = 30;
        obj1.nonStaticVar = 40;

        System.out.println("obj1 - staticVar: " + obj1.staticVar);      
        System.out.println("obj1 - nonStaticVar: " + obj1.nonStaticVar); 

        System.out.println("obj2 - staticVar: " + obj2.staticVar);      
        System.out.println("obj2 - nonStaticVar: " + obj2.nonStaticVar); 
    }
}