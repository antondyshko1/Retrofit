package cucoinApi;

import java.util.Comparator;

public class TickerComparatorLow implements Comparator<TickerData> {// � <> ��������� ����� ������� ����� ��������
    @Override
    public int compare(TickerData o1, TickerData o2) { //�������������� ����� ��� ��������� ����� getChangeRate ������� tickerData
        float result = Float.compare(Float.parseFloat(o1.getChangeRate()),Float.parseFloat(o2.getChangeRate()));// ��� ��� ����� JSON �������� � ���� String, ��������������� getRange � Float
        return (int) result;// ������ ���������� ����� � int, �.�. ����� ���������� int
    }
}
