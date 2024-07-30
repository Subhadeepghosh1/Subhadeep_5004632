public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentStrategy creditCard = new CreditCardPayment("1234567812345678");
        PaymentStrategy payPal = new PayPalPayment("user@example.com");

        PaymentContext paymentContext = new PaymentContext(creditCard);

        paymentContext.executePayment(100.00);

        paymentContext.setPaymentStrategy(payPal);
        paymentContext.executePayment(200.00);
    }
}