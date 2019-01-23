public class CalculatorFunction {

    void funcion(double x, double y){
        double z;
        if(x>y){
            z = x+y;
        } else if(x<y) {
            z = x*y;
        } else {
            z =x*x;
        }
        System.out.println(z);
    }
}
