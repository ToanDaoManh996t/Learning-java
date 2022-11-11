package org.o7planning.tutorial.javaenum;

public enum Currency {
    VND, USD, EURO;

    @Override
    public String toString() {
        if (this == VND) {
            return "Dong";
        } else if (this == USD) {
            return "$";
        }
        return super.toString();
    }

    public static void main(String[] args) {
        Currency money = Currency.USD;
        System.out.println("Money " + money);
        System.out.println("Money " + money.toString());
        System.out.println("Vnd: " + Currency.VND);
        System.out.println("Euro: " + Currency.EURO);
    }
}


