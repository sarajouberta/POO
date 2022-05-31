package com.giea.model.projects;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;

public class ArchitecturalProject {
    //private Date requestDate;
    private LocalDate requestDate; //Fecha de petición del proyecto. I
    private LocalDate startProjectDate; // Fecha de comienzo del proyecto.
    private LocalDate endProjectDate; // Fecha de finalización del proyecto.
    private LocalDate deliveryDate; // Fecha de entrega al cliente del proyecto.
    private long expectedDays; // Duración prevista del proyecto.
    private long budget;


}
