package com.giea.management;

import com.giea.model.people.Client;
import com.giea.model.people.Employee;
import com.giea.model.projects.Project;
import com.giea.model.projects.certificate.Certificate;

import java.util.ArrayList;
import java.util.List;

public class Estudio {

    private List<Client> clients = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();
    private List<Project> projects = new ArrayList<>();

    public static void main(String[] str){
        new Estudio();
    }

    public Estudio(){
        showMenu();
    }
    private void showMenu() {

    }

}
