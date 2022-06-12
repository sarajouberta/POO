package com.giea.model.projects;

import com.giea.model.people.Architect;
import com.giea.model.people.Client;

import java.time.LocalDate;

public class Certificate {
    //Fecha solicitud
    private LocalDate requestDate;
    //Fecha de entrega
    private LocalDate deliveryDate;
    //Coste del certificado
    private long cost;

    //Relación cliente
    private Client client;
    //Relación arquitecto
    private Architect architect;


    

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

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

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
}
