package com.example.yviraexampleapp.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import java.util.List;

public class Team extends BaseObservable {

    //fields
    private String teamName;
    private String teamImageIcon;
    private int teamId;
    private List<Player> playerList;
    private String Couch;

    //constructor
    public Team(String teamName, String teamImageIcon, List<Player> playerList) {
        this.teamName = teamName;
        this.teamImageIcon = teamImageIcon;
        this.playerList = playerList;
    }

    //getters
    @Bindable
    public String getTeamName() {
        return teamName;
    }

    @Bindable
    public String getTeamImageIcon() {
        return teamImageIcon;
    }

    @Bindable
    public int getTeamId() {
        return teamId;
    }

    @Bindable
    public List<Player> getPlayerList() {
        return playerList;
    }

    @Bindable
    public String getCouch() {
        return Couch;
    }

    //setters
    public void setTeamName(String teamName) {
        this.teamName = teamName;
        notifyPropertyChanged(BR.teamName);
    }

    public void setTeamImageIcon(String teamImageIcon) {
        this.teamImageIcon = teamImageIcon;
        notifyPropertyChanged(BR.teamImageIcon);
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
        notifyPropertyChanged(BR.teamId);
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
        notifyPropertyChanged(BR.playerList);
    }

    public void setCouch(String couch) {
        Couch = couch;
        notifyPropertyChanged(BR.couch);
    }
}
