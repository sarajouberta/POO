package com.giea.model.projects.architecture;

import com.giea.model.constructions.Construction;
import com.giea.model.people.Accountant;
import com.giea.model.people.Architect;
import com.giea.model.people.BuildingEngineer;
import com.giea.model.people.Client;
import com.giea.model.projects.Project;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;

public class ArchitecturalProject extends Project {
    protected LocalDate startProjectDate; // Fecha de comienzo del proyecto.
    protected LocalDate endProjectDate; // Fecha de finalización del proyecto.
    protected long expectedDays; // Duración prevista del proyecto.
    protected long budget; //Presupuesto. Relación con el contable asociado.
    protected BuildingEngineer buildingEngineer;
    protected Accountant accountant;




    public BuildingEngineer getBuildingEngineer() {
        return buildingEngineer;
    }

    public void setBuildingEngineer(BuildingEngineer buildingEngineer) {
        this.buildingEngineer = buildingEngineer;
    }

    public Accountant getAccountant() {
        return accountant;
    }

    public void setAccountant(Accountant accountant) {
        this.accountant = accountant;
    }


    public LocalDate getStartProjectDate() {
        return startProjectDate;
    }

    public void setStartProjectDate(LocalDate startProjectDate) {
        this.startProjectDate = startProjectDate;
    }

    public LocalDate getEndProjectDate() {
        return endProjectDate;
    }

    public void setEndProjectDate(LocalDate endProjectDate) {
        this.endProjectDate = endProjectDate;
    }

    public long getExpectedDays() {
        return expectedDays;
    }

    public void setExpectedDays(long expectedDays) {
        this.expectedDays = expectedDays;
    }

    public long getBudget() {
        return budget;
    }

    public void setBudget(long budget) {
        this.budget = budget;
    }

}
