package org.o7planning.tutorial.ann.builtin;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SuppressWarningsDemo2 {
    public List<?> getDatas() {
        List<String> list = new ArrayList<String>();
        list.add("One");
        return list;
    }

    @SuppressWarnings({"deprecation", "unused", "unchecked"})
    public void processDatas() {
        Date date = new Date(2014, 9 ,25 );

        List<String> datas = (List<String>) this.getDatas();
    }
}
