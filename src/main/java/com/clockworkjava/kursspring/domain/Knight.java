package com.clockworkjava.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Knight {

    private String name = "Lancelot";

    private int age = 29;

    private Quest quest;

//    public Knight(String name, int age, Quest quest) {
//        this.name = name;
//        this.age = age;
//        this.quest = quest;


    public Knight() {
    }

//    public Knight(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }

    @Autowired
    public void setQuest(Quest quest) {
        System.out.println("Set the quest: ");
        this.quest = quest;
    }

    @Override
    public String toString() {
        return " Knight" + " " + name + " " + age + " QUEST " + quest;
    }
}
