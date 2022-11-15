package org.o7planning.tutorial.javacollection.helloworld;

import java.util.HashMap;

public class HelloHashMap {
    public static void main(String[] args) {
        HashMap<String, Float> salaryMap = new HashMap<>();
        salaryMap.put("E01", 1000f);
        salaryMap.put("E02", 12000f);
        salaryMap.put("E03", 12300f);
        salaryMap.put("E04", 1000f);
        salaryMap.put("E05", 300.5f);

        Float salary = salaryMap.get("E02");
        System.out.println(salary);
        salaryMap.put("E05", 400f);
        System.out.println(salaryMap.get("E05"));
    }
}
