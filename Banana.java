public class Banana extends Fruit implements Peelable{
    
        public Banana(int weigth, int sugarContent, int waterContent){
            super(Color.yellow, weigth, sugarContent, waterContent);
        }

        @Override
        public boolean hasPeel() {
            // TODO Auto-generated method stub
            return false;
        }

        @Override
        public void peelOff() {
            // TODO Auto-generated method stub
            
        }
}
