package NestedClass;
interface Age {
    int x = 21;

    void getAge();
}

class NestedClass5 {
    public static void main(String[] args) {

        // Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it
        // is created.
        Age oj1 = new Age() {
            @Override
            public void getAge() {
                // printing age
                System.out.print("Age is " + x);
            }
        };
        oj1.getAge();
    }
}