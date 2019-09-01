package com.eagle.projectserver.model;

import java.util.Date;

public class StaffStatus {

    private String um;
    private long projId;
    private Date inputDate;

    public void setum( String um ) {
        this.um = um;
    }
    public void setProjId( long id ) {
        this.projId = id;
    }
    public void setInputDate( Date input ) {
        this.inputDate = input;
    }

    public String getum( ) {
        return um;
    }
    public long getProjId() {
        return projId;
    }
    public Date getInputDate() {
        return inputDate;
    }
}