package org.Designs.Observer.Observers;

import org.Designs.Observer.Subjects.StocksObservable;

public class EmailObserver implements StocksObserver {

    private String email;

    public EmailObserver(String email, StocksObservable stocksObservable) {
        this.email = email;
        stocksObservable.add(this);
    }

    @Override
    public void update() {
        System.out.println("Email sent to " + email );
    }



}
