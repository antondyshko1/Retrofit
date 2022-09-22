package cucoinApi;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class StreamApiExamples {
    // ћетодот дл€ получен€ списка всех тикер дата
    List<TickerData> getTickers(){
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://api.kucoin.com/api/v1/market/allTickers")
                .then().log().body()
                .extract().jsonPath().getList("data.ticker",TickerData.class);
    }
    @Test
    public void checkCrypto(){
        List<TickerData> usdTickers = getTickers().stream().filter(x->x.getSymbol().endsWith("USDT")).collect(Collectors.toList());//ѕолучаем список криптовалют, фильтруем по полю getSymbol, которое оканчиваетс€ на "USDT" и сохран€ем все в лист(завершающа€ стрим операци€)
        //allMatch()- метод провер€ет все, что удовлетвор€ет условию, если хоть дно условие оказалось не вернымЅ то вернет false
        Assertions.assertTrue(usdTickers.stream().allMatch(x->x.getSymbol().endsWith("USDT")));//ѕровер€ем, что все getSymbol оканчиваютс€ на "USDT"
    }
    /**
     * —ортировка криптовалюты по наибольшему изменению в цене за сутки
     */
    @Test
    public void sortHigToLow(){
        List<TickerData>highToLow = getTickers().stream().filter(x->x.getSymbol().endsWith("USDT")).sorted(new Comparator<TickerData>() {//—ортируем криптовалюту по от большего к меньшему по полю getChangeRate, дл€ этого переопределим метод compare()
            @Override
            public int compare(TickerData o1, TickerData o2) { // ћетод из интерфейса Comparator, который сравнивает какой-то 1 и 2 объект из TickerData
                return o2.getChangeRate().compareTo(o1.getChangeRate());// ≈сли хотем отсортировать от большего к меньшему, нужно начинать со 2 объекта.
            }                                                           // Ѕерем getChangeRate у объекта 2 и сравниваем с getChangeRate у объекта 1
        }).collect(Collectors.toList());
        //ѕолучение списка с топ 10 валют с помощью метода limit()- говорит о том сколько элементов достать
        List<TickerData> top10 = highToLow.stream().limit(10).collect(Collectors.toList());
        Assertions.assertEquals(top10.get(0).getSymbol(),"IXS-USDT");//ѕровер€ем что перва€ валюта IXS-USDT
    }
    /**
     * —ортировка валюты по наименьшему изменению в цене
     */
    @Test
    public void sortLowToHigh(){
         List<TickerData> lowToHigh = getTickers().stream().filter(x->x.getSymbol().endsWith("USDT"))
                 .sorted(new TickerComparatorLow()).limit(10).collect(Collectors.toList());
    }
    /**
     * ѕолучить карту из ответа сервера в виде название валюты и изменение в цене
     * ѕолучить Ћист из ответа сервера в виде названи€ валюты и изменени€ в цене, использу€ Pojo class
     */
    @Test
    public void map(){
        Map<String,Float> usd = new HashMap<>();
        //ѕример как преобразовать к нижнему регистру
        List<String> lowerCases = getTickers().stream().map(x->x.getSymbol().toLowerCase()).collect(Collectors.toList());// map()-преобразует один тип в другой. x.getSymbol().toLowerCase() ƒостали данные из пол€ getSymbol и пробразовали их к нижнему регистру
        getTickers().stream().forEach(x->usd.put(x.getSymbol(), Float.parseFloat(x.getChangeRate())));//ѕолучаем список getTickers проходимс€ forEach и добавл€ем в карту usd getSymbol в виде ключа и getChangeRate в виде значений, преобразовав getChangeRate в тип float
        List<TickerShort> shortList = new ArrayList<>();
        getTickers().forEach(x->shortList.add(new TickerShort(x.getSymbol(),Float.parseFloat(x.getChangeRate()))));// ƒобавление в лист всех полей getSymbol и getChangeRate и преобразование getChangeRate в flot так как из ответ ыервера приходит в виде String
        int i = 3;
    }

}
