package org.Designs.Observer.Subjects;

import org.Designs.Observer.Observers.StocksObserver;

import java.util.ArrayList;
import java.util.List;

public class Stock implements StocksObservable{

    private List<StocksObserver> observers;
    private int stock;

    public Stock(List<StocksObserver> observers) {
        this.observers = observers;
        stock =0;
    }

    public Stock() {
        observers = new ArrayList<>();
        stock =0;
    }

    @Override
    public void add(StocksObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(StocksObserver observer) {

        if (observers.indexOf(observer) >= 0) {
            observers.remove(observer);
        }else {
            System.out.println("Observer not found");
        }

    }

    @Override
    public void notifyObservers() {

        for (StocksObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStocks(int stock) {

         if (this.stock ==0){
                notifyObservers();
         }
         this.stock += stock;

    }
}
