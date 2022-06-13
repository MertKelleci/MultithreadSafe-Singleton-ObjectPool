public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");

        Customer c1 = new Customer("Mehmet", ThreadColor.ANSI_YELLOW);
        Customer c2 = new Customer("Zeynep", ThreadColor.ANSI_BLUE);
        Customer c3 = new Customer("Mustafa", ThreadColor.ANSI_CYAN);
        Customer c4 = new Customer("Ahmet", ThreadColor.ANSI_GREEN);
        Customer c5 = new Customer("Fatma", ThreadColor.ANSI_PURPLE);
        Customer c6 = new Customer("Ali", ThreadColor.ANSI_RED);
        Customer c7 = new Customer("Meryem", ThreadColor.ANSI_YELLOW);
        Customer c8 = new Customer("Hüseyin", ThreadColor.ANSI_RED);
        Customer c9 = new Customer("Elif", ThreadColor.ANSI_BLUE);
        Customer c10 = new Customer("Osman", ThreadColor.ANSI_BLUE);
        Customer c11 = new Customer("Ayşe", ThreadColor.ANSI_CYAN);
        Customer c12 = new Customer("Mert", ThreadColor.ANSI_GREEN);
        Customer c13 = new Customer("Ömer", ThreadColor.ANSI_PURPLE);
        Customer c14 = new Customer("İbrahim", ThreadColor.ANSI_RED);
        Customer c15 = new Customer("Furkan", ThreadColor.ANSI_YELLOW);

        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        new Thread(c4).start();
        new Thread(c5).start();
        new Thread(c6).start();
        new Thread(c7).start();
        new Thread(c8).start();
        new Thread(c9).start();
        new Thread(c10).start();
        new Thread(c11).start();
        new Thread(c12).start();
        new Thread(c13).start();
        new Thread(c14).start();
        new Thread(c15).start();

    }
}
