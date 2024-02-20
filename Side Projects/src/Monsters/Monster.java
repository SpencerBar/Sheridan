package Monsters;
import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Monster {
    private  int idgen = 0;
    private int number;
    private int id;
    private final Types type1;
    private final Types type2;
    private final String[] moves;
    private final int HP;
    private final int ATK;
    private final int DEF;
    private final int SpATK;
    private final int SpDEF;
    private final int Spe;
    private final HashMap<String,Float> effect;
    private int currentHP;
    private int level;
    //private int exp;
    private LevelGroup levelGroup;

    public Monster(MonsterSpecies newMon,int level){
    
    this.number = newMon.getNumber();
    this.id =getID(number, idgen);  
    this.type1= newMon.getType1();
    this.type2= newMon.getType2();
    this.moves = newMon.getMoves();
    this.HP = newMon.getBaseHP()+ getIv();
    this.ATK = newMon.getBaseATK()+ getIv();
    this.DEF = newMon.getBaseDEF()+ getIv();
    this.SpATK = newMon.getBaseSpATK()+ getIv();
    this.SpDEF = newMon.getBaseSpDEF()+ getIv();
    this.Spe = newMon.getBaseSPE()+ getIv();
    this.effect = newMon.getEffect();
    this.currentHP = HP;
    this.level = level;
    this.levelGroup = newMon.getLevelGroup();
    //this.exp = ned to account for exp at level and level group


    }

    //GETTERS
    public int getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }

    public Types getType1() {
        return type1;
    }

    public Types getType2() {
        return type2;
    }

    public String[] getMoves() {
        return moves;
    }

    public int getHP() {
        return HP;
    }

    public int getATK() {
        return ATK;
    }

    public int getDEF() {
        return DEF;
    }

    public int getSpATK() {
        return SpATK;
    }

    public int getSpDEF() {
        return SpDEF;
    }

    public int getSpe() {
        return Spe;
    }

    public HashMap<String, Float> getEffect() {
        return effect;
    }



    //determine ivs
    private static int getIv(){
    int randomNum = ThreadLocalRandom.current().nextInt(0, 15 + 1);
    return randomNum;
    }
    //generate uniqueID
    private static int getID(int number,  int idgen){
        int id = number + idgen + 1000000;
        ++idgen;
        return id;
    }
}
