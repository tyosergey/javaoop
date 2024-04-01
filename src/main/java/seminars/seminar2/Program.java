package seminars.seminar2;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Actor h1 = new Human("Sergey");
        List<Actor> actors = new ArrayList<>();
        actors.add(h1);
        Market supermarket = new Market();
        supermarket.acceptToMarket(h1);
        supermarket.takeInQueue(h1);
        supermarket.giveOrders();
        supermarket.takeOrders();
        supermarket.releaseFromQueue();
        supermarket.releaseFromMarket(actors);
    }
}
