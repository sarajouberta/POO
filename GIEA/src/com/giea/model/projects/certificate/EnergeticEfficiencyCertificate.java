package com.giea.model.projects.certificate;

import com.giea.model.people.BuildingEngineer;

import java.time.LocalDate;

public class EnergeticEfficiencyCertificate extends Certificate{
    public enum EnergeticCategory{
        A,B,C,D,E,F,G
    }
    protected EnergeticCategory category;
    protected BuildingEngineer buildingEngineer;

    public EnergeticCategory getCategory() {
        return category;
    }

    public void setCategory(EnergeticCategory category) {
        this.category = category;
    }

    public BuildingEngineer getBuildingEngineer() {
        return buildingEngineer;
    }

    public void setBuildingEngineer(BuildingEngineer buildingEngineer) {
        this.buildingEngineer = buildingEngineer;
    }
}
