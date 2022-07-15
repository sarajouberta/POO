package com.giea.model.people;

import com.giea.model.projects.architecture.ArchitecturalProject;
import com.giea.model.projects.certificate.Certificate;

import java.util.ArrayList;
import java.util.List;

public class Architect extends Employee{
    private List<ArchitecturalProject> architecturalProject = new ArrayList<>();
    private List<Certificate> certificates = new ArrayList<>();
}
