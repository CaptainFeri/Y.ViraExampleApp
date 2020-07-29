package com.example.yviraexampleapp.model;

import android.icu.util.Calendar;
import android.os.Build;

import androidx.annotation.RequiresApi;
import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

import java.text.SimpleDateFormat;

public class Match extends BaseObservable {

    //fields
    private int matchId;
    private int leagueId;
    private String HomeTeamName;
    private String AwayTeamName;
    private int HomeGoalCount = 0;
    private int AwayGoalCount = 0;
    private String GameTime;

    //constructor
    @RequiresApi(api = Build.VERSION_CODES.N)
    public Match(int leagueId, String homeTeamName, String awayTeamName) {
        this.leagueId = leagueId;
        HomeTeamName = homeTeamName;
        AwayTeamName = awayTeamName;
        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        GameTime = df.format(c.getTime());
    }

    //getters
    @Bindable
    public int getMatchId() {
        return matchId;
    }

    @Bindable
    public int getLeagueId() {
        return leagueId;
    }

    @Bindable
    public String getHomeTeamName() {
        return HomeTeamName;
    }

    @Bindable
    public String getAwayTeamName() {
        return AwayTeamName;
    }

    @Bindable
    public int getHomeGoalCount() {
        return HomeGoalCount;
    }

    @Bindable
    public int getAwayGoalCount() {
        return AwayGoalCount;
    }

    @Bindable
    public String getGameTime() {
        return GameTime;
    }

    //setters
    public void setMatchId(int matchId) {
        this.matchId = matchId;
        notifyPropertyChanged(BR.matchId);
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
        notifyPropertyChanged(BR.leagueId);
    }

    public void setHomeTeamName(String homeTeamName) {
        HomeTeamName = homeTeamName;
        notifyPropertyChanged(BR.homeTeamName);
    }

    public void setAwayTeamName(String awayTeamName) {
        AwayTeamName = awayTeamName;
        notifyPropertyChanged(BR.awayTeamName);
    }

    public void setHomeGoalCount(int homeGoalCount) {
        HomeGoalCount = homeGoalCount;
        notifyPropertyChanged(BR.homeGoalCount);
    }

    public void setAwayGoalCount(int awayGoalCount) {
        AwayGoalCount = awayGoalCount;
        notifyPropertyChanged(BR.awayGoalCount);
    }

    public void setGameTime(String gameTime) {
        GameTime = gameTime;
        notifyPropertyChanged(BR.gameTime);
    }
}
