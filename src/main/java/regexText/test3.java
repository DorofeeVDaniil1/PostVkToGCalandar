package regexText;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class test3 {
    public static final String REGEX_STRING = "(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d";
    public static void main(String[] args) {


    ArrayList <String> list = new ArrayList();
    list.add("behold");
    list.add("bend");
    list.add("12.10.2022");
    list.add("11-17 мая 2022 года в рамках VIII Международного технологического форума «Инновации. Технологии. Производство» состоится ХАКАТОН «ТехАвиа» \\uD83D\\uDCA5 \\n\" +\n" +
            "                \" \\n\" +\n" +
            "                \"Вас ждут три тематических трека: \\n\" +\n" +
            "                \"✔ Создание цифрового двойника изделия. \\n\" +\n" +
            "                \"✔ Технологическая подготовка производства. \\n\" +\n" +
            "                \"✔ Искусственный интеллект. \\n\" +\n" +
            "                \" \\n\" +\n" +
            "                \"\\uD83D\\uDC49\\uD83C\\uDFFB Подать заявку можно до 27 апреля 2022 года на официальном сайте Хакатона https://techavia.tb.ru \\n\" +\n" +
            "                \" \\n\" +\n" +
            "                \"▫ Предварительный (заочный) этап проводится с 12 по 27 апреля 2022 года. В рамках этапа участникам необходимо решить один из кейсов в соотвествии с тематиками Хакатона. По итогам отбора конкурсанты с лучшим результатом проходят финальный этап \\uD83D\\uDE80 \\n\" +\n" +
            "                \"▫ Финальный этап соревнования пройдёт в очном формате с 11 по 16 мая 2022 года. Награждение команд-победителей состоится 17 мая 2022 года. Победителей ждут памятные подарки и денежные призы: \\n\" +\n" +
            "                \"\\uD83C\\uDFC6 1 место — 150.000 ₽ \\n\" +\n" +
            "                \"\\uD83C\\uDFC6 2 место — 100.000 ₽ \\n\" +\n" +
            "                \"\\uD83C\\uDFC6 3 место — 50.000 ₽ \\n\" +\n" +
            "                \" \\n\" +\n" +
            "                \"\\uD83D\\uDCA5 Денежные призы будут вручаться по каждому тематическому треку, а также у вас будет возможность принять участие в выполнении исследований и разработок по заказу ПАО «ОДК-Сатурн» в составе межвузовских индустриальных конструкторских технологических бюро. \\n\" +\n" +
            "                \" \\n\" +\n" +
            "                \"#предпринимательство_ИРНИТУ #business_irnitu \\n\" +\n" +
            "                \"Дата: 02.10.2022\"+\n" +
            "                \"#предпринимательство_за_стенами_ИРНИТУ\"");
    list.add("01.08.2019");
    list.add("bend");
    list.add("bet");
    list.add("bear");
    list.add("beat");
    list.add("become");
    list.add("begin");

        System.out.println(getMatchingStrings(list,REGEX_STRING));

    }

    public static List<String> getMatchingStrings(List<String> list, String regex) {

        ArrayList<String> matches = new ArrayList<String>();

        Pattern p = Pattern.compile(regex);

        for (String s:list) {
            if (p.matcher(s).matches()) {
                matches.add(s);
            }
        }

        return matches;
    }
}
