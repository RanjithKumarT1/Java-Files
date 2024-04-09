public class Adder {
     // polymorphism concepts
    // Method Overloading

    // 4 rules
    // 1) Method names should be same
    // 2) number of Parameters should be different
    // 3) Data type of parameters should be different
    // 4) order of Parameter should be different
    int a = 10, b = 30;
    void sum(){
        System.out.println(a+b);
    }

    void sum(int x , int y){
        System.out.println(x+y);
    }

    void sum(int x , double y){
        System.out.println(x+y);
    }
    void sum(double x , int y){
        System.out.println(x+y);
    }
    void sum(int x , int y , int z){
        System.out.println(x+y+z);
    }
}
