package com.giea.model.projects;

public class NotResidentialProject extends ArchitecturalProject{
    private float buildingArea; // Superficie del edificio.
    private float landArea; // Superficie del terreno.
    private String purpose; //Finalidad del proyecto.

    public float getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(float buildingArea) {
        this.buildingArea = buildingArea;
    }

    public float getLandArea() {
        return landArea;
    }

    public void setLandArea(float landArea) {
        this.landArea = landArea;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
