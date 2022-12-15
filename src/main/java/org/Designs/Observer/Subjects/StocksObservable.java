package org.Designs.Observer.Subjects;

import org.Designs.Observer.Observers.StocksObserver;

public interface StocksObservable {

    public void add(StocksObserver observer);

    public void remove(StocksObserver observer);

    public void notifyObservers();

    public void setStocks(int stock);


}
