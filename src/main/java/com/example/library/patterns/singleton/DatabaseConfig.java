package com.example.library.patterns.singleton;

public class DatabaseConfig {

    private static DatabaseConfig instance;

    private DatabaseConfig() {}

    public static synchronized DatabaseConfig getInstance() {
        if (instance == null) {
            instance = new DatabaseConfig();
        }
        return instance;
    }
}
