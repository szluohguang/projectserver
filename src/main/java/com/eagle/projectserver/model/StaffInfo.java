package com.eagle.projectserver.model;

public class StaffInfo {
    private String um;
    private String name;
    private String team;
    private String depart;
    private int     type;
    private String skill;
    private String memo;

    public void setum( String um ) {
        this.um =um;
    }
    public void setName( String name ) {
        this.name = name;
    }
    public void setTeam( String team ){
        this.team = team;
    }
    public void setDepart( String depart ) {
        this.depart = depart;
    }
    public void setType( int type ) {
        this.type = type;
    }
    public void setSkill( String skill ) {
        this.skill = skill;
    }
    public void setMemo( String memo ) {
        this.memo = memo;
    }

    public String getum( ) {
        return um;

    }
    public String getName () {
        return name;
    }
    public String getTeam() {
        return team;
    }
    public String getDepart() {
        return depart;
    }
    public int getType () {
        return type;
    }
    public String getSkill() {
        return skill;
    }
    public String getMemo() {
        return memo;
    }

}