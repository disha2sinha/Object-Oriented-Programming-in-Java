
/**
 * ExceptionHandling1
 */
class ExceptionHandling1 {
    public static void main(String[] args) {
        int d,a;
        try{
            d=0;
            a=42/d;
        }
        catch(ArithmeticException e){
            System.out.println("By printStackTrace() method");
            e.printStackTrace();//we will get name(e.g. java.lang.ArithmeticException) and
                                // description(e.g. / by zero) of an exception separated by colon, and stack
                                // trace (where in the code, that exception has occurred) in the next line.
            System.out.println(e);
            System.out.println("by toString() mrthod");//we will only get name and description of an exception. Note that this method is overridden in Throwable class.

            System.out.println(e.toString());

            System.out.println("By getMessage()");// we will only get description of an exception.
            System.out.println(e.getMessage());

        }
    }
}