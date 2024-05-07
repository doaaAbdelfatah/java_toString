package living;

public class Demo {

    public static void main(String[] args) {

        Bird b = new Bird(); // child LivingOrganism
        Lion l = new Lion();
        Fish f = new Fish();
        AfricanLion al = new AfricanLion();

        list(l);
        list(b);
        list(f);
        list(al);
    }
   static void list (LivingOrganism x){
        x.eat();
        x.breath();
        x.drink();
        x.move();
    }
}
