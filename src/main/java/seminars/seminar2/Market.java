package seminars.seminar2;

import java.util.List;

public class Market implements QueueBehaviour, MarketBehaviour{

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor + " пришел в магазин");
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        System.out.println(actors + " ушел из магазина");
    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor + " встал в очередь");
    }

    @Override
    public void takeOrders() {
        System.out.println("Клиент забрал заказ");
    }

    @Override
    public void giveOrders() {
        System.out.println("Клиент сделал заказ");
    }

    @Override
    public void releaseFromQueue() {
        System.out.println("Клиент ушел из очереди");
    }
}
