package cucoinApi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TickerData {
    @JsonProperty("symbol")
    private String symbol ;
    @JsonProperty("symbol_name")
    private String symbolName;
    @JsonProperty("buy")
    private String buy;
    @JsonProperty("sell")
    private String sell;
    @JsonProperty("change_rate")
    private String changeRate;
    @JsonProperty("change_price")
    private String changePrice;
    @JsonProperty("high")
    private String high;
    @JsonProperty("low")
    private String low;
    @JsonProperty("vol")
    private String vol;
    @JsonProperty("vol_value")
    private String volValue ;
    @JsonProperty("last")
    private String last;
    @JsonProperty("average_price")
    private String averagePrice;
    @JsonProperty("taker_fee_rate")
    private String takerFeeRate;
    @JsonProperty("maker_fee_rate")
    private String makerFeeRate;
    @JsonProperty("taker_coefficient")
    private String takerCoefficient;
    @JsonProperty("maker_coefficient")
    private String makerCoefficient;

    public TickerData(String symbol, String symbolName, String buy, String sell, String changeRate, String changePrice, String high, String low, String vol, String volValue, String last, String averagePrice, String takerFeeRate, String makerFeeRate, String takerCoefficient, String makerCoefficient) {
        this.symbol = symbol;
        this.symbolName = symbolName;
        this.buy = buy;
        this.sell = sell;
        this.changeRate = changeRate;
        this.changePrice = changePrice;
        this.high = high;
        this.low = low;
        this.vol = vol;
        this.volValue = volValue;
        this.last = last;
        this.averagePrice = averagePrice;
        this.takerFeeRate = takerFeeRate;
        this.makerFeeRate = makerFeeRate;
        this.takerCoefficient = takerCoefficient;
        this.makerCoefficient = makerCoefficient;
    }

    public TickerData() {
    }

    public String getSymbol() {
        return symbol;
    }

    public String getSymbolName() {
        return symbolName;
    }

    public String getBuy() {
        return buy;
    }

    public String getSell() {
        return sell;
    }

    public String getChangeRate() {
        return changeRate;
    }

    public String getChangePrice() {
        return changePrice;
    }

    public String getHigh() {
        return high;
    }

    public String getLow() {
        return low;
    }

    public String getVol() {
        return vol;
    }

    public String getVolValue() {
        return volValue;
    }

    public String getLast() {
        return last;
    }

    public String getAveragePrice() {
        return averagePrice;
    }

    public String getTakerFeeRate() {
        return takerFeeRate;
    }

    public String getMakerFeeRate() {
        return makerFeeRate;
    }

    public String getTakerCoefficient() {
        return takerCoefficient;
    }

    public String getMakerCoefficient() {
        return makerCoefficient;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setSymbolName(String symbolName) {
        this.symbolName = symbolName;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    public void setChangeRate(String changeRate) {
        this.changeRate = changeRate;
    }

    public void setChangePrice(String changePrice) {
        this.changePrice = changePrice;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }

    public void setVolValue(String volValue) {
        this.volValue = volValue;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public void setAveragePrice(String averagePrice) {
        this.averagePrice = averagePrice;
    }

    public void setTakerFeeRate(String takerFeeRate) {
        this.takerFeeRate = takerFeeRate;
    }

    public void setMakerFeeRate(String makerFeeRate) {
        this.makerFeeRate = makerFeeRate;
    }

    public void setTakerCoefficient(String takerCoefficient) {
        this.takerCoefficient = takerCoefficient;
    }

    public void setMakerCoefficient(String makerCoefficient) {
        this.makerCoefficient = makerCoefficient;
    }

    @Override
    public String toString() {
        return "TickerData{" +
                "symbol='" + symbol + '\'' +
                ", symbolName='" + symbolName + '\'' +
                ", buy='" + buy + '\'' +
                ", sell='" + sell + '\'' +
                ", changeRate='" + changeRate + '\'' +
                ", changePrice='" + changePrice + '\'' +
                ", high='" + high + '\'' +
                ", low='" + low + '\'' +
                ", vol='" + vol + '\'' +
                ", volValue='" + volValue + '\'' +
                ", last='" + last + '\'' +
                ", averagePrice='" + averagePrice + '\'' +
                ", takerFeeRate='" + takerFeeRate + '\'' +
                ", makerFeeRate='" + makerFeeRate + '\'' +
                ", takerCoefficient='" + takerCoefficient + '\'' +
                ", makerCoefficient='" + makerCoefficient + '\'' +
                '}';
    }
}
