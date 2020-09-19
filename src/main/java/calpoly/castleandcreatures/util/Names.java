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

    public static final String ASCII_TITLE = "    __   ____   _____ ______  _        ___  _____      ____  ____   ___           __  ____     ___   ____  ______  __ __  ____     ___  _____\n" +
            "   /  ] /    | / ___/|      || |      /  _]/ ___/     /    ||    \\ |   \\         /  ]|    \\   /  _] /    ||      ||  |  ||    \\   /  _]/ ___/\n" +
            "  /  / |  o  |(   \\_ |      || |     /  [_(   \\_     |  o  ||  _  ||    \\       /  / |  D  ) /  [_ |  o  ||      ||  |  ||  D  ) /  [_(   \\_ \n" +
            " /  /  |     | \\__  ||_|  |_|| |___ |    _]\\__  |    |     ||  |  ||  D  |     /  /  |    / |    _]|     ||_|  |_||  |  ||    / |    _]\\__  |\n" +
            "/   \\_ |  _  | /  \\ |  |  |  |     ||   [_ /  \\ |    |  _  ||  |  ||     |    /   \\_ |    \\ |   [_ |  _  |  |  |  |  :  ||    \\ |   [_ /  \\ |\n" +
            "\\     ||  |  | \\    |  |  |  |     ||     |\\    |    |  |  ||  |  ||     |    \\     ||  .  \\|     ||  |  |  |  |  |     ||  .  \\|     |\\    |\n" +
            " \\____||__|__|  \\___|  |__|  |_____||_____| \\___|    |__|__||__|__||_____|     \\____||__|\\_||_____||__|__|  |__|   \\__,_||__|\\_||_____| \\___|\n" +
            "                                                                                                                                             ";

    public static String getRandomName() {
        return names[getRandomNumber(0, names.length - 1)];
    }

}
