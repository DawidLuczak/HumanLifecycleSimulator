package dawid.luczak;



import dawid.luczak.model.*;
import dawid.luczak.model.human.Baby;
import dawid.luczak.model.human.Human;
import dawid.luczak.model.human.Kid;
import dawid.luczak.model.human.Teenager;

public class App
{
    public static void main( String[] args )
    {
        Human h1 = new BabyGirl("Dawid", "Cziki");
        Human h3 = new KidBoy((Baby) h1);
        System.out.println(h1);
        Human h2 = null;
        while (!(h1 instanceof Corps)) {
            h1 = h1.growUp();
            if (h1 instanceof Kid){
                h1.setSecondName("Siemasz");
            }
            h1.happy();
            h1.excitement();
            h1.sad();
        }
        
      
        
        System.out.println(h3);
        Kid h4 = (Kid) h3.growUp();
        Kid h5 = h4.hello();
        System.out.println("h5: " + h5);
        
        
    }
}
