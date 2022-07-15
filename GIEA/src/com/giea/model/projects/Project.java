package com.giea.model.projects;

import com.giea.model.constructions.Construction;
import com.giea.model.people.Architect;
import com.giea.model.people.Client;

import java.time.LocalDate;

public class Project {
    protected LocalDate requestDate; //Fecha de petición del proyecto. I
    protected LocalDate deliveryDate; // Fecha de entrega al cliente del proyecto.
    //añado las relaciones de empleados con los proyectos,a ver
    protected Client client;
    protected Architect architect;
    protected Construction construction;
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Architect getArchitect() {
        return architect;
    }

    public void setArchitect(Architect architect) {
        this.architect = architect;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Construction getConstruction() {
        return construction;
    }

    public void setConstruction(Construction construction) {
        this.construction = construction;
    }
}
