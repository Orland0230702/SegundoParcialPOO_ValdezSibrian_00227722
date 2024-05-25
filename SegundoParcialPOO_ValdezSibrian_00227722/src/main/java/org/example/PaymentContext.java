public class PaymentContext {
    private PaymentProcessor paymentProcessor;

    public void setPaymentProcessor(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void executePayment(String username, String password) {
        if (paymentProcessor != null) {
            paymentProcessor.processPayment(username, password);
        } else {
            System.out.println("Payment processor not set.");
        }
    }
}
