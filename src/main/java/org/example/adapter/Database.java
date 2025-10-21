package org.example.adapter;

public interface Database {
    void connect();
    void disconnect();
    void query(String sql);
    void execute(String sql);
}
