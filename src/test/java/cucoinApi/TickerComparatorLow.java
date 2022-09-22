package cucoinApi;

import java.util.Comparator;

public class TickerComparatorLow implements Comparator<TickerData> {// В <> указываем класс который хотим сравнить
    @Override
    public int compare(TickerData o1, TickerData o2) { //Переопределяем метод для сравнения полей getChangeRate объекта tickerData
        float result = Float.compare(Float.parseFloat(o1.getChangeRate()),Float.parseFloat(o2.getChangeRate()));// Так как ответ JSON приходит в виде String, преобразовываем getRange в Float
        return (int) result;// Делаем приведение типов к int, т.к. метод возвращает int
    }
}
