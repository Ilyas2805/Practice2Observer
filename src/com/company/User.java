package com.company;

import java.util.List;

public class User implements Observer{
    private String name;

    public User(String name){
        this.name = name;
    }


    @Override
    public void update(List<String> vacancies) {
        System.out.println("Dear " + this.name + "\n We have some changes in vacancies\n" + vacancies + "\n");
    }
}
