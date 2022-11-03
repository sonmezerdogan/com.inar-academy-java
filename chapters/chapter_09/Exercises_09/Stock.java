package chapters.chapter_09.Exercises_09;

public class Stock {

    public String symbol;
    public String name;
    public double previousClosingPrice;
    public double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice) {
        this.name = name;
        this.symbol = symbol;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }
    public String getSymbol() {
        return symbol;
    }
    public String getName() {
        return name;
    }
    public double getChangePercent() {

        return ((currentPrice - previousClosingPrice) / currentPrice);
    }
}
