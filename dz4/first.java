package dz4;

import test.Seasons;
import test.Spring;

public class first {
    public static void main(String[] args) {
         Seasons seasons = Seasons.Summer;
         //System.out.println(Summer.Summer);
        for (Summer summer : Summer.values()) {
            System.out.println(summer);
        }
         switch (seasons){
             case Winter: System.out.println("Я люблю зиму");break;
             case Spring: System.out.println("Я люблю весну");break;
             case Summer: System.out.println("Я люблю лето");break;
             case Autumn: System.out.println("Я люблю осень");break;
         }
        for (Seasons season : Seasons.values()) {
            System.out.println(season + ", средняя температура: " +
                    season.Temperature + " градусов, " + season.getDescription());
        }
    }
    enum Seasons{
        Winter (-15),
        Spring (5),
        Summer (25){
            @Override
            public String getDescription(){
                return "Теплое время года";
            }
        },
        Autumn(0)
        ;
        private final int Temperature;
        private Seasons(int Temperature){
            this.Temperature = Temperature;
        }
        public String getDescription(){
            return "Холодное время года";
        }
    }
    public enum Summer{
        First {public String toString() {return "Лето включает три календарных месяца: июнь, июль, август. По гражданскому календарю лето приходит в 1-й день июня и продолжается 92 дня.";}},
        Second {public String toString() {return "Самая жаркая летняя температура была зарегистрирована в «Долине смерти» (пустынный участок в Калифорнии) — 56,66 градуса Цельсия.";}},
        Third {public String toString(){return "При температуре выше 40 градусов Цельсия человеческое тело теряет около 1 литра пота за час.";}},
        Fourth {public String toString(){return "Самый длинный день в году — летом. 21 июня — день летнего солнцестояния.";}},
    }
}
