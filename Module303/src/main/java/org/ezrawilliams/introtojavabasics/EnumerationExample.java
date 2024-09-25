package org.ezrawilliams.introtojavabasics;
/*
Enum - mini kind of class in Java
 */

public class EnumerationExample {
    enum Card{
        SPADE, HEART, CLUB, DIAMOND;
    }

    public enum MyDatabaseconnection {
        ORACLEDB("ORACLE DATABASE IS CONNECTION ..."),
        SQLDBB("SQL DATABASE IS CONNECTING..."),
        POSTGRESSQL("POSTGRES DATABASE IS CONNECTING");
        // Class variable
        private final String establishDatabaseConnection;
        // private enum constructor
        private MyDatabaseconnection(String establishDatabaseConnection) {
            this.establishDatabaseConnection = establishDatabaseConnection;
        }
        // getter
        public String getEstablishDatabaseConnection() {
            return establishDatabaseConnection;   }
    }

    public static void main(String[] args) {
        // Reference variables to hold those
        Card spade = Card.SPADE;
        Card heart = Card.HEART;
        Card club = Card.CLUB;
        Card diamond = Card.DIAMOND;

        for (Card card : Card.values()) {
            System.out.println(card);
        }
        MyDatabaseconnection db = MyDatabaseconnection.ORACLEDB;
        System.out.println(db);
        System.out.println(db.getEstablishDatabaseConnection());

    }
}
