public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println ();
        System.out.println ("Ежемесячный платеж на 12 месяцев:");
        System.out.println(Math.round(service.calculate(1_000_000, 9.9, 12)));

        System.out.println ();
        System.out.println ("Ежемесячный платеж на 24 месяца:");
        System.out.println(Math.round(service.calculate(1_000_000, 9.9, 24)));

        System.out.println ();
        System.out.println ("Ежемесячный платеж на 36 месяцев:");
        System.out.println(Math.round(service.calculate(1_000_000, 9.9, 36)));
    }
}
