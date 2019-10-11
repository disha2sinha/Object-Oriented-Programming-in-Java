class Player{
    int number;//where the guess goes
    public void guess(){
        number=(int)(Math.random()*10);
        System.out.println();
    }
}

class Game{
    //class Game has three instance variables for three Player objects
    Player p1;
    Player p2;
    Player p3;
    public void startGame()
    {
        
        //Three player objects are created and assign them to the three Player instance variables
        p1=new Player();
        p2=new Player();
        p3=new Player();

        //
        int guessp1;
        int guessp2;
        int guessp3;

        boolean p1isRight=false;
        boolean p2isRight=false;
        boolean p3isRight=false;

        int target=(int)(Math.random()*10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true)
        {
            System.out.println("Number to be guessed:"+target);

            //calling each player's guess() method
            p1.guess();
            p2.guess();
            p3.guess();

            //get each player's guess() method result by accessing number variable of each player
            guessp1=p1.number;
            System.out.println("Player one guessed:"+guessp1);
            guessp2=p2.number;
            System.out.println("Player two guessed:" + guessp2);
            guessp3=p3.number;
            System.out.println("Player three guessed:" + guessp3);

            if (guessp1==target)
            {
                p1isRight=true;
            }
            if (guessp2 == target) {
                p2isRight = true;
            }
            if (guessp3 == target) {
                p3isRight = true;
            }

            if(p1isRight||p2isRight||p3isRight)
            {
                System.out.println("We have a winner!!!:)");
                System.out.println("Player one got it right?" + p1isRight);
                System.out.println("Player two got it right?" + p2isRight);
                System.out.println("Player three got it right?" + p3isRight);
                System.out.println("Game over!");
                break;
            }
            else{
                System.out.println("Players will have to try again");
            }
        }
    }
}

class GuessingGame{
    public static void main(String args[])
    {
        Game game=new Game();
        game.startGame();
    }
}