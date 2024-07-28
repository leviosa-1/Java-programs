public class prog_104 {
    public static void main (String args[]){
        Thread thread = Thread.currentThread();
        System.out.println("Current thread: " + thread.getName());
        System.out.println("Thread ID: " + thread.getId());
        System.out.println("Thread priority: " + thread.getPriority());
        System.out.println("Thread state: " + thread.getState());
        System.out.println("Thread is alive: " + thread.isAlive());

    }
}
