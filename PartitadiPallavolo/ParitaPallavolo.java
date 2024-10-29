public class ParitaPallavolo {
    public static void main(String[] args){
        Giocatore g1 = new Giocatore(1); //non è un thread
        Thread t1 = new Thread(g1); //thread
        Giocatore g2 = new Giocatore(2);
        Thread t2 = new Thread(g2);
        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        
        
    }
}
