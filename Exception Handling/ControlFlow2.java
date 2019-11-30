class ControlFlow2 {
    public static void main(String[] args) {
        int d;
        try {
            d = 0;
            int a = 42 / d;
            System.out.println("Inside Try block");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("After catch");
        }
        System.out.println("Outside Try-catch-finally block");
    }
}