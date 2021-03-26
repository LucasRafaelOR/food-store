package br.edu.ifpb.padroes.service.order;

public class OrderPublisher
{
    private ArrayList<Listener> subscribers = new ArrayList<>();

    public void subscribe(Listener l)
    {
        subscribers.add(l);
    }

    public void notifyObservers(String event)
    {
        subscribers.forEach(listener -> listener.update(event));
    }
}