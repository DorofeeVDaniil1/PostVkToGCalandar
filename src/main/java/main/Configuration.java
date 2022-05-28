package main;

public class Configuration {
    private static final String TOKEN_ACCES = "c68103b8c68103b8c68103b813c6fd5d56cc681c68103b8a4e9e5919b0323ddaffd35e2";//API ключ
    private static final String API_VK = "https://api.vk.com/";//Ссылка API
    //private static final String OWNER_ID = "-46864386";//ID паблика
    private static final String OWNER_ID = "-213016904";//ID паблика
    private static final String COUT = "2";//Количетсво объявлений
    private static final String API_VERSION = "5.131";//Версия API

    //Какое слово должно быть
    private static final String QUERY = "Дата";


    //Regex с обработкой специальных постов

    //Для Времени
    private static final String REGEX_TIME="(0[0-9]|1[0-9]|2[0-3]|[0-9]):[0-5][0-9]$";
    //private static final String REGEX_TIME2="^([0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";
    private static final String REGEX_TIME2="⏰Время:(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$";

    //Для Даты
    //private static final String REGEX_DATE="(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";
    private static final String REGEX_DATE="\uD83D\uDCC6Дата:(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";//С иконкой календаря

    //Для Описания
    private static final String REGEX_DESCRIPTION2="\uD83D\uDCA1.+?\uD83D\uDCA1";//Лампочка
    private static final String REGEX_DESCRIPTION="\uD83D\uDCCC.+?\uD83D\uDCCC";//Булавка

    //Для места
    private static final String REGEX_PLACE="\uD83D\uDCCDМесто:.*$";//Булавка место



    //Для названия
    private static final String REGEX_TITLE="«.*»";



    public static String getTokenAcces() {
        return TOKEN_ACCES;
    }

    public static String getApiVk() {
        return API_VK;
    }

    public static String getOwnerId() {
        return OWNER_ID;
    }

    public static String getCOUT() {
        return COUT;
    }

    public static String getApiVersion() {
        return API_VERSION;
    }

    public static String getQUERY() {
        return QUERY;
    }

    public static String getRegexTime() {
        return REGEX_TIME;
    }

    public static String getRegexTime2() {
        return REGEX_TIME2;
    }

    public static String getRegexDate() {
        return REGEX_DATE;
    }

    public static String getRegexDescription() {
        return REGEX_DESCRIPTION;
    }

    public static String getRegexPlace() {
        return REGEX_PLACE;
    }
    public static String getRegexTitle() {
        return REGEX_TITLE;
    }
}
