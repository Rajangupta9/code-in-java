import java.util.*;

Class Guesser
{
    int guessnum;

    int guessingNumber()
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Guesser ! kindly guess the number");
        guessnum = scan.nextInt();
        return guessnum;
    } 
}
class player
{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("player! kindly guess teh number");
        guessNum = scan.nextInt();
        return guessNum;

    }

}

class umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

   void collectNumFromGusser()
    {
      Guesser g = new Guesser();
      numFromGuesser = g.guessingNumber();
    }
    void collectNumFromplayer()
    {
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();

       numFromPlayer1 = p1.guessingNumber();
       numFromPlayer2 = p2.guessingNumber();
       numFromPlayer3 = p3.guessingNumber();

    }
    void compare(){
        if (numFromGuesser == numFromPlayer1){
        System.out.println("Player 1 won the game");
        }

        else if(numFromGuesser == numFromPlayer2){
        System.out.println("Player 2 won the game");
        }

        else if(numFromGuesser == numFromPlayer3){
        System.out.println("Player 3 won the game");
        } 

        else{
        System.out.println("all are wrong . no one win the game "); 
        }

    }

}



public class launchgame
{
    public static void main(String[] args) {
        System.out.println("game started");
        umpire u = new umpire();
        u.collectNumFromGusser();
        u.collectNumFromplayer();
        u.compare();

    }
}