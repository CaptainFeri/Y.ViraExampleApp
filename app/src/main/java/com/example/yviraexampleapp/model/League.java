package com.example.yviraexampleapp.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import com.example.yviraexampleapp.model.Rank.Rank;

import java.util.List;

public class League extends BaseObservable {

    //fields
    private int leagueId;
    private String leagueName;
    private String leagueImageIcon;
    private List<Team> mTeamList;
    private Rank mRank;

    //constructor
    public League(String leagueName, String leagueImageIcon, List<Team> teamList) {
        this.leagueName = leagueName;
        this.leagueImageIcon = leagueImageIcon;
        mTeamList = teamList;
    }

    //getter
    @Bindable
    public int getLeagueId() {
        return leagueId;
    }

    @Bindable
    public String getLeagueName() {
        return leagueName;
    }

    @Bindable
    public String getLeagueImageIcon() {
        return leagueImageIcon;
    }

    @Bindable
    public List<Team> getTeamList() {
        return mTeamList;
    }

    @Bindable
    public Rank getRank() {
        return mRank;
    }

    //setters
    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
        notifyPropertyChanged(BR.leagueId);
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
        notifyPropertyChanged(BR.leagueName);
    }

    public void setLeagueImageIcon(String leagueImageIcon) {
        this.leagueImageIcon = leagueImageIcon;
        notifyPropertyChanged(BR.leagueImageIcon);
    }

    public void setTeamList(List<Team> teamList) {
        mTeamList = teamList;
        notifyPropertyChanged(BR.teamList);
    }

    public void setRank(Rank rank) {
        mRank = rank;
        notifyPropertyChanged(BR.rank);
    }
}
