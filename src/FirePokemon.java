import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {
    private static final String type = "fire";

    private final List<String>attacks = Arrays.asList("Inferno", "PyroBall", "FireLash", "FlameThrower");


    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);

    }

    void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "grass":
                System.out.println(enemy.getName()+" loses 35 hp");
                enemy.setHp(enemy.getHp()-35);
            break;
            case "water" :
                System.out.println(enemy.getName()+" loses 30 hp");
                enemy.setHp(enemy.getHp()-30);
            break;
            case "electric" :
                System.out.println(enemy.getName()+" loses 25 hp");
                enemy.setHp(enemy.getHp()-25);
            break;
            case "fire" :
                System.out.println(enemy.getName()+" loses 15 hp");
                enemy.setHp(enemy.getHp()-15);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");
    }

    void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "grass":
                System.out.println(enemy.getName()+" loses 38 hp");
                enemy.setHp(enemy.getHp()-38);
                break;
            case "water" :
                System.out.println(enemy.getName()+" loses 30 hp");
                enemy.setHp(enemy.getHp()-30);
                break;
            case "electric" :
                System.out.println(enemy.getName()+" loses 25 hp");
                enemy.setHp(enemy.getHp()-25);
                break;
            case "fire" :
                System.out.println(enemy.getName()+" loses 18 hp");
                enemy.setHp(enemy.getHp()-18);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }
    void fireLash(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "grass":
                System.out.println(enemy.getName()+" loses 60 hp");
                enemy.setHp(enemy.getHp()-60);
                break;
            case "water" :
                System.out.println(enemy.getName()+" loses 50 hp");
                enemy.setHp(enemy.getHp()-50);
                break;
            case "electric" :
                System.out.println(enemy.getName()+" loses 25 hp");
                enemy.setHp(enemy.getHp()-25);
                break;
            case "fire" :
                System.out.println(enemy.getName()+" loses 15 hp");
                enemy.setHp(enemy.getHp()-15);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }

    void flameThrower(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "grass":
                System.out.println(enemy.getName()+" loses 43 hp");
                enemy.setHp(enemy.getHp()-43);
                break;
            case "water" :
                System.out.println(enemy.getName()+" loses 37 hp");
                enemy.setHp(enemy.getHp()-37);
                break;
            case "electric" :
                System.out.println(enemy.getName()+" loses 27 hp");
                enemy.setHp(enemy.getHp()-27);
                break;
            case "fire" :
                System.out.println(enemy.getName()+" loses 17 hp");
                enemy.setHp(enemy.getHp()-17);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }


    public List<String> getAttacks() {
        return attacks;
    }

}
