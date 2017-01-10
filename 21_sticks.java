import java.io.Console;
import java.util.*;
class Game {
  int sticks =21;
  String msg ="Don't fuck with me, choose a valid number";
  public Game(){
    Start();
  }
  public void Start(){
  int input =0;
  while (input == 0){
    try {

    input = Integer.parseInt(System.console().readLine("Let's Play! Pick your sticks(between 1 and 4): "));
  } catch (NumberFormatException e)
  {
    System.out.println(msg);
    continue;
    // break;
  }
}
    if (input < 1 || input > 4)
    {
      System.out.println(msg);

    } else {
    System.out.println("You picked: " + input+" sticks");
    sticks = sticks - input;
    Random rand= new Random();
    int x = rand.nextInt(4)+1;
    System.out.println("The computer picked "+ x+" sticks");
    sticks= sticks - x;
  }
}
  public boolean Play()
  {
    for(int turns = 1; sticks >= 1; turns = turns + 1) {
      try {
    // System.out.println("turn n°: "+turns);
    if (sticks ==2 || sticks == 1)
    {
      System.out.println("You WON!");
      return true;
      // break;
      //  stick = -2;
    }
    if (sticks ==1)
    {
      System.out.println("You loose");
      return true;
    }

    int input2 = Integer.parseInt(System.console().readLine("Your turn (pick 1 or 2 sticks): "));
    if (input2 < 1 || input2 > 2)
    {
      System.out.println(msg);
      Play();
    }
    sticks = sticks - input2;
    if (sticks ==2)
    {
      System.out.println("You loose booh!");
      return true;
    }
    if (sticks ==1)
    {
      System.out.println("You WON!");
      return true;
    }
    Random rand= new Random();
    int x = rand.nextInt(2)+1;
    System.out.println("the computer picked "+ x+" sticks");
    sticks= sticks - x;
    System.out.println("there are "+sticks+" left");
  }
  catch (NumberFormatException e) {
    System.out.println(msg);
    Play();

  }
}
return true;
  }
  public static void main(String []args) {
    Game game=new Game();
     game.Start();
    System.out.println(game.sticks);
    // for(int turns = 1; game.sticks >= 3; turns = turns + 1) {
    game.Play();

    System.out.println(game.sticks);
  }
}
