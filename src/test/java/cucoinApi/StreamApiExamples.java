package cucoinApi;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;

public class StreamApiExamples {
    // ������� ��� �������� ������ ���� ����� ����
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
        List<TickerData> usdTickers = getTickers().stream().filter(x->x.getSymbol().endsWith("USDT")).collect(Collectors.toList());//�������� ������ �����������, ��������� �� ���� getSymbol, ������� ������������ �� "USDT" � ��������� ��� � ����(����������� ����� ��������)
        //allMatch()- ����� ��������� ���, ��� ������������� �������, ���� ���� ��� ������� ��������� �� ������� �� ������ false
        Assertions.assertTrue(usdTickers.stream().allMatch(x->x.getSymbol().endsWith("USDT")));//���������, ��� ��� getSymbol ������������ �� "USDT"
    }
    /**
     * ���������� ������������ �� ����������� ��������� � ���� �� �����
     */
    @Test
    public void sortHigToLow(){
        List<TickerData>highToLow = getTickers().stream().filter(x->x.getSymbol().endsWith("USDT")).sorted(new Comparator<TickerData>() {//��������� ������������ �� �� �������� � �������� �� ���� getChangeRate, ��� ����� ������������� ����� compare()
            @Override
            public int compare(TickerData o1, TickerData o2) { // ����� �� ���������� Comparator, ������� ���������� �����-�� 1 � 2 ������ �� TickerData
                return o2.getChangeRate().compareTo(o1.getChangeRate());// ���� ����� ������������� �� �������� � ��������, ����� �������� �� 2 �������.
            }                                                           // ����� getChangeRate � ������� 2 � ���������� � getChangeRate � ������� 1
        }).collect(Collectors.toList());
        //��������� ������ � ��� 10 ����� � ������� ������ limit()- ������� � ��� ������� ��������� �������
        List<TickerData> top10 = highToLow.stream().limit(10).collect(Collectors.toList());
        Assertions.assertEquals(top10.get(0).getSymbol(),"IXS-USDT");//��������� ��� ������ ������ IXS-USDT
    }
    /**
     * ���������� ������ �� ����������� ��������� � ����
     */
    @Test
    public void sortLowToHigh(){
         List<TickerData> lowToHigh = getTickers().stream().filter(x->x.getSymbol().endsWith("USDT"))
                 .sorted(new TickerComparatorLow()).limit(10).collect(Collectors.toList());
    }
    /**
     * �������� ����� �� ������ ������� � ���� �������� ������ � ��������� � ����
     * �������� ���� �� ������ ������� � ���� �������� ������ � ��������� � ����, ��������� Pojo class
     */
    @Test
    public void map(){
        Map<String,Float> usd = new HashMap<>();
        //������ ��� ������������� � ������� ��������
        List<String> lowerCases = getTickers().stream().map(x->x.getSymbol().toLowerCase()).collect(Collectors.toList());// map()-����������� ���� ��� � ������. x.getSymbol().toLowerCase() ������� ������ �� ���� getSymbol � ������������ �� � ������� ��������
        getTickers().stream().forEach(x->usd.put(x.getSymbol(), Float.parseFloat(x.getChangeRate())));//�������� ������ getTickers ���������� forEach � ��������� � ����� usd getSymbol � ���� ����� � getChangeRate � ���� ��������, ������������ getChangeRate � ��� float
        List<TickerShort> shortList = new ArrayList<>();
        getTickers().forEach(x->shortList.add(new TickerShort(x.getSymbol(),Float.parseFloat(x.getChangeRate()))));// ���������� � ���� ���� ����� getSymbol � getChangeRate � �������������� getChangeRate � flot ��� ��� �� ����� ������� �������� � ���� String
        int i = 3;
    }

}
