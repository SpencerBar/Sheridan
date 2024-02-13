package Monsters;

public enum Types {
    NORMAL(new String[]{"FIGHTING"}, new String[]{}, new String[]{"GHOST"}),
    FIRE(new String[]{"WATER", "ROCK", "GROUND"}, new String[]{"FIRE", "GRASS", "ICE", "BUG"}, new String[]{}),
    WATER(new String[]{"ELECTRIC", "GRASS"}, new String[]{"WATER", "FIRE", "ICE", "STEEL"}, new String[]{}),
    ELECTRIC(new String[]{"GROUND"}, new String[]{"ELECTRIC", "FLYING"}, new String[]{}),
    GRASS(new String[]{"FIRE", "ICE", "POISON", "FLYING", "BUG"}, new String[]{"WATER", "ELECTRIC", "GRASS", "GROUND"}, new String[]{}),
    ICE(new String[]{"FIRE", "FIGHTING", "ROCK"}, new String[]{"ICE"}, new String[]{}),
    FIGHTING(new String[]{"PSYCHIC", "FLYING"}, new String[]{"BUG", "ROCK"}, new String[]{}),
    POISON(new String[]{"GROUND", "PSYCHIC"}, new String[]{"GRASS", "FIGHTING", "POISON", "BUG"}, new String[]{}),
    GROUND(new String[]{"WATER", "GRASS", "ICE"}, new String[]{"POISON", "ROCK"}, new String[]{"ELECTRIC"}),
    FLYING(new String[]{"ELECTRIC", "ICE", "ROCK"}, new String[]{"FIGHTING", "BUG", "GRASS"}, new String[]{}),
    PSYCHIC(new String[]{"BUG", "GHOST"}, new String[]{"FIGHTING", "PSYCHIC"}, new String[]{}),
    BUG(new String[]{"FIRE", "FLYING", "ROCK"}, new String[]{"GRASS", "FIGHTING", "GROUND"}, new String[]{}),
    ROCK(new String[]{"WATER", "GRASS", "FIGHTING", "GROUND"}, new String[]{"NORMAL", "FIRE", "POISON", "FLYING"}, new String[]{}),
    GHOST(new String[]{"GHOST", "DARK"}, new String[]{"POISON", "BUG"}, new String[]{"NORMAL", "FIGHTING"}),
    DRAGON(new String[]{"ICE", "DRAGON"}, new String[]{"FIRE", "WATER", "ELECTRIC", "GRASS"}, new String[]{}),
    NULL(new String[]{},new String[]{},new String[]{});

    String[] weaknesses;
    String[] resistances;
    String[] immunities;

    Types(String[] weaknesses, String[] resistances, String[] immunities) {
        this.weaknesses = weaknesses;
        this.resistances = resistances;
        this.immunities = immunities;
    }
}


