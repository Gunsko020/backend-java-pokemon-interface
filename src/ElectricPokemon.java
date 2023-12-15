import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    private static final String type = "electric";

    private static final List<String> attacks = Arrays.asList("ThunderPunch", "ElectroBall", "Thunder", "VoltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound ) {
        super(name, level, hp, food, sound, type);
    }



    void thunderPunch(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "water":
                System.out.println(enemy.getName()+" loses 35 hp");
                enemy.setHp(enemy.getHp()-35);
                break;
            case "grass" :
                System.out.println(enemy.getName()+" loses 30 hp");
                enemy.setHp(enemy.getHp()-30);
                break;
            case "fire" :
                System.out.println(enemy.getName()+" loses 25 hp");
                enemy.setHp(enemy.getHp()-25);
                break;
            case "electric" :
                System.out.println(enemy.getName()+" loses 15 hp");
                enemy.setHp(enemy.getHp()-15);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");


    }

    void electroBall(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "water":
                System.out.println(enemy.getName()+" loses 38 hp");
                enemy.setHp(enemy.getHp()-38);
                break;
            case "grass" :
                System.out.println(enemy.getName()+" loses 32 hp");
                enemy.setHp(enemy.getHp()-32);
                break;
            case "fire" :
                System.out.println(enemy.getName()+" loses 25 hp");
                enemy.setHp(enemy.getHp()-25);
                break;
            case "electric" :
                System.out.println(enemy.getName()+" loses 15 hp");
                enemy.setHp(enemy.getHp()-15);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }

    void thunder(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "water":
                System.out.println(enemy.getName()+" loses 35 hp");
                enemy.setHp(enemy.getHp()-35);
                break;
            case "grass" :
                System.out.println(enemy.getName()+" loses 30 hp");
                enemy.setHp(enemy.getHp()-30);
                break;
            case "fire" :
                System.out.println(enemy.getName()+" loses 25 hp");
                enemy.setHp(enemy.getHp()-25);
                break;
            case "electric" :
                System.out.println(enemy.getName()+" gains 15 hp");
                enemy.setHp(enemy.getHp()+15);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }

    void voltTackle(Pokemon name, Pokemon enemy){
        System.out.println(name.getName()+" attacks "+enemy.getName());
        switch (enemy.getType()){
            case "water":
                System.out.println(enemy.getName()+" loses 35 hp");
                enemy.setHp(enemy.getHp()-35);
                break;
            case "grass" :
                System.out.println(enemy.getName()+" loses 30 hp");
                enemy.setHp(enemy.getHp()-30);
                break;
            case "fire" :
                System.out.println(enemy.getName()+" loses 25 hp");
                enemy.setHp(enemy.getHp()-25);
                break;
            case "electric" :
                System.out.println(enemy.getName()+" loses 15 hp");
                enemy.setHp(enemy.getHp()-15);
        }
        System.out.println(enemy.getName()+" has "+enemy.getHp()+" left.");

    }

    public List<String> getAttacks() {
        return attacks;
    }

}
