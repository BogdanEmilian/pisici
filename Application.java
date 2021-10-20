import java.util.Scanner;

public class Application {
    InputDevice inputDevice;
    OutputDevice outputDevice;
    
    String[] board = new String[40];
    
    public String scan(String displayMessage)
    {   
        outputDevice.writeMessage(displayMessage+"\n");
        Scanner scanner = new Scanner(System.in);
        String input="";
        if(scanner.hasNextLine())
            input = scanner.nextLine();
        if(input.contentEquals("")){
            input="0";
            scanner.close();            //Should close only when it's not used anymore, otherwise it goes crazy #tested
        }
        return input;
    }

    public int computeWeight(Fruit[] fruits){
        int totalWeight=0;
        for(int i=0; i<fruits.length; i++)
            totalWeight+=fruits[i].weigth;
        return totalWeight;
    }
    
    
    public int computeSugarContent(Fruit[] fruits){
        int sugarContent=0;
        for(int i=0; i<fruits.length; i++)
            sugarContent+=fruits[i].sugarContent;
        return sugarContent;
    }


    public Application(InputDevice in, OutputDevice out){
        inputDevice = in;
        outputDevice = out;
    }

    public void run(){
        outputDevice.fruits(inputDevice.readFruit());
        outputDevice.writeMessage(computeWeight(inputDevice.readFruit()));
        outputDevice.writeMessage(computeSugarContent(inputDevice.readFruit()));
    }
}
    