public class prog_106 {
    public static void main (String args[]){
        Thread thread = new Thread(()->{
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                
                try {
                    Thread.sleep(1000); // sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("Thread is alive: " + thread.isAlive());
        thread.start();
        System.out.println("Thread is alive: " + thread.isAlive());
        
        try {
            thread.join(); // wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Thread is alive: " + thread.isAlive());
    }
}

   
