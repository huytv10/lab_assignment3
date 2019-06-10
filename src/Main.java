public class Main {
    public static void main(String[] args) throws InterruptedException {
        int i = 10;
        while (true) {
            if (i < 1) {
                System.out.println("success");
                return;
            } else {
                System.out.println(i);
                i--;
                Thread.sleep(1000);
            }
        }
    }
}
