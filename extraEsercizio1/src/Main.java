//4.Test del programma:
// Nel main del programma, creare almeno un'istanza di Automobile e una di Moto.
// Utilizzare i metodi definiti per accelerare, decelerare e fermare i veicoli.
// Stampare lo stato dei veicoli durante le operazioni.
public class Main {
    public static void main (String [] args){
        Automobile auto = new Automobile(100.0);
        Moto moto =new Moto(110.0);

        auto.accelerare(10);
        auto.decelerare(20);
        //auto.fermarsi(0);

        moto.accelerare(10);
        moto.decelerare(20);
        //moto.fermarsi(0);

        System.out.println("Stato dell'automobile: Velocità attuale = " + auto.getVelocita());
        System.out.println("Stato della moto: Velocità attuale = " + moto.getVelocita());
    }
}
