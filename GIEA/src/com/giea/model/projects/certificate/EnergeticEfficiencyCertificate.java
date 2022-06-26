package com.giea.model.projects.certificate;

import com.giea.model.people.BuildingEngineer;

import java.time.LocalDate;

public class EnergeticEfficiencyCertificate extends Certificate{
    public enum EnergeticCategory{
        A,B,C,D,E,F,G
    }
    private EnergeticCategory category;
    private BuildingEngineer buildingEngineer;

}
