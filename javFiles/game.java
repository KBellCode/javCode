import java.util.*;
import java.io.*;
import java.lang.*;

public class game{
  public static void main(String []args) {
    startGame();

  }

  static void startGame(){
    try{
      Console console = System.console();
      System.out.println("Set name (Y) or get name (_)");
      String s = console.readLine();
      if (s.equals("y") | s.equals("Y")){
        String name = setName();
        try{
          System.out.println("name is " + name);
        } catch (Exception e) {
          System.out.println("issue with setname");
        }
      } else {
        String name = getName();
        try{
          System.out.println("name is " + name);
        } catch (Exception e) {
          System.out.println("issue with getname");
        }
      }

      //Console console = System.console();
      System.out.println("how many players (1 to 4):");
      int numPlayers = Integer.parseInt(console.readLine());
      while (numPlayers > 4 || numPlayers <0){
        System.out.println("please enter a num between 1 and 4:");
        numPlayers = Integer.parseInt(console.readLine());
      }

      String[] playerArray = new String[numPlayers];
      for (int i = 0; i < numPlayers; i++){
        if (i == 0){
            playerArray[i] = s;
        } else {
            playerArray[i] = "CPU" + i;
        }
        System.out.println(playerArray.length);
      }
    } catch (Exception e){
      e.printStackTrace();
    }

  }

  void checkLevels(int[] charec){
    //print all in array
    //concatinate strings into sentance
    String responseSent = "The Overall Level is ";
    for(int i = 0; i < charec.length; i++){
      responseSent = responseSent + charec[i] + " ";
    }
  }

  static String getName(){
    //Scanner input = new Scanner(System.in);
    try {
      //BufferedReader reader = new BufferedReader(new FileReader("C:/Users/KatPC/Documents/javFiles/names.txt"));
      File f = new File("names.txt");
      f.createNewFile();
      FileReader fReader = new FileReader(new File("C:/Users/KatPC/Documents/javFiles/names.txt"));
      BufferedReader bReader = new BufferedReader(fReader);
    } catch (Exception e){
      System.out.println("Caught exception: " + e);
      e.printStackTrace();
      BufferedReader bReader = null;
    }

    //bReader.lines();

    try{
      String s;
      while (!(f=bReader.nextLine()).equalsIgnoreCase("stop")){
        s=bReader.readLine();
        System.out.println(s);
      }
      bReader.close();
    } catch (Exception e){
      e.printStackTrace();
    }


    Random rand = new Random();
    //int random_integer = rand.nextInt(reader.length-1) + 1;


  //int randNum = Math.random(1, reader.length);
    //reader.readLine(randNum);


    // randomly select from number of lines
    // readLine method maybe works
    // int read =
    String line = null;
    StringBuilder stringBuilder = new StringBuilder();
    //String ls = System.getProperty("line.separator");
    //String[] lines = myString.split(System.getProperty("line.separator"));

    return "hello2";
    //File file = new File("names.txt");
    //FileReader fr = new FileReader(file);
    //System.out.println(fr);
  }

  //done
  static String setName(){
    //WORKS
    Console console = System.console();
    System.out.println("Enter your name: ");
    String newName = console.readLine();
    return newName;
  }

  //done
  static int randAction(){
    //WORKS
    double x = Math.random();
    System.out.println(x);
    if (x >= 0 && x <0.25){
      return 0;
      // Backwards Direction
    } else if (x >= 0.25 && x <0.5){
      return 1;
      // left Direction
    } else if (x >= 0.5 && x <0.75){
      return 2;
      // forward Direction
    } else {
      return 3;
      // right Direction
    }
  }

  private String randGenRespose(){

    return "abc";
  }

  private void upLevGeneral(){
    //after 20 interactions up general level
  }

  //done
  private void upLevelTalk(int[] charec){
    int x = charec[2];
    x+=1;
    charec[2] = x;
  }

  //done
  int[] levelBuilder(){
    int[] levelCharec = new int[5];
    for(int i = 0; i <levelCharec.length; i++){
      levelCharec[i] = levelCharec[0];
    }

    // overall level, general level, talking, fighting, magic
    return levelCharec;
  }





}
