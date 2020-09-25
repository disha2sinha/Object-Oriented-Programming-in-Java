import java.util.Scanner;
// Banking System
// class Account---name,balance,credit
// 2 method----1. Deposit 2. Withdraw
// Constraint... balance<3000 ==> print...

class Account {
    String name;
    double balance;

    Account(String n, double m) {
        name = n;
        balance = m;
    }

    void deposit(double sal) {
        balance += sal;
    }

    void withdraw(double with) {
        balance -= with;
        if (balance < 3000) {
            System.out.println("Minimum balance not maintained!");
        }
    }

    void display() {
        System.out.println("The account balance is: " + balance);
    }
}

class banking {
    public static void main(String[] args) { // args[0]-name, args[1]-balance
        String fullName = args[0];
        double bal = Integer.parseInt(args[1]);
        Account person1 = new Account(fullName, bal);
        boolean i = true;
        while (i) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("1. Deposit\n2. Withdraw\n3. See Balance: ");
            int option = myObj.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter balance:");
                    double blnce1 = myObj.nextDouble();
                    person1.deposit(blnce1);
                    break;
                case 2:
                    System.out.println("Enter balance:");
                    double blnce2 = myObj.nextDouble();
                    person1.withdraw(blnce2);
                    break;
                case 3:
                    person1.display();
                    break;
                default:
                    i = false;
                    break;
            }
        }

    }
}