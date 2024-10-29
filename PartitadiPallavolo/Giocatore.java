public class Giocatore implements Runnable {
    private int id;
    private int numeroPassaggi;

    public Giocatore(int id) {
        this.id = id;
        this.numeroPassaggi = 0;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + " e " + Thread.currentThread().getPriority());
        while(numeroPassaggi<100){
            numeroPassaggi++;
            System.out.println("Giocatore: " + id + " passaggi: " + numeroPassaggi);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Thread.currentThread();
            Thread.yield();
        }
    }
}