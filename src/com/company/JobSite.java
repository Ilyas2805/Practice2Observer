package com.company;

import java.util.ArrayList;
import java.util.List;

public class JobSite implements Observervable{

    private List<String> vacancies = new ArrayList<>();
    private List<Observer> users = new ArrayList<>();

    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyAllUsers();
    }

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyAllUsers();
    }

    @Override
    public void registerUser(Observer user) {
       this.users.add(user);
    }

    @Override
    public void unregisterUser(Observer user) {
        this.users.remove(user);
    }

    @Override
    public void notifyAllUsers() {
        for(Observer user:this.users){
            user.update(this.vacancies);
        }
    }
}
