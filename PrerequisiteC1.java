//Create a program with both static and non-static variables and explain how they behave

class StaticNonStaticExample {
    static int staticVar = 10;
    int nonStaticVar = 5;

    public static void main(String[] args) {
        StaticNonStaticExample obj = new StaticNonStaticExample();
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Non-Static Variable: " + obj.nonStaticVar);

        staticVar = 20;
        obj.nonStaticVar = 15;

        StaticNonStaticExample obj2 = new StaticNonStaticExample();
        System.out.println("Static Variable (obj2): " + staticVar);
        System.out.println("Non-Static Variable (obj2): " + obj2.nonStaticVar);
    }
}
