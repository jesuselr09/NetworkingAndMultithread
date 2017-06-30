package javaadvanced.Miercoles;

public class TestJoin extends Thread {

    private static void showDetails(TestJoin t1, TestJoin t2, TestJoin t3) {
        }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestJoin t1 = new TestJoin();
        TestJoin t2 = new TestJoin();
        TestJoin t3 = new TestJoin();
        
        showDetails(t1,t2,t3);
        
        t1.start();
        try {
            t1.join(1500);
            t1.setName("Fer");
            t1.setPriority(MAX_PRIORITY);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        t2.start();
        t3.start();
    }
    public static void shotDetails(TestJoin t1,TestJoin t2,TestJoin t3){
        
        System.out.println("Hilo 1: " + t1.getName());
        System.out.println("Hilo 2: " + t2.getName());
        System.out.println("Hilo 3: " + t3.getName());
        System.out.println("Hilo 1: " + t1.getId());
        System.out.println("Hilo 2: " + t2.getId());
        System.out.println("Hilo 3: " + t3.getId());
        System.out.println("Hilo 3: " + t3.getState());
        System.out.println("Hilo 3: " + t3.getState());
        System.out.println("Hilo 3: " + t3.getState());
    }
}
