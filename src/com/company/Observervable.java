package com.company;

public interface Observervable {
    void registerUser(Observer user);
    void unregisterUser(Observer user);
    void notifyAllUsers();
}
