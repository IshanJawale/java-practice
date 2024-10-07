class MyThread extends Thread {
    public void run() {
        for(int i = 0; i <=100000; i++) {
            System.out.println(i);
        }
    }
}

public class multi_extend {
    public static void main(String[] args) {
        MyThread obj = new MyThread();
        Thread t = new Thread(obj);
        t.start();
    }
}
