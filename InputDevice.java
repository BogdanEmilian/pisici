import java.util.Random;

public class InputDevice {
     
    public String getType(){

        return "random";
    }

    public int nextInt(){

        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1,101);
    }
    
    public int throwDice(){

        Random randomGenerator = new Random();
        return randomGenerator.nextInt(2,13);
    }

    public int[] getNumbers(int N){

        int[] num = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = nextInt();
        }
        
            return num;
    }

    public Fruit[] readFruit(){
        Fruit[] fruit = new Fruit[5];
        fruit[0] = new Apple(Fruit.Color.green, 50, 20, 20);
        fruit[1] = new Banana(100, 50, 20);
        fruit[2] = new Apple(Fruit.Color.yellow, 350, 200, 62);
        fruit[3] = new Apple(Fruit.Color.purple, 250, 62, 130);
        fruit[4] = new Apple(Fruit.Color.blue, 250, 130, 130);
        
        return fruit;

    }

}
