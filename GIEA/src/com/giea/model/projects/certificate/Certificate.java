package com.giea.model.projects.certificate;

import com.giea.model.people.Accountant;
import com.giea.model.people.Architect;
import com.giea.model.people.Client;
import com.giea.model.projects.Project;

import java.time.LocalDate;

public class Certificate extends Project {

    protected long cost;
    protected Accountant accountant;
    protected LocalDate certificateDate;

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }
}
