public class EShopUniverse {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentProcessor(new StripeProcessor());
        context.executePayment("user123", "password123");
    }
}
