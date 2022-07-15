package com.giea.model.projects.certificate;

import com.giea.model.people.BuildingEngineer;

import java.time.LocalDate;

public class HabitabilityCertificate extends Certificate{
    public static final int EXPIRATION_YEARS = 15;

    protected LocalDate engineerVisit;
    protected boolean expired = false;
    protected BuildingEngineer buildingEngineer;


    public LocalDate getEngineerVisit() {
        return engineerVisit;
    }

    public void setEngineerVisit(LocalDate engineerVisit) {
        this.engineerVisit = engineerVisit;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public BuildingEngineer getBuildingEngineer() {
        return buildingEngineer;
    }

    public void setBuildingEngineer(BuildingEngineer buildingEngineer) {
        this.buildingEngineer = buildingEngineer;
    }

    public boolean isExpired(){
        if(Boolean.TRUE.equals(expired)){
            return expired;
        }else{
            LocalDate timeSinceCerfiticate = certificateDate.plusYears(EXPIRATION_YEARS);
            expired = LocalDate.now().isAfter(timeSinceCerfiticate);
            return expired;
        }
    }

}

