import java.util.*;

class Guesser
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

class Player
{
    int guessNum;
    int guessingNumber()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player ! kindly guess the number");
        guessNum = scan.nextInt();
        return guessNum;
    }
}

class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser()
    {
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayer()
    {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }

    void compare()
    {
        if (numFromGuesser == numFromPlayer1)
        {
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
            {
                System.out.println("all players gave correct answer : all are winner");
            }
            else if(numFromGuesser==numFromPlayer2)
            {
                System.out.println("player 1 and player 2 won the game ");
            }
            else if(numFromGuesser==numFromPlayer3)
            {
                System.out.println("player 1 and player 3 won the game ");
            }
            else
            {
            System.out.println("Player 1 won the game");
            }
        }
        else if(numFromGuesser == numFromPlayer2)
        {
            if(numFromGuesser == numFromPlayer3)
            {
                System.out.println("player 2 and player 3 won the game ");
            }
            else{
                System.out.println("Player 2 won the game");
            }
            
        }
        else if(numFromGuesser == numFromPlayer3)
        {
            System.out.println("Player 3 won the game");
        } 
        else
        {
            System.out.println("All are wrong. No one wins the game."); 
        }
    }
}

public class launch_game
{
    public static void main(String[] args)
    {
        System.out.println("Game started");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
}
