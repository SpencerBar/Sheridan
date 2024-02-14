package Monsters;

public class Start {
    public static void main(String[] args){
        System.out.println(MonsterSpecies.GASTLY.getBaseDEF());
        System.out.println(MonsterSpecies.GASTLY.getTypeEffectiveness("NORMAL"));
        System.out.println(MonsterSpecies.GASTLY.getTypeEffectiveness("GRASS"));
        System.out.println(MonsterSpecies.MOLTRES.getTypeEffectiveness("GRASS"));
    }
}
