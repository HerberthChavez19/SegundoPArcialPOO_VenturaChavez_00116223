public class Main {
    public static void main(String[] args) {
        Paypal m1 = new Paypal("Juan", "1234");

        Warning indicator1 = new Warning("Paypal");

        System.out.println("Metodo Paypal:");
        System.out.println(indicator1.indicator(m1));

        Stripe m2 = new Stripe("14321","Juan");
        Adaptador m2Adapted = new Adaptador(m2);

        System.out.println("----------------------------------------");

        System.out.println("Metodo Stripe");
        System.out.println(indicator1.indicator((m2Adapted)));

    }
}
