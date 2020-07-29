package com.example.yviraexampleapp.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class Player extends BaseObservable {

    //fields
    private int playerId;
    private String name = "";
    private String post = "";
    private int score = 0;
    private int Age = 18;

    //constructor
    public Player() {
    }

    //getters
    @Bindable
    public int getPlayerId() {
        return playerId;
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public String getPost() {
        return post;
    }

    @Bindable
    public int getScore() {
        return score;
    }

    @Bindable
    public int getAge() {
        return Age;
    }

    //setters
    public void setPlayerId(int playerId) {
        this.playerId = playerId;
        notifyPropertyChanged(BR.playerId);
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setPost(String post) {
        this.post = post;
        notifyPropertyChanged(BR.post);
    }

    public void setScore(int score) {
        this.score = score;
        notifyPropertyChanged(BR.score);
    }

    public void setAge(int age) {
        Age = age;
        notifyPropertyChanged(BR.age);
    }
}
