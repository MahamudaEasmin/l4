public class Lab4 {
    static void method1(){

        System.out.println("Static Method");

    }
    void method2(){
        System.out.println("Non-String Method");

    }
    public static void main(String[] args){
        method1();
        Lab4 obj= new Lab4();
        obj.method2();
    }
}
