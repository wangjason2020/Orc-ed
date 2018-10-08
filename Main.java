import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int intelligence=21;
        int remainder=50-intelligence;
        int strength=remainder/2;
        int agility=remainder-strength;

        double damage=intelligence*5;
        Random rand=new Random();
        double rate=rand.nextDouble()+0.5;

        double turn1=rate*damage;
        rate=rand.nextDouble()+0.5;
        double turn2=rate*damage;
        rate=rand.nextDouble()+0.5;
        double turn3=rate*damage;
        rate=rand.nextDouble()+0.5;
        double turn4=rate*damage;
        rate=rand.nextDouble()+0.5;
        double turn5=rate*damage;
        rate=rand.nextDouble()+0.5;
        double turn6=rate*damage;
        rate=rand.nextDouble()+0.5;
        double turn7=rate*damage;
        rate=rand.nextDouble()+0.5;
        double turn8=rate*damage;
        rate=rand.nextDouble()+0.5;
        double turn9=rate*damage;
        rate=rand.nextDouble()+0.5;
        double turn10=rate*damage;
        rate=rand.nextDouble()+0.5;

        double totaldmg=turn1+turn2+turn3+turn4+turn5+turn6+turn7+turn8+turn9+turn10;
        System.out.println("You dealt "+totaldmg+" damage.");
    }
}
