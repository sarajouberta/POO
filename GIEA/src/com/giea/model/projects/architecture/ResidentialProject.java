package com.giea.model.projects.architecture;

public class ResidentialProject extends ArchitecturalProject{
    private float buildingArea; // Superficie del edificio.
    private float landArea; // Superficie del terreno.
    private int floors; // Número de plantas.
    private int rooms; // Número de habitaciones.
    private int bathrooms; // Número de baños.



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

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }
}
