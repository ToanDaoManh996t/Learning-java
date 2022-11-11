package org.o7planning.tutorial.ann.builtin;

import java.util.Date;

public class SuppressWarningsDemo {
    @SuppressWarnings("deprecation") //comment this line to see
    public Date getSomeDate() {
        Date date = new Date(2014, 9 , 25);
        return date;
    }
}
