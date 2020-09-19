package calpoly.castleandcreatures.util;

import static calpoly.castleandcreatures.util.WorldParser.getRandomNumber;

public class Names {

    private final static String[] names = {"Foolshope",
            "Kara's Vale",
            "Snake's Canyon",
            "Malrton",
            "Barcombe",
            "Taedmorden",
            "Helmfirth",
            "Mirstone",
            "Haerndean",
            "Shepshed",
            "Doonatel",
            "Burrafirth",
            "Jarren's Outpost",
            "Landow",
            "Bamborourgh",
            "Aberdyfi",
            "Anghor Thom",
            "Glaenarm",
            "Mansfield",
            "Lunaris",
            "Stathmore",
            "Hillford",
            "Ferndochty",
            "Astrakane",
            "Berxley",
            "Bradford",
            "Gloucester",
            "Laenteglos",
            "Coniston",
            "Thorpeness",
            "MillerVille",
            "Bamborourgh",
            "Broughton",
            "Falcon Haven",
            "Redwater",
            "Eastcliff",
            "Pontheugh",
            "Pontypridd",
            "Hammaslahti",
            "Brickelwhyte",
            "Ubbin Falls",
            "Drumnadrochit",
            "Xynnar",
            "Paethsmouth",
            "Paentmarwy",
            "Ritherhithe",
            "Ashbourne",
            "Pella's Wish",
            "Hullbeck",
            "Ilragorn",
            "Putlochry",
            "Solime",
            "Rotherhithe",
            "Dalmerlington",
            "Luton",
            "Archmouth",
            "Laencaster",
            "Holmfirth",
            "Colkirk",
            "Sirencester"};

    public static String getRandomName() {
        return names[getRandomNumber(0, names.length - 1)];
    }

}