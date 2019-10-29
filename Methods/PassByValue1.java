class PassByValue1{
    public static void main(String[] args) {
        int i=0;
        change(i);
        System.out.println("i="+i);
    }
    public static void change(int i)
    {
        i=10;
    }
}