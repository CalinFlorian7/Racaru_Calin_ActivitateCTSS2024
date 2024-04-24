package observer.program;

import observer.clase.Autobuz;
import observer.clase.Client;
import observer.clase.Subiect;
import observer.clase.Tramvai;

public class Program {
    public static void main(String[] args) {
        Client client = new Client("Gabi");
        Client client1 = new Client("Andrei");
        Subiect tramvai = new Tramvai(41);
        tramvai.abonareObservable(client);
        tramvai.abonareObservable(client1);
        tramvai.anuntaPlecare();
        tramvai.dezabonareObservable(client);
        Client client3 = new Client("Liviu");
        tramvai.abonareObservable(client3);
        tramvai.anuntaPlecare();
        tramvai.trimiteMesaje("Plecam!");

        Subiect autobuz = new Autobuz();
        autobuz.abonareObservable(client);
        autobuz.abonareObservable(client3);
        autobuz.anuntaPlecare();
    }
}
