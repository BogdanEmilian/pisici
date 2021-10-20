public abstract class Fruit {

    int weigth, sugarContent, waterContent;
    Color color;

    enum Color{
        red,
        yellow, 
        orange, 
        brown, 
        green, 
        blue, 
        purple
    }

    public Fruit(Color color, int weigth, int sugarContent, int waterContent){
        this.color=color;
        this.weigth=weigth;
        this.sugarContent=sugarContent;
        this.waterContent=waterContent;
    }
}
