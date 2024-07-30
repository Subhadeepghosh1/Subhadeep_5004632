public class ObserverPatternTest {
    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();
        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice(150.00);
        stockMarket.setStockPrice(155.75);

        stockMarket.deregisterObserver(webApp);
        stockMarket.setStockPrice(160.00);
    }
}