package com.giea.model.constructions;

import com.giea.model.projects.Project;

import java.util.ArrayList;
import java.util.List;

public class Construction {

    protected List<Project> projects = new ArrayList<>();
    protected String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
