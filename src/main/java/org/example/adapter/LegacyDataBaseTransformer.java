package org.example.adapter;

public class LegacyDataBaseTransformer implements Database {
    LegacyDataBase legacyDataBase;
    public LegacyDataBaseTransformer(LegacyDataBase legacyDataBase) {
        this.legacyDataBase = legacyDataBase;
    }

    @Override
    public void connect() {
        legacyDataBase.initialize();
    }

    @Override
    public void disconnect() {
        legacyDataBase.destroy();
    }

    @Override
    public void query(String sql) {
        legacyDataBase.makeQuery(sql);
    }

    @Override
    public void execute(String sql) {
        legacyDataBase.executeQuery(sql);
    }
}
