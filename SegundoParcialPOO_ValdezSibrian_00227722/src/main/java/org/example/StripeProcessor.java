public class StripeProcessor implements PaymentProcessor {
    @Override
    public void processPayment(String username, String password) {
        String token = username + ":stripe";
        System.out.println("Processing payment with Stripe for user: " + token);
    }
}
