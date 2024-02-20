package Monsters;

import java.util.HashMap;


public enum MonsterSpecies {
// Bulbasaur family
BULBASAUR(1, Types.GRASS, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("BULBASAUR"), 45, 49, 49, 65, 65, 45),
IVYSAUR(2, Types.GRASS, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("IVYSAUR"), 60, 62, 63, 80, 80, 60),
VENUSAUR(3, Types.GRASS, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("VENUSAUR"), 80, 82, 83, 100, 100, 80),

// Charmander family
CHARMANDER(4, Types.FIRE, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("CHARMANDER"), 39, 52, 43, 60, 50, 65),
CHARMELEON(5, Types.FIRE, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("CHARMELEON"), 58, 64, 58, 80, 65, 80),
CHARIZARD(6, Types.FIRE, Types.FLYING, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("CHARIZARD"), 78, 84, 78, 109, 85, 100),

// Squirtle family
SQUIRTLE(7, Types.WATER, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("SQUIRTLE"), 44, 48, 65, 50, 64, 43),
WARTORTLE(8, Types.WATER, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("WARTORTLE"), 59, 63, 80, 65, 80, 58),
BLASTOISE(9, Types.WATER, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("BLASTOISE"), 79, 83, 100, 85, 105, 78),

// Caterpie family
CATERPIE(10, Types.BUG, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("CATERPIE"), 45, 30, 35, 20, 20, 45),
METAPOD(11, Types.BUG, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("METAPOD"), 50, 20, 55, 25, 25, 30),
BUTTERFREE(12, Types.BUG, Types.FLYING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("BUTTERFREE"), 60, 45, 50, 90, 80, 70),

// Weedle family
WEEDLE(13, Types.BUG, Types.POISON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("WEEDLE"), 40, 35, 30, 20, 20, 50),
KAKUNA(14, Types.BUG, Types.POISON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("KAKUNA"), 45, 25, 50, 25, 25, 35),
BEEDRILL(15, Types.BUG, Types.POISON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("BEEDRILL"), 65, 90, 40, 45, 80, 75),

// Pidgey family
PIDGEY(16, Types.NORMAL, Types.FLYING, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("PIDGEY"), 40, 45, 40, 35, 35, 56),
PIDGEOTTO(17, Types.NORMAL, Types.FLYING, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("PIDGEOTTO"), 63, 60, 55, 50, 50, 71),
PIDGEOT(18, Types.NORMAL, Types.FLYING, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("PIDGEOT"), 83, 80, 75, 70, 70, 101),

// Rattata family
RATTATA(19, Types.NORMAL, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("RATTATA"), 30, 56, 35, 25, 35, 72),
RATICATE(20, Types.NORMAL, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("RATICATE"), 55, 81, 60, 50, 70, 97),

// Spearow family
SPEAROW(21, Types.NORMAL, Types.FLYING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("SPEAROW"), 40, 60, 30, 31, 31, 70),
FEAROW(22, Types.NORMAL, Types.FLYING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("FEAROW"), 65, 90, 65, 61, 61, 100),

// Ekans family
EKANS(23, Types.POISON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("EKANS"), 35, 60, 44, 40, 54, 55),
ARBOK(24, Types.POISON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("ARBOK"), 60, 95, 69, 65, 79, 80),

// Pikachu family
PIKACHU(25, Types.ELECTRIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("PIKACHU"), 35, 55, 40, 50, 50, 90),
RAICHU(26, Types.ELECTRIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("RAICHU"), 60, 90, 55, 90, 80, 110),

// Sandshrew family
SANDSHREW(27, Types.GROUND, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("SANDSHREW"), 50, 75, 85, 20, 30, 40),
SANDSLASH(28, Types.GROUND, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("SANDSLASH"), 75, 100, 110, 45, 55, 65),

// Nidoran♀ family
NIDORAN_FEMALE(29, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("NIDORAN_FEMALE"), 55, 47, 52, 40, 40, 41),
NIDORINA(30, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("NIDORINA"), 70, 62, 67, 55, 55, 56),
NIDOQUEEN(31, Types.POISON, Types.GROUND, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("NIDOQUEEN"), 90, 82, 87, 75, 85, 76),

// Nidoran♂ family
NIDORAN_MALE(32, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("NIDORAN_MALE"), 46, 57, 40, 40, 40, 50),
NIDORINO(33, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("NIDORINO"), 61, 72, 57, 55, 55, 65),
NIDOKING(34, Types.POISON, Types.GROUND, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("NIDOKING"), 81, 92, 77, 85, 75, 85),

// Clefairy family
CLEFAIRY(35, Types.NORMAL, LevelGroup.FAST, Moves.moveLists.get("CLEFAIRY"), 70, 45, 48, 60, 65, 35),
CLEFABLE(36, Types.NORMAL, LevelGroup.FAST, Moves.moveLists.get("CLEFABLE"), 95, 70, 73, 85, 90, 60),

// Vulpix family
VULPIX(37, Types.FIRE, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("VULPIX"), 38, 41, 40, 50, 65, 65),
NINETALES(38, Types.FIRE, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("NINETALES"), 73, 76, 75, 81, 100, 100),

// Jigglypuff family
JIGGLYPUFF(39, Types.NORMAL,LevelGroup.FAST, Moves.moveLists.get("JIGGLYPUFF"), 115, 45, 20, 45, 25, 20),
WIGGLYTUFF(40, Types.NORMAL, LevelGroup.FAST, Moves.moveLists.get("WIGGLYTUFF"), 140, 70, 45, 85, 50, 45),

// Zubat family
ZUBAT(41, Types.POISON, Types.FLYING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("ZUBAT"), 40, 45, 35, 30, 40, 55),
GOLBAT(42, Types.POISON, Types.FLYING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("GOLBAT"), 75, 80, 70, 65, 75, 90),

// Oddish family
ODDISH(43, Types.GRASS, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("ODDISH"), 45, 50, 55, 75, 65, 30),
GLOOM(44, Types.GRASS, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("GLOOM"), 60, 65, 70, 85, 75, 40),
VILEPLUME(45, Types.GRASS, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("VILEPLUME"), 75, 80, 85, 100, 90, 50),

// Paras family
PARAS(46, Types.BUG, Types.GRASS, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("PARAS"), 35, 70, 55, 45, 55, 25),
PARASECT(47, Types.BUG, Types.GRASS, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("PARASECT"), 60, 95, 80, 60, 80, 30),

// Venonat family
VENONAT(48, Types.BUG, Types.POISON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("VENONAT"), 60, 55, 50, 40, 55, 45),
VENOMOTH(49, Types.BUG, Types.POISON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("VENOMOTH"), 70, 65, 60, 90, 75, 90),

// Diglett family
DIGLETT(50, Types.GROUND, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("DIGLETT"), 10, 55, 25, 35, 45, 95),
DUGTRIO(51, Types.GROUND, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("DUGTRIO"), 35, 80, 50, 50, 70, 120),

// Meowth family
MEOWTH(52, Types.NORMAL, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("MEOWTH"), 40, 45, 35, 40, 40, 90),
PERSIAN(53, Types.NORMAL, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("PERSIAN"), 65, 70, 60, 65, 65, 115),

// Psyduck family
PSYDUCK(54, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("PSYDUCK"), 50, 52, 48, 65, 50, 55),
GOLDUCK(55, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("GOLDUCK"), 80, 82, 78, 95, 80, 85),

// Mankey family
MANKEY(56, Types.FIGHTING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("MANKEY"), 40, 80, 35, 35, 45, 70),
PRIMEAPE(57, Types.FIGHTING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("PRIMEAPE"), 65, 105, 60, 60, 70, 95),

// Growlithe family
GROWLITHE(58, Types.FIRE, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("GROWLITHE"), 55, 70, 45, 70, 50, 60),
ARCANINE(59, Types.FIRE, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("ARCANINE"), 90, 110, 80, 100, 80, 95),
// Poliwag family
POLIWAG(60, Types.WATER, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("POLIWAG"), 40, 50, 40, 40, 40, 90),
POLIWHIRL(61, Types.WATER, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("POLIWHIRL"), 65, 65, 65, 50, 50, 90),
POLIWRATH(62, Types.WATER, Types.FIGHTING, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("POLIWRATH"), 90, 95, 95, 70, 90, 70),

// Abra family
ABRA(63, Types.PSYCHIC, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("ABRA"), 25, 20, 15, 105, 55, 90),
KADABRA(64, Types.PSYCHIC, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("KADABRA"), 40, 35, 30, 120, 70, 105),
ALAKAZAM(65, Types.PSYCHIC, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("ALAKAZAM"), 55, 50, 45, 135, 95, 120),

// Machop family
MACHOP(66, Types.FIGHTING, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("MACHOP"), 70, 80, 50, 35, 35, 35),
MACHOKE(67, Types.FIGHTING, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("MACHOKE"), 80, 100, 70, 50, 60, 45),
MACHAMP(68, Types.FIGHTING, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("MACHAMP"), 90, 130, 80, 65, 85, 55),

// Bellsprout family
BELLSPROUT(69, Types.GRASS, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("BELLSPROUT"), 50, 75, 35, 70, 30, 40),
WEEPINBELL(70, Types.GRASS, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("WEEPINBELL"), 65, 90, 50, 85, 45, 55),
VICTREEBEL(71, Types.GRASS, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("VICTREEBEL"), 80, 105, 65, 100, 70, 70),

// Tentacool family
TENTACOOL(72, Types.WATER, Types.POISON, LevelGroup.SLOW, Moves.moveLists.get("TENTACOOL"), 40, 40, 35, 50, 100, 70),
TENTACRUEL(73, Types.WATER, Types.POISON, LevelGroup.SLOW, Moves.moveLists.get("TENTACRUEL"), 80, 70, 65, 80, 120, 100),

// Geodude family
GEODUDE(74, Types.ROCK, Types.GROUND, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("GEODUDE"), 40, 80, 100, 30, 30, 20),
GRAVELER(75, Types.ROCK, Types.GROUND, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("GRAVELER"), 55, 95, 115, 45, 45, 35),
GOLEM(76, Types.ROCK, Types.GROUND, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("GOLEM"), 80, 120, 130, 55, 65, 45),

// Ponyta family
PONYTA(77, Types.FIRE, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("PONYTA"), 50, 85, 55, 65, 65, 90),
RAPIDASH(78, Types.FIRE, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("RAPIDASH"), 65, 100, 70, 80, 80, 105),

// Slowpoke family
SLOWPOKE(79, Types.WATER, Types.PSYCHIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("SLOWPOKE"), 90, 65, 65, 40, 40, 15),
SLOWBRO(80, Types.WATER, Types.PSYCHIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("SLOWBRO"), 95, 75, 110, 100, 80, 30),

// Magnemite family
MAGNEMITE(81, Types.ELECTRIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("MAGNEMITE"), 25, 35, 70, 95, 55, 45),
MAGNETON(82, Types.ELECTRIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("MAGNETON"), 50, 60, 95, 120, 70, 70),

// Farfetch'd
FARFETCHD(83, Types.NORMAL, Types.FLYING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("FARFETCHD"), 52, 65, 55, 58, 62, 60),

// Doduo family
DODUO(84, Types.NORMAL, Types.FLYING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("DODUO"), 35, 85, 45, 35, 35, 75),
DODRIO(85, Types.NORMAL, Types.FLYING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("DODRIO"), 60, 110, 70, 60, 60, 100),

// Seel family
SEEL(86, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("SEEL"), 65, 45, 55, 45, 70, 45),
DEWGONG(87, Types.WATER, Types.ICE, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("DEWGONG"), 90, 70, 80, 70, 95, 70),

// Grimer family
GRIMER(88, Types.POISON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("GRIMER"), 80, 80, 50, 40, 50, 25),
MUK(89, Types.POISON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("MUK"), 105, 105, 75, 65, 100, 50),

// Shellder family
SHELLDER(90, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("SHELLDER"), 30, 65, 100, 45, 25, 40),
CLOYSTER(91, Types.WATER, Types.ICE, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("CLOYSTER"), 50, 95, 180, 85, 45, 70),

// Gastly family
GASTLY(92, Types.GHOST, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("GASTLY"), 30, 35, 30, 100, 35, 80),
HAUNTER(93, Types.GHOST, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("HAUNTER"), 45, 50, 45, 115, 55, 95),
GENGAR(94, Types.GHOST, Types.POISON, LevelGroup.MEDIUM_SLOW, Moves.moveLists.get("GENGAR"), 60, 65, 60, 130, 75, 110),

// Onix
ONIX(95, Types.ROCK, Types.GROUND, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("ONIX"), 35, 45, 160, 30, 45, 70),

// Drowzee family
DROWZEE(96, Types.PSYCHIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("DROWZEE"), 60, 48, 45, 43, 90, 42),
HYPNO(97, Types.PSYCHIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("HYPNO"), 85, 73, 70, 73, 115, 67),

// Krabby family
KRABBY(98, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("KRABBY"), 30, 105, 90, 25, 25, 50),
KINGLER(99, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("KINGLER"), 55, 130, 115, 50, 50, 75),

// Voltorb family
VOLTORB(100, Types.ELECTRIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("VOLTORB"), 40, 30, 50, 55, 55, 100),
ELECTRODE(101, Types.ELECTRIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("ELECTRODE"), 60, 50, 70, 80, 80, 140),

// Exeggcute family
EXEGGCUTE(102, Types.GRASS, Types.PSYCHIC, LevelGroup.SLOW, Moves.moveLists.get("EXEGGCUTE"), 60, 40, 80, 60, 45, 40),
EXEGGUTOR(103, Types.GRASS, Types.PSYCHIC, LevelGroup.SLOW, Moves.moveLists.get("EXEGGUTOR"), 95, 95, 85, 125, 65, 55),

// Cubone family
CUBONE(104, Types.GROUND, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("CUBONE"), 50, 50, 95, 40, 50, 35),
MAROWAK(105, Types.GROUND, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("MAROWAK"), 60, 80, 110, 50, 80, 45),

// Hitmonlee
HITMONLEE(106, Types.FIGHTING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("HITMONLEE"), 50, 120, 53, 35, 110, 87),

// Hitmonchan
HITMONCHAN(107, Types.FIGHTING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("HITMONCHAN"), 50, 105, 79, 35, 110, 76),

// Lickitung
LICKITUNG(108, Types.NORMAL, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("LICKITUNG"), 90, 55, 75, 60, 75, 30),

// Koffing family
KOFFING(109, Types.POISON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("KOFFING"), 40, 65, 95, 60, 45, 35),
WEEZING(110, Types.POISON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("WEEZING"), 65, 90, 120, 85, 70, 60),

// Rhyhorn family
RHYHORN(111, Types.GROUND, Types.ROCK, LevelGroup.SLOW, Moves.moveLists.get("RHYHORN"), 80, 85, 95, 30, 30, 25),
RHYDON(112, Types.GROUND, Types.ROCK, LevelGroup.SLOW, Moves.moveLists.get("RHYDON"), 105, 130, 120, 45, 45, 40),

// Chansey
CHANSEY(113, Types.NORMAL, LevelGroup.FAST, Moves.moveLists.get("CHANSEY"), 250, 5, 5, 35, 105, 50),

// Tangela
TANGELA(114, Types.GRASS, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("TANGELA"), 65, 55, 115, 100, 40, 60),

// Kangaskhan
KANGASKHAN(115, Types.NORMAL, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("KANGASKHAN"), 105, 95, 80, 40, 80, 90),

// Horsea family
HORSEA(116, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("HORSEA"), 30, 40, 70, 70, 25, 60),
SEADRA(117, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("SEADRA"), 55, 65, 95, 95, 45, 85),

// Goldeen family
GOLDEEN(118, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("GOLDEEN"), 45, 67, 60, 35, 50, 63),
SEAKING(119, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("SEAKING"), 80, 92, 65, 65, 80, 68),

// Starmie family
STARYU(120, Types.WATER, Types.PSYCHIC, LevelGroup.FAST, Moves.moveLists.get("STARYU"), 30, 45, 55, 70, 55, 85),
STARMIE(121, Types.WATER, Types.PSYCHIC, LevelGroup.FAST, Moves.moveLists.get("STARMIE"), 60, 75, 85, 100, 85, 115),

// Mr. Mime family
MR_MIME(122, Types.PSYCHIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("MR_MIME"), 40, 45, 65, 100, 120, 90),

// Scyther family
SCYTHER(123, Types.BUG, Types.FLYING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("SCYTHER"), 70, 110, 80, 55, 80, 105),

// Jynx family
JYNX(124, Types.ICE, Types.PSYCHIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("JYNX"), 65, 50, 35, 115, 95, 95),

// Electabuzz family
ELECTABUZZ(125, Types.ELECTRIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("ELECTABUZZ"), 65, 83, 57, 95, 85, 105),

// Magmar family
MAGMAR(126, Types.FIRE, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("MAGMAR"), 65, 95, 57, 100, 85, 93),

// Pinsir family
PINSIR(127, Types.BUG, LevelGroup.SLOW, Moves.moveLists.get("PINSIR"), 65, 125, 100, 55, 70, 85),

// Tauros family
TAUROS(128, Types.NORMAL, LevelGroup.SLOW, Moves.moveLists.get("TAUROS"), 75, 100, 95, 40, 70, 110),

// Magikarp family
MAGIKARP(129, Types.WATER, LevelGroup.SLOW, Moves.moveLists.get("MAGIKARP"), 20, 10, 55, 15, 20, 80),
GYARADOS(130, Types.WATER, Types.FLYING, LevelGroup.SLOW, Moves.moveLists.get("GYARADOS"), 95, 125, 79, 60, 100, 81),

// Lapras family
LAPRAS(131, Types.WATER, Types.ICE, LevelGroup.SLOW, Moves.moveLists.get("LAPRAS"), 130, 85, 80, 85, 95, 60),

// Ditto
DITTO(132, Types.NORMAL, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("DITTO"), 48, 48, 48, 48, 48, 48),

// Eevee family
EEVEE(133, Types.NORMAL, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("EEVEE"), 55, 55, 50, 45, 65, 55),
VAPOREON(134, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("VAPOREON"), 130, 65, 60, 110, 95, 65),
JOLTEON(135, Types.ELECTRIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("JOLTEON"), 65, 65, 60, 110, 95, 130),
FLAREON(136, Types.FIRE, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("FLAREON"), 65, 130, 60, 95, 110, 65),

// Porygon family
PORYGON(137, Types.NORMAL, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("PORYGON"), 65, 60, 70, 85, 75, 40),

// Omanyte family
OMANYTE(138, Types.ROCK, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("OMANYTE"), 35, 40, 100, 90, 55, 35),
OMASTAR(139, Types.ROCK, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("OMASTAR"), 70, 60, 125, 115, 70, 55),

// Kabuto family
KABUTO(140, Types.ROCK, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("KABUTO"), 30, 80, 90, 55, 45, 55),
KABUTOPS(141, Types.ROCK, Types.WATER, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("KABUTOPS"), 60, 115, 105, 65, 70, 80),

// Aerodactyl family
AERODACTYL(142, Types.ROCK, Types.FLYING, LevelGroup.SLOW, Moves.moveLists.get("AERODACTYL"), 80, 105, 65, 60, 75, 130),

// Snorlax
SNORLAX(143, Types.NORMAL, LevelGroup.SLOW, Moves.moveLists.get("SNORLAX"), 160, 110, 65, 65, 110, 30),

// Articuno
ARTICUNO(144, Types.ICE, Types.FLYING, LevelGroup.SLOW, Moves.moveLists.get("ARTICUNO"), 90, 85, 100, 95, 125, 85),

// Zapdos
ZAPDOS(145, Types.ELECTRIC, Types.FLYING, LevelGroup.SLOW, Moves.moveLists.get("ZAPDOS"), 90, 90, 85, 125, 90, 100),

// Moltres
MOLTRES(146, Types.FIRE, Types.FLYING, LevelGroup.SLOW, Moves.moveLists.get("MOLTRES"), 90, 100, 90, 125, 85, 90),

// Dratini family
DRATINI(147, Types.DRAGON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("DRATINI"), 41, 64, 45, 50, 50, 50),
DRAGONAIR(148, Types.DRAGON, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("DRAGONAIR"), 61, 84, 65, 70, 70, 70),
DRAGONITE(149, Types.DRAGON, Types.FLYING, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("DRAGONITE"), 91, 134, 95, 100, 100, 80),

// Mewtwo
MEWTWO(150, Types.PSYCHIC, LevelGroup.SLOW, Moves.moveLists.get("MEWTWO"), 106, 110, 90, 154, 90, 130),

// Mew
MEW(151, Types.PSYCHIC, LevelGroup.MEDIUM_FAST, Moves.moveLists.get("MEW"), 100, 100, 100, 100, 100, 100);

    private final int number;
    private final Types type1;
    private final Types type2;
    private final LevelGroup levelGroup;
    private final String[] moves;
    private final int baseHP;
    private final int baseATK;
    private final int baseDEF;
    private final int baseSpATK;
    private final int baseSpDEF;
    private final int baseSPE;
    private final HashMap<String,Float> effect;

    MonsterSpecies(int number, Types type1, LevelGroup levelGroup,String[] moves, int baseHP, int baseATK, int baseDEF, int baseSpATK, int baseSpDEF, int baseSPE) {
        this.number = number;
        this.type1 = type1;
        this.type2 = Types.NULL;
        this.levelGroup = levelGroup;
        this.moves = moves;
        this.baseHP = baseHP;
        this.baseATK = baseATK;
        this.baseDEF = baseDEF;
        this.baseSpATK = baseSpATK;
        this.baseSpDEF = baseSpDEF;
        this.baseSPE = baseSPE;
        this.effect = calcEffect(type1);
    }
    MonsterSpecies(int number, Types type1,Types type2, LevelGroup levelGroup,String[] moves, int baseHP, int baseATK, int baseDEF, int baseSpATK, int baseSpDEF, int baseSPE) {
        this.number = number;
        this.type1 = type1;
        this.type2 = type2;
        this.levelGroup = levelGroup;
        this.moves = moves;
        this.baseHP = baseHP;
        this.baseATK = baseATK;
        this.baseDEF = baseDEF;
        this.baseSpATK = baseSpATK;
        this.baseSpDEF = baseSpDEF;
        this.baseSPE = baseSPE;
        this.effect = calcEffect(type1, type2);
    }

    // Getters for the enum constants
    public int getNumber() {
        return number;
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

    public int getBaseHP() {
        return baseHP;
    }

    public int getBaseATK() {
        return baseATK;
    }

    public int getBaseDEF() {
        return baseDEF;
    }

    public int getBaseSpATK() {
        return baseSpATK;
    }

    public int getBaseSpDEF() {
        return baseSpDEF;
    }

    public int getBaseSPE() {
        return baseSPE;
    }
    public LevelGroup getLevelGroup(){
        return levelGroup;
    }
    public HashMap<String,Float> getEffect(){
        return this.effect;
    }
    public float getTypeEffectiveness(String type) {
        return effect.getOrDefault(type, 1.0f); // Default to 1.0f if not found
    }
    
// calculating type effectiveness
public HashMap<String, Float> calcEffect(Types type1) {
    String[] types = {"NORMAL", "FIRE", "WATER", "ELECTRIC", "GRASS", "ICE", "FIGHTING", "POISON", "GROUND", "FLYING", "PSYCHIC", "BUG", "ROCK", "GHOST", "DRAGON"};

    HashMap<String, Float> effectMap = new HashMap<>();
    for (String t : types) {
        boolean isImmune = false;
        boolean isResist = false;
        boolean isWeak = false;
        for (String immunity : type1.immunities) {
            if (t.equals(immunity)) {
                isImmune = true;
                break;
            }
        }
        for (String resistance : type1.resistances) {
            if (t.equals(resistance)) {
                isResist = true;
                break;
            }
        }
        for (String weakness : type1.weaknesses) {
            if (t.equals(weakness)) {
                isWeak = true;
                break;
            }
        }
        if (isImmune) {
            effectMap.put(t, 0.0f); // Immune
        } else if (isResist) {
            effectMap.put(t, 0.5f); // Resistant
        } else if (isWeak) {
            effectMap.put(t, 2.0f); // Weak
        } else {
            effectMap.put(t, 1.0f); // Neutral
        }
    }
    return effectMap;
}
    
public HashMap<String, Float> calcEffect(Types type1, Types type2) {
    String[] types = {"NORMAL", "FIRE", "WATER", "ELECTRIC", "GRASS", "ICE", "FIGHTING", "POISON", "GROUND", "FLYING", "PSYCHIC", "BUG", "ROCK", "GHOST", "DRAGON"};

    HashMap<String, Float> effectMap = new HashMap<>();
    for (String t : types) {
        int effectiveness = 1; // Default to normal effectiveness
        if (contains(type1.immunities, t) || (type2 != null && contains(type2.immunities, t))) {
            effectiveness = 0; // Immune
        } else if ((contains(type1.weaknesses, t) && type2 != null && contains(type2.resistances, t)) || (contains(type1.resistances, t) && type2 != null && contains(type2.weaknesses, t))) {
            effectiveness = 1; // Cancel out
        } else if ((contains(type1.weaknesses, t) && type2 != null && contains(type2.weaknesses, t))) {
            effectiveness = 3; // Double weak
        } else if ((contains(type1.weaknesses, t) && type2 != null && contains(type2.resistances, t)) || (contains(type1.resistances, t) && type2 != null && contains(type2.weaknesses, t))) {
            effectiveness = 2; // Weak
        } else if ((contains(type1.resistances, t) && type2 != null && contains(type2.resistances, t))) {
            effectiveness = -2; // Double resist
        } else if (contains(type1.resistances, t) || (type2 != null && contains(type2.resistances, t))) {
            effectiveness = -1; // Resist
        }
        effectMap.put(t, getMultiplier(effectiveness));
    }
    return effectMap;
}

private float getMultiplier(int effectiveness) {
    switch (effectiveness) {
        case 0:
            return 0.0f; // Immune
        case 1:
            return 1.0f; // Normal
        case -1:
            return 0.5f; // Resist
        case -2:
            return 0.25f; // Double resist
        case 2:
            return 2.0f; // Weak
        case 3:
            return 4.0f; // Double weak
        default:
            return 1.0f; // Default to normal
    }
}

private boolean contains(String[] array, String key) {
    for (String item : array) {
        if (item.equals(key)) {
            return true;
        }
    }
    return false;
}


}

