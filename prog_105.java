public class prog_105 {
    public static void main(String args[]){
        Runnable runnable = new Runnable() {
            public void run() {
                System.out.println("Program to create a thread using Runnable interface");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(i);
                    
                    try {
                        Thread.sleep(1000); // sleep for 1 second
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

    }
}
