public class Apple extends Fruit implements SeedRemovable{
    public Apple(Color color, int weigth, int sugarContent, int waterContent){
        super(color, weigth, sugarContent, waterContent);
    }

    @Override
    public boolean hasSeeds() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void removeSeeds() {
        // TODO Auto-generated method stub
        
    }
}
