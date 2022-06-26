package com.giea.model.projects.certificate;

import com.giea.model.people.BuildingEngineer;

import java.time.LocalDate;

public class HabitabilityCertificate extends Certificate{
    public static final int EXPIRATION_YEARS = 15;
    private LocalDate engineerVisit;
    private boolean expired = false;
    private BuildingEngineer buildingEngineer;



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

