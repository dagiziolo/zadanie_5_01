public class CalculatorFunction {

    void funcion(double x, double y){
        if(x>y){
            double z = x+y;
            System.out.println(z);
        } else if(x<y) {
            double z = x*y;
            System.out.println(z);
        } else {
            double z =x*x;
            System.out.println(z);
        }
    }
}
