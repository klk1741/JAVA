package thread;

public class BigLetters extends Thread {
    @Override
    public void run() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch);
        }
    }
}