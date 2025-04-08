package com.example.myandroidapp.application;

public class Main {

    private static String dbName = "PrepprDB";

    public static void setDBPathName(final String name) {
        dbName = name;
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver").newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("Unable to connect to the database at this time. Please try again later.", e);
        }
    }

    public static String getDBPathName() {
        return dbName;
    }
}
