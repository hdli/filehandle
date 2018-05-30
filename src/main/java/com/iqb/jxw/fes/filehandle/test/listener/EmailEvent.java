package com.iqb.jxw.fes.filehandle.test.listener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by hdli on 2018-5-30.
 */
public class EmailEvent extends ApplicationEvent {

    private static final long serialVersionUID = 2362442810908165889L;

    public String address;
    public String text;

    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public EmailEvent(Object source) {
        super(source);
    }

    public EmailEvent(Object source, String address, String text) {
        super(source);
        this.address = address;
        this.text = text;
    }

    public void print(){
        System.out.println("hello spring event!");
    }
}
