import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon{

    private static final String type = "water";

    private static final List<String> attacks = Arrays.asList("surf","hydroPump","hydroCanon","rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound,type);
    }



    void surf(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "fire":
                System.out.println(enemy.getName()+" loses 38 hp");
                enemy.setHp(enemy.getHp()-38);
                break;
            case "electric" :
                System.out.println(enemy.getName()+" loses 29 hp");
                enemy.setHp(enemy.getHp()-29);
                break;
            case "grass" :
                System.out.println(enemy.getName()+" loses 25 hp");
                enemy.setHp(enemy.getHp()-25);
                break;
            case "water" :
                System.out.println(enemy.getName()+" loses 18 hp");
                enemy.setHp(enemy.getHp()-18);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }
    void hydroPump(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "fire":
                System.out.println(enemy.getName()+" loses 60 hp");
                enemy.setHp(enemy.getHp()-60);
                break;
            case "electric" :
                System.out.println(enemy.getName()+" loses 30 hp");
                enemy.setHp(enemy.getHp()-30);
                break;
            case "grass" :
                System.out.println(enemy.getName()+" loses 14 hp");
                enemy.setHp(enemy.getHp()-14);
                break;
            case "water" :
                System.out.println(enemy.getName()+" loses 10 hp");
                enemy.setHp(enemy.getHp()-10);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }
    void hydroCanon(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "fire":
                System.out.println(enemy.getName()+" loses 38 hp");
                enemy.setHp(enemy.getHp()-38);
                break;
            case "electric" :
                System.out.println(enemy.getName()+" loses 30 hp");
                enemy.setHp(enemy.getHp()-30);
                break;
            case "grass" :
                System.out.println(enemy.getName()+" loses 25 hp");
                enemy.setHp(enemy.getHp()-25);
                break;
            case "water" :
                System.out.println(enemy.getName()+" loses 18 hp");
                enemy.setHp(enemy.getHp()-18);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }

    void rainDance(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "fire":
                System.out.println(enemy.getName()+" loses 38 hp");
                enemy.setHp(enemy.getHp()-38);
                break;
            case "electric" :
                System.out.println("Has no effect on "+enemy.getName());
                break;
            case "grass" :
                System.out.println(enemy.getName()+" gains 25 hp");
                enemy.setHp(enemy.getHp()+25);
                break;
            case "water" :
                System.out.println(enemy.getName()+" loses 18 hp");
                enemy.setHp(enemy.getHp()-18);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }


    public List<String> getAttacks() {
        return attacks;
    }

}
