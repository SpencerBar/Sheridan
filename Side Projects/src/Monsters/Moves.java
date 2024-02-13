package Monsters;
import java.util.HashMap;
import java.util.Map;

public class Moves {
    public static Map<String, String[]> moveLists = new HashMap<>();
    static {
        moveLists.put("BULBASAUR", new String[]{"Tackle", "Growl", "Leech Seed", "Vine Whip"});
        moveLists.put("IVYSAUR", new String[]{"Tackle", "Growl", "Leech Seed", "Vine Whip", "Poison Powder", "Razor Leaf", "Growth", "Sleep Powder"});
        moveLists.put("VENUSAUR", new String[]{"Tackle", "Growl", "Leech Seed", "Vine Whip", "Poison Powder", "Razor Leaf", "Growth", "Sleep Powder", "Solar Beam"});
        moveLists.put("CHARMANDER", new String[]{"Scratch", "Growl", "Ember", "Leer", "Rage", "Slash", "Flamethrower", "Fire Spin"});
        moveLists.put("CHARMELEON", new String[]{"Scratch", "Growl", "Ember", "Leer", "Rage", "Slash", "Flamethrower", "Fire Spin"});
        moveLists.put("CHARIZARD", new String[]{"Scratch", "Growl", "Ember", "Leer", "Rage", "Slash", "Flamethrower", "Fire Spin", "Fire Blast"});
        moveLists.put("SQUIRTLE", new String[]{"Tackle", "Tail Whip", "Bubble", "Water Gun", "Withdraw", "Bite", "Skull Bash"});
        moveLists.put("WARTORTLE", new String[]{"Tackle", "Tail Whip", "Bubble", "Water Gun", "Withdraw", "Bite", "Skull Bash"});
        moveLists.put("BLASTOISE", new String[]{"Tackle", "Tail Whip", "Bubble", "Water Gun", "Bite", "Withdraw", "Skull Bash", "Hydro Pump"});
        moveLists.put("CATERPIE", new String[]{"Tackle", "String Shot"});
        moveLists.put("METAPOD", new String[]{"Tackle", "String Shot", "Harden"});
        moveLists.put("BUTTERFREE", new String[]{"Confusion", "String Shot", "Poison Powder", "Stun Spore", "Sleep Powder", "Psybeam", "Supersonic", "Whirlwind"});
        moveLists.put("WEEDLE", new String[]{"Poison Sting", "String Shot"});
        moveLists.put("KAKUNA", new String[]{"Poison Sting", "String Shot", "Harden"});
        moveLists.put("BEEDRILL", new String[]{"Peck", "String Shot", "Focus Energy", "Twin Needle", "Rage", "Fury Attack", "Fury Swipes", "Pin Missile"});
        moveLists.put("PIDGEY", new String[]{"Gust", "Sand-Attack", "Quick Attack", "Whirlwind", "Wing Attack", "Agility", "Mirror Move"});
        moveLists.put("PIDGEOTTO", new String[]{"Gust", "Sand-Attack", "Quick Attack", "Whirlwind", "Wing Attack", "Agility", "Mirror Move"});
        moveLists.put("PIDGEOT", new String[]{"Gust", "Sand-Attack", "Quick Attack", "Whirlwind", "Wing Attack", "Agility", "Mirror Move", "Sky Attack"});
        moveLists.put("RATTATA", new String[]{"Tackle", "Tail Whip", "Quick Attack", "Hyper Fang", "Focus Energy", "Bite", "Scary Face", "Super Fang"});
        moveLists.put("RATICATE", new String[]{"Tackle", "Tail Whip", "Quick Attack", "Hyper Fang", "Focus Energy", "Bite", "Scary Face", "Super Fang"});
        moveLists.put("SPEAROW", new String[]{"Peck", "Growl", "Leer", "Fury Attack", "Pursuit", "Aerial Ace", "Mirror Move"});
        moveLists.put("FEAROW", new String[]{"Peck", "Growl", "Leer", "Fury Attack", "Pursuit", "Aerial Ace", "Mirror Move"});
        moveLists.put("EKANS", new String[]{"Wrap", "Leer", "Poison Sting", "Bite", "Glare", "Screech", "Acid"});
        moveLists.put("ARBOK", new String[]{"Wrap", "Leer", "Poison Sting", "Bite", "Glare", "Screech", "Acid"});
        moveLists.put("PIKACHU", new String[]{"Thunder Shock", "Growl", "Thunder Wave", "Quick Attack", "Electro Ball", "Double Team", "Slam", "Thunderbolt"});
        moveLists.put("RAICHU", new String[]{"Thunder Shock", "Growl", "Thunder Wave", "Quick Attack", "Electro Ball", "Double Team", "Slam", "Thunderbolt"});
        moveLists.put("SANDSHREW", new String[]{"Scratch", "Defense Curl", "Sand-Attack", "Poison Sting", "Slash", "Swift", "Fury Swipes", "Sand Tomb"});
        moveLists.put("SANDSLASH", new String[]{"Scratch", "Defense Curl", "Sand-Attack", "Poison Sting", "Slash", "Swift", "Fury Swipes", "Sand Tomb"});
        moveLists.put("NIDORAN♀️", new String[]{"Tackle", "Growl", "Scratch", "Double Kick", "Poison Sting", "Tail Whip", "Bite", "Helping Hand"});
        moveLists.put("NIDORINA", new String[]{"Tackle", "Growl", "Scratch", "Double Kick", "Poison Sting", "Tail Whip", "Bite", "Helping Hand"});
        moveLists.put("NIDOQUEEN", new String[]{"Tackle", "Growl", "Scratch", "Double Kick", "Poison Sting", "Tail Whip", "Bite", "Helping Hand"});
        moveLists.put("NIDORAN♂️", new String[]{"Tackle", "Growl", "Scratch", "Double Kick", "Poison Sting", "Tail Whip", "Bite", "Helping Hand"});
        moveLists.put("NIDORINO", new String[]{"Tackle", "Growl", "Scratch", "Double Kick", "Poison Sting", "Tail Whip", "Bite", "Helping Hand"});
        moveLists.put("NIDOKING", new String[]{"Tackle", "Growl", "Scratch", "Double Kick", "Poison Sting", "Tail Whip", "Bite", "Helping Hand"});
        moveLists.put("CLEFAIRY", new String[]{"Pound", "Growl", "Sing", "Double Slap", "Minimize", "Metronome", "Defense Curl", "Light Screen"});
        moveLists.put("CLEFABLE", new String[]{"Pound", "Growl", "Sing", "Double Slap", "Minimize", "Metronome", "Defense Curl", "Light Screen"});
        moveLists.put("VULPIX", new String[]{"Ember", "Tail Whip", "Quick Attack", "Roar", "Confuse Ray", "Imprison", "Flamethrower", "Will-O-Wisp"});
        moveLists.put("NINETALES", new String[]{"Ember", "Tail Whip", "Quick Attack", "Roar", "Confuse Ray", "Imprison", "Flamethrower", "Will-O-Wisp"});
        moveLists.put("JIGGLYPUFF", new String[]{"Sing", "Pound", "Disable", "Defense Curl", "Double Slap", "Rest", "Body Slam", "Double-Edge"});
        moveLists.put("WIGGLYTUFF", new String[]{"Sing", "Pound", "Disable", "Defense Curl", "Double Slap", "Rest", "Body Slam", "Double-Edge"});
        moveLists.put("ZUBAT", new String[]{"Leech Life", "Supersonic", "Bite", "Confuse Ray", "Wing Attack", "Haze", "Swift"});
        moveLists.put("GOLBAT", new String[]{"Leech Life", "Supersonic", "Bite", "Confuse Ray", "Wing Attack", "Haze", "Swift"});
        moveLists.put("ODDISH", new String[]{"Absorb", "Sweet Scent", "Acid", "Poison Powder", "Stun Spore", "Sleep Powder", "Petal Dance"});
        moveLists.put("GLOOM", new String[]{"Absorb", "Sweet Scent", "Acid", "Poison Powder", "Stun Spore", "Sleep Powder", "Petal Dance"});
        moveLists.put("VILEPLUME", new String[]{"Absorb", "Sweet Scent", "Acid", "Poison Powder", "Stun Spore", "Sleep Powder", "Petal Dance"});
        moveLists.put("PARAS", new String[]{"Scratch", "Stun Spore", "Leech Life", "Fury Swipes", "Spore", "Slash", "Growth"});
        moveLists.put("PARASECT", new String[]{"Scratch", "Stun Spore", "Leech Life", "Fury Swipes", "Spore", "Slash", "Growth"});
        moveLists.put("VENONAT", new String[]{"Tackle", "Disable", "Foresight", "Supersonic", "Confusion", "Poison Powder", "Leech Life"});
        moveLists.put("VENOMOTH", new String[]{"Tackle", "Disable", "Foresight", "Supersonic", "Confusion", "Poison Powder", "Leech Life"});
        moveLists.put("DIGLETT", new String[]{"Scratch", "Growl", "Magnitude", "Dig", "Sand-Attack", "Slash", "Earthquake"});
        moveLists.put("DUGTRIO", new String[]{"Scratch", "Growl", "Magnitude", "Dig", "Sand-Attack", "Slash", "Earthquake"});
        moveLists.put("MEOWTH", new String[]{"Scratch", "Growl", "Bite", "Pay Day", "Faint Attack", "Screech", "Fury Swipes"});
        moveLists.put("PERSIAN", new String[]{"Scratch", "Growl", "Bite", "Pay Day", "Faint Attack", "Screech", "Fury Swipes"});
        moveLists.put("PSYDUCK", new String[]{"Scratch", "Tail Whip", "Disable", "Confusion", "Disable", "Water Gun", "Disable", "Confusion"});
        moveLists.put("GOLDUCK", new String[]{"Scratch", "Tail Whip", "Disable", "Confusion", "Disable", "Water Gun", "Disable", "Confusion"});
        moveLists.put("MANKEY", new String[]{"Scratch", "Low Kick", "Leer", "Focus Energy", "Karate Chop", "Fury Swipes", "Seismic Toss", "Cross Chop"});
        moveLists.put("PRIMEAPE", new String[]{"Scratch", "Low Kick", "Leer", "Focus Energy", "Karate Chop", "Fury Swipes", "Seismic Toss", "Cross Chop"});
        moveLists.put("GROWLITHE", new String[]{"Bite", "Roar", "Ember", "Leer", "Odor Sleuth", "Take Down", "Flame Wheel", "Agility"});
        moveLists.put("ARCANINE", new String[]{"Bite", "Roar", "Ember", "Leer", "Odor Sleuth", "Take Down", "Flame Wheel", "Agility"});
        moveLists.put("POLIWAG", new String[]{"Water Gun", "Hypnosis", "Bubble", "Double Slap", "Body Slam", "Amnesia", "Hydro Pump"});
        moveLists.put("POLIWHIRL", new String[]{"Water Gun", "Hypnosis", "Bubble", "Double Slap", "Body Slam", "Amnesia", "Hydro Pump"});
        moveLists.put("POLIWRATH", new String[]{"Water Gun", "Hypnosis", "Bubble", "Double Slap", "Body Slam", "Amnesia", "Hydro Pump", "Dynamic Punch"});
        moveLists.put("ABRA", new String[]{"Teleport"});
        moveLists.put("KADABRA", new String[]{"Confusion", "Disable", "Psybeam", "Recover", "Future Sight", "Reflect", "Psycho Cut"});
        moveLists.put("ALAKAZAM", new String[]{"Confusion", "Disable", "Psybeam", "Recover", "Future Sight", "Reflect", "Psycho Cut", "Psychic"});
        moveLists.put("MACHOP", new String[]{"Karate Chop", "Low Kick", "Leer", "Focus Energy", "Seismic Toss", "Submission", "Strength"});
        moveLists.put("MACHOKE", new String[]{"Karate Chop", "Low Kick", "Leer", "Focus Energy", "Seismic Toss", "Submission", "Strength"});
        moveLists.put("MACHAMP", new String[]{"Karate Chop", "Low Kick", "Leer", "Focus Energy", "Seismic Toss", "Submission", "Strength", "Vital Throw"});
        moveLists.put("BELLSPROUT", new String[]{"Vine Whip", "Growth", "Wrap", "Sleep Powder", "Poison Powder", "Stun Spore", "Acid"});
        moveLists.put("WEEPINBELL", new String[]{"Vine Whip", "Growth", "Wrap", "Sleep Powder", "Poison Powder", "Stun Spore", "Acid"});
        moveLists.put("VICTREEBEL", new String[]{"Vine Whip", "Growth", "Wrap", "Sleep Powder", "Poison Powder", "Stun Spore", "Acid"});
        moveLists.put("TENTACOOL", new String[]{"Poison Sting", "Supersonic", "Wrap", "Acid", "Bubble Beam", "Barrier", "Screech"});
        moveLists.put("TENTACRUEL", new String[]{"Poison Sting", "Supersonic", "Wrap", "Acid", "Bubble Beam", "Barrier", "Screech"});
        moveLists.put("GEODUDE", new String[]{"Tackle", "Defense Curl", "Rock Throw", "Self-Destruct", "Harden", "Magnitude", "Earthquake"});
        moveLists.put("GRAVELER", new String[]{"Tackle", "Defense Curl", "Rock Throw", "Self-Destruct", "Harden", "Magnitude", "Earthquake"});
        moveLists.put("GOLEM", new String[]{"Tackle", "Defense Curl", "Rock Throw", "Self-Destruct", "Harden", "Magnitude", "Earthquake"});
        moveLists.put("PONYTA", new String[]{"Tackle", "Growl", "Tail Whip", "Ember", "Stomp", "Flame Wheel", "Fire Spin", "Take Down"});
        moveLists.put("RAPIDASH", new String[]{"Tackle", "Growl", "Tail Whip", "Ember", "Stomp", "Flame Wheel", "Fire Spin", "Take Down"});
        moveLists.put("SLOWPOKE", new String[]{"Confusion", "Disable", "Headbutt", "Growl", "Water Gun", "Amnesia", "Psychic"});
        moveLists.put("SLOWBRO", new String[]{"Confusion", "Disable", "Headbutt", "Growl", "Water Gun", "Amnesia", "Psychic"});
        moveLists.put("MAGNEMITE", new String[]{"Tackle", "Sonic Boom", "Thunder Shock", "Supersonic", "Thunder Wave", "Spark", "Electro Ball", "Lock-On"});
        moveLists.put("MAGNETON", new String[]{"Tackle", "Sonic Boom", "Thunder Shock", "Supersonic", "Thunder Wave", "Spark", "Electro Ball", "Lock-On"});
        moveLists.put("FARFETCH'D", new String[]{"Peck", "Sand-Attack", "Leer", "Fury Attack", "Swords Dance", "Agility", "Slash"});
        moveLists.put("DODUO", new String[]{"Peck", "Growl", "Quick Attack", "Rage", "Fury Attack", "Tri Attack", "Drill Peck"});
        moveLists.put("DODRIO", new String[]{"Peck", "Growl", "Quick Attack", "Rage", "Fury Attack", "Tri Attack", "Drill Peck"});
        moveLists.put("SEEL", new String[]{"Headbutt", "Growl", "Aurora Beam", "Rest", "Take Down", "Ice Beam", "Safeguard"});
        moveLists.put("DEWGONG", new String[]{"Headbutt", "Growl", "Aurora Beam", "Rest", "Take Down", "Ice Beam", "Safeguard"});
        moveLists.put("GRIMER", new String[]{"Pound", "Disable", "Poison Gas", "Sludge", "Harden", "Screech", "Acid Armor"});
        moveLists.put("MUK", new String[]{"Pound", "Disable", "Poison Gas", "Sludge", "Harden", "Screech", "Acid Armor"});
        moveLists.put("SHELLDER", new String[]{"Tackle", "Withdraw", "Supersonic", "Aurora Beam", "Protect", "Leer", "Clamp"});
        moveLists.put("CLOYSTER", new String[]{"Tackle", "Withdraw", "Supersonic", "Aurora Beam", "Protect", "Leer", "Clamp"});
        moveLists.put("GASTLY", new String[]{"Lick", "Hypnosis", "Night Shade", "Confuse Ray", "Dream Eater", "Destiny Bond"});
        moveLists.put("HAUNTER", new String[]{"Lick", "Hypnosis", "Night Shade", "Confuse Ray", "Dream Eater", "Destiny Bond"});
        moveLists.put("GENGAR", new String[]{"Lick", "Hypnosis", "Night Shade", "Confuse Ray", "Dream Eater", "Destiny Bond", "Shadow Punch"});
        moveLists.put("ONIX", new String[]{"Tackle", "Screech", "Bind", "Rock Throw", "Harden", "Rage", "Slam", "Rock Slide"});
        moveLists.put("DROWZEE", new String[]{"Pound", "Hypnosis", "Disable", "Confusion", "Headbutt", "Poison Gas", "Meditate", "Psychic"});
        moveLists.put("HYPNO", new String[]{"Pound", "Hypnosis", "Disable", "Confusion", "Headbutt", "Poison Gas", "Meditate", "Psychic"});
        moveLists.put("KRABBY", new String[]{"Bubble", "Leer", "Vice Grip", "Harden", "Mud Shot", "Stomp", "Crabhammer"});
        moveLists.put("KINGLER", new String[]{"Bubble", "Leer", "Vice Grip", "Harden", "Mud Shot", "Stomp", "Crabhammer"});
        moveLists.put("VOLTORB", new String[]{"Tackle", "Screech", "Sonic Boom", "Self-Destruct", "Rollout", "Light Screen", "Swift"});
        moveLists.put("ELECTRODE", new String[]{"Tackle", "Screech", "Sonic Boom", "Self-Destruct", "Rollout", "Light Screen", "Swift"});
        moveLists.put("EXEGGCUTE", new String[]{"Barrage", "Hypnosis", "Reflect", "Leech Seed", "Poison Powder", "Stun Spore", "Sleep Powder"});
        moveLists.put("EXEGGUTOR", new String[]{"Barrage", "Hypnosis", "Reflect", "Leech Seed", "Poison Powder", "Stun Spore", "Sleep Powder"});
        moveLists.put("CUBONE", new String[]{"Bone Club", "Growl", "Tail Whip", "Bite", "Leer", "Focus Energy", "Thrash"});
        moveLists.put("MAROWAK", new String[]{"Bone Club", "Growl", "Tail Whip", "Bite", "Leer", "Focus Energy", "Thrash"});
        moveLists.put("HITMONLEE", new String[]{"Double Kick", "Jump Kick", "Focus Energy", "High Jump Kick", "Meditate", "Foresight", "Mind Reader"});
        moveLists.put("HITMONCHAN", new String[]{"Comet Punch", "Agility", "Fire Punch", "Ice Punch", "Thunder Punch", "Mach Punch", "Counter"});
        moveLists.put("LICKITUNG", new String[]{"Lick", "Supersonic", "Wrap", "Stomp", "Disable", "Defense Curl", "Slam"});
        moveLists.put("KOFFING", new String[]{"Tackle", "Smog", "Sludge", "SmokeScreen", "Self-Destruct", "Haze", "Explosion"});
        moveLists.put("WEEZING", new String[]{"Tackle", "Smog", "Sludge", "SmokeScreen", "Self-Destruct", "Haze", "Explosion"});
        moveLists.put("RHYHORN", new String[]{"Horn Attack", "Tail Whip", "Stomp", "Fury Attack", "Scary Face", "Rock Slide", "Take Down"});
        moveLists.put("RHYDON", new String[]{"Horn Attack", "Tail Whip", "Stomp", "Fury Attack", "Scary Face", "Rock Slide", "Take Down"});
        moveLists.put("CHANSEY", new String[]{"Double-Edge", "Soft-Boiled", "Minimize", "Sing", "Growl", "Defense Curl", "Light Screen"});
        moveLists.put("TANGELA", new String[]{"Constrict", "Sleep Powder", "Stun Spore", "Poison Powder", "Bind", "Absorb", "Growth"});
        moveLists.put("KANGASKHAN", new String[]{"Comet Punch", "Leer", "Bite", "Tail Whip", "Mega Punch", "Rage", "Dizzy Punch"});
        moveLists.put("HORSEA", new String[]{"Bubble", "Smokescreen", "Leer", "Water Gun", "Agility", "Hydro Pump", "Dragon Rage"});
        moveLists.put("SEADRA", new String[]{"Bubble", "Smokescreen", "Leer", "Water Gun", "Agility", "Hydro Pump", "Dragon Rage"});
        moveLists.put("GOLDEEN", new String[]{"Peck", "Tail Whip", "Supersonic", "Horn Attack", "Fury Attack", "Waterfall", "Horn Drill"});
        moveLists.put("SEAKING", new String[]{"Peck", "Tail Whip", "Supersonic", "Horn Attack", "Fury Attack", "Waterfall", "Horn Drill"});
        moveLists.put("STARYU", new String[]{"Tackle", "Water Gun", "Harden", "Recover", "Swift", "Minimize", "Light Screen"});
        moveLists.put("STARMIE", new String[]{"Tackle", "Water Gun", "Harden", "Recover", "Swift", "Minimize", "Light Screen"});
        moveLists.put("MR. MIME", new String[]{"Barrier", "Confusion", "Light Screen", "Double Slap", "Meditate", "Substitute", "Psychic"});
        moveLists.put("SCYTHER", new String[]{"Quick Attack", "Leer", "Focus Energy", "Double Team", "Slash", "Swords Dance", "Agility"});
        moveLists.put("JYNX", new String[]{"Pound", "Lick", "Lovely Kiss", "Powder Snow", "Double Slap", "Ice Punch", "Blizzard"});
        moveLists.put("ELECTABUZZ", new String[]{"Quick Attack", "Leer", "Thundershock", "Low Kick", "Swift", "Light Screen", "Thunderpunch"});
        moveLists.put("MAGMAR", new String[]{"Ember", "Leer", "Smog", "Fire Punch", "Confuse Ray", "Rage", "Flamethrower"});
        moveLists.put("PINSIR", new String[]{"Vice Grip", "Seismic Toss", "Focus Energy", "Guillotine", "Submission", "Swords Dance", "Thrash"});
        moveLists.put("TAUROS", new String[]{"Tackle", "Tail Whip", "Rage", "Horn Attack", "Scary Face", "Pursuit", "Take Down"});
        moveLists.put("MAGIKARP", new String[]{"Splash", "Tackle"});
        moveLists.put("GYARADOS", new String[]{"Bite", "Leer", "Tackle", "Dragon Rage", "Hydro Pump", "Hyper Beam"});
        moveLists.put("LAPRAS", new String[]{"Water Gun", "Growl", "Sing", "Mist", "Body Slam", "Confuse Ray", "Ice Beam"});
        moveLists.put("DITTO", new String[]{"Transform"});
        moveLists.put("EEVEE", new String[]{"Tackle", "Tail Whip", "Sand-Attack"});
        moveLists.put("VAPOREON", new String[]{"Tackle", "Tail Whip", "Sand-Attack", "Water Gun", "Quick Attack", "Water Pulse", "Aurora Beam"});
        moveLists.put("JOLTEON", new String[]{"Tackle", "Tail Whip", "Sand-Attack", "Thunder Shock", "Quick Attack", "Double Kick", "Thunderbolt"});
        moveLists.put("FLAREON", new String[]{"Tackle", "Tail Whip", "Sand-Attack", "Ember", "Quick Attack", "Bite", "Fire Spin"});
        moveLists.put("PORYGON", new String[]{"Tackle", "Sharpen", "Conversion", "Psybeam", "Recover", "Agility", "Tri Attack"});
        moveLists.put("OMANYTE", new String[]{"Water Gun", "Withdraw", "Horn Attack", "Leer", "Spike Cannon", "Hydro Pump", "Protect"});
        moveLists.put("OMASTAR", new String[]{"Water Gun", "Withdraw", "Horn Attack", "Leer", "Spike Cannon", "Hydro Pump", "Protect"});
        moveLists.put("KABUTO", new String[]{"Scratch", "Harden", "Absorb", "Leer", "Mud Shot", "Sand-Attack", "Endure"});
        moveLists.put("KABUTOPS", new String[]{"Scratch", "Harden", "Absorb", "Leer", "Mud Shot", "Sand-Attack", "Endure"});
        moveLists.put("AERODACTYL", new String[]{"Wing Attack", "Agility", "Supersonic", "Bite", "Take Down", "Double-Edge", "Hyper Beam"});
        moveLists.put("SNORLAX", new String[]{"Headbutt", "Amnesia", "Rest", "Body Slam", "Hyper Beam"});
        moveLists.put("ARTICUNO", new String[]{"Peck", "Ice Beam", "Blizzard", "Agility", "Mist", "Mind Reader", "Reflect"});
        moveLists.put("ZAPDOS", new String[]{"Peck", "Thundershock", "Thunderbolt", "Agility", "Detect", "Drill Peck", "Light Screen"});
        moveLists.put("MOLTRES", new String[]{"Wing Attack", "Agility", "Endure", "Flamethrower", "Safeguard", "Heat Wave", "Sky Attack"});
        moveLists.put("DRATINI", new String[]{"Wrap", "Leer", "Thunder Wave", "Twister", "Dragon Rage", "Slam", "Agility"});
        moveLists.put("DRAGONAIR", new String[]{"Wrap", "Leer", "Thunder Wave", "Twister", "Dragon Rage", "Slam", "Agility"});
        moveLists.put("DRAGONITE", new String[]{"Wrap", "Leer", "Thunder Wave", "Twister", "Dragon Rage", "Slam", "Agility", "Hyper Beam"});
        moveLists.put("MEWTWO", new String[]{"Confusion", "Disable", "Barrier", "Swift", "Psychic", "Recover", "Mist"});
        moveLists.put("MEW", new String[]{"Pound"});
        

        }
        public enum MovesList {
            TACKLE,
            GROWL,
            LEECH_SEED,
            VINE_WHIP,
            SCRATCH,
            EMBER,
            WATER_GUN,
            SWORD_DANCE,
            RAZOR_LEAF,
            SLEEP_POWDER,
            POISON_POWDER,
            TAKE_DOWN,
            DOUBLE_EDGE,
            TAIL_WHIP,
            BITE,
            WITHDRAW,
            GUST,
            SAND_ATTACK,
            QUICK_ATTACK,
            WING_ATTACK,
            PECK,
            POISON_STING,
            SONIC_BOOM,
            THUNDER_SHOCK,
            SUPERSONIC,
            THUNDER_WAVE,
            SPARK,
            ELECTRO_BALL,
            LOCK_ON,
            FURY_SWIPES,
            BUBBLE,
            AURORA_BEAM,
            LEER,
            CONFUSION,
            DISABLE,
            HEADBUTT,
            AMNESIA,
            PSYCHIC,
            BIND,
            RAGE,
            SLAM,
            ROCK_SLIDE,
            HYPNOSIS,
            NIGHT_SHADE,
            CONFUSE_RAY,
            DREAM_EATER,
            DESTINY_BOND,
            SCREECH,
            ACID,
            BUBBLE_BEAM,
            BARRIER,
            SMOG,
            SMOKE_SCREEN,
            HAZE,
            EXPLOSION,
            BARRAGE,
            REFLECT,
            STUN_SPORE,
            STOMP,
            ACID_ARMOR,
            THUNDERPUNCH,
            FIRE_PUNCH,
            ICE_PUNCH,
            MACH_PUNCH,
            COUNTER,
            GROWTH,
            CRABHAMMER,
            FOCUS_ENERGY,
            FURY_ATTACK,
            HORNET_ATTACK,
            WATERFALL,
            HORN_DRILL,
            GUILLOTINE,
            SUBMISSION,
            DRAGON_RAGE,
            HYPER_BEAM,
            MIST,
            SING,
            SOFT_BOILED,
            MINIMIZE,
            DOUBLE_SLAP,
            MEDITATE,
            SUBSTITUTE,
            SPIKE_CANNON,
            ENDURE,
            TWISTER,
            AGILITY,
            WRAP,
            SWIFT,
            MIND_READER,
            DETECT,
            DRILL_PECK,
            FLAMETHROWER,
            SAFEGUARD,
            HEAT_WAVE,
            SKY_ATTACK,
            RECOVER;

            
        }
}
