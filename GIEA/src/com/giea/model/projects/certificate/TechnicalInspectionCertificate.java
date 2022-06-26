package com.giea.model.projects.certificate;

import java.time.LocalDate;

public class TechnicalInspectionCertificate extends Certificate{
    public static final int EXPIRATION_YEARS = 45;
    private boolean expired = false;


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
