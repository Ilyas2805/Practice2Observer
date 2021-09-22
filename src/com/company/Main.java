package com.company;

public class Main {

    public static void main(String[] args) {
	    JobSite hhkz = new JobSite();
        hhkz.addVacancy("Java Junior Developer");
        hhkz.addVacancy("Golang Developer");

        User someUser = new User("Bob");
        User someUser2 = new User("Alice");

        hhkz.registerUser(someUser);
        hhkz.registerUser(someUser2);

        hhkz.addVacancy("DevOps Engineer");
        hhkz.removeVacancy("Java Junior Developer");
    }
}
