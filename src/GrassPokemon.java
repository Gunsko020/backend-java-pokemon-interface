import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon{

    private static final String type = "grass";

    private static final List<String> attacks = Arrays.asList("leechSeed","leaveBlade","leafStorm","solarBeam");
    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);


    }


    public void leechSeed(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "electric":
                System.out.println(enemy.getName()+" loses 35 hp");
                enemy.setHp(enemy.getHp()-35);
                System.out.println(name.getName()+" gains 35 hp");
                name.setHp(name.getHp()+35);
                break;
            case "fire" :
                System.out.println(enemy.getName()+" loses 30 hp");
                enemy.setHp(enemy.getHp()-30);
                System.out.println(name.getName()+" gains 30 hp");
                name.setHp(name.getHp()+30);
                break;
            case "water" :
                System.out.println(enemy.getName()+" loses 25 hp");
                enemy.setHp(enemy.getHp()-25);
                System.out.println(name.getName()+" gains 25 hp");
                name.setHp(name.getHp()+25);
                break;
            case "grass" :
                System.out.println(enemy.getName()+" loses 15 hp");
                enemy.setHp(enemy.getHp()-15);
                System.out.println(name.getName()+" gains 15 hp");
                name.setHp(name.getHp()+15);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left. ");
        System.out.println(name.getName()+" has "+name.getHp()+" left. ");

    }

    public void leaveBlade(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "electric":
                System.out.println(enemy.getName()+" loses 38 hp");
                enemy.setHp(enemy.getHp()-38);
                break;
            case "fire" :
                System.out.println(enemy.getName()+" loses 30 hp");
                enemy.setHp(enemy.getHp()-30);
                break;
            case "water" :
                System.out.println(enemy.getName()+" loses 23 hp");
                enemy.setHp(enemy.getHp()-23);
                break;
            case "grass" :
                System.out.println(enemy.getName()+" loses 12 hp");
                enemy.setHp(enemy.getHp()-12);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }

    public void leafStorm(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "electric":
                System.out.println(enemy.getName()+" loses 33 hp");
                enemy.setHp(enemy.getHp()-33);
                break;
            case "fire" :
                System.out.println(enemy.getName()+" loses 30 hp");
                enemy.setHp(enemy.getHp()-30);
                break;
            case "water" :
                System.out.println(enemy.getName()+" loses 22 hp");
                enemy.setHp(enemy.getHp()-22);
                break;
            case "grass" :
                System.out.println(enemy.getName()+" loses 19 hp");
                enemy.setHp(enemy.getHp()-19);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }
    public void solarBeam(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "electric":
                System.out.println(enemy.getName()+" loses 38 hp");
                enemy.setHp(enemy.getHp()-38);
                break;
            case "fire" :
                System.out.println(enemy.getName()+" loses 30 hp");
                enemy.setHp(enemy.getHp()-30);
                break;
            case "water" :
                System.out.println(enemy.getName()+" loses 25 hp");
                enemy.setHp(enemy.getHp()-25);
                break;
            case "grass" :
                System.out.println(enemy.getName()+" loses 18 hp");
                enemy.setHp(enemy.getHp()-18);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }

    public List<String> getAttacks() {
        return attacks;
    }


}
