public class OutputDevice{
    public void writeMessage(String message){
        System.out.println(message);
    }

    public void writeMessage(int message){
        System.out.println(message);
    }

    public void arrayPrint(int[] num){
        for (int i = 0; i < num.length; i++ )
            System.out.print(num[i] + " ");
    }

    public void color(Fruit.Color col){
        System.out.println(col);
    }

    public void fruits(Fruit[] fruit){
        for(int i=0; i<fruit.length; i++){
            writeMessage(fruit[i].getClass().getName());
            color(fruit[i].color);
            writeMessage(fruit[i].weigth);
            writeMessage(fruit[i].sugarContent);
            writeMessage(fruit[i].waterContent + "\n");
        }

    }
}