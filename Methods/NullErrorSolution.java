class Test {
    void nullError(String name) {
        System.out.println("name:" + name);
    }

    void nullError(Integer i) {
        System.out.println("integer:" + i);
    }
}

class NullErrorSolution {
    public static void main(String[] args) {
        Test obj = new Test();
        String arg=null;
        obj.nullError(arg);
    }

}