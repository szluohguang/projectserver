package com.eagle.projectserver.model;

import java.io.Serializable;
import java.sql.Date;

public class ProjInfo implements Serializable {
    private static final long serialVersionUID = 5679176319867604937L;
    private long    id;
    private String projName;
    private String subProj;
    private String projOwner;
    private Date    startDate;
    private Date    finishDate;
    private int     staff;
    private int     outStaff;
    private int     projStatus;
    private String  memo;

    public void setId( long id ) {
        this.id = id;
    }
    public void setProjName( String projName ) {
        this.projName = projName;
    }

    public void setSubProj( String sub) {
        this.subProj = sub;
    }
    public void setProjOwner( String owner ) {
        this.projOwner = owner;
    }
    public void setStartDate( Date start ) {
        this.startDate = start;
    }
    public void setFinishDate( Date finish ) {
        this.finishDate = finish;
    }
    public void setStaff( int staff ) {
        this.staff = staff;
    }
    public void setOutStaff( int outStaff ) {
        this.outStaff = outStaff;
    }
    public void setProjStatus( int status ) {
        this.projStatus = status;
    }
    public void setMemo( String memo) {
        this.memo = memo;
    }

    public long getId() {
        return id;
    }
    public String getProjName(  ) {
        return projName;
    }
    public String getSubProj(  ) {
        return subProj;
    }
    public String getProjOwner(  ) {
        return projOwner;
    }
    public Date getStartDate() {
        return startDate;
    }
    public Date getFinishDate() {
        return finishDate;
    }
    public int getStaff() {
        return staff;
    }
    public int getOutStaff() {
        return outStaff;
    }
    public int getProjStatus() {
        return projStatus;
    }
    public String getProjMemo() {
        return memo;
    }
}