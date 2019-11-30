
/**
 * ExceptionHandling1
 */
class ControlFlow1 {
    public static void main(String[] args) {
        int d;
        try{
            d=0;
            int a=42/d;
            System.out.println("Inside Try block");
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("After catch");
    }
}
