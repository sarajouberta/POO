package com.giea.model.people;

//import java.util.Random;
import com.giea.model.projects.ArchitecturalProject;
import com.giea.model.projects.Certificate;

import java.util.ArrayList;


public class Client extends Person{
    private int id;
    //¿array de certificados y de solicitudes de proyectos por cada cliente?
    ArrayList<Certificate> arrayCertificates = new ArrayList<>();

    ArrayList<ArchitecturalProject> arrayProjects = new ArrayList<>();


    public Client() { //¿Constructor de nuevo cliente?
    }

    /*No sé hacer esto, la idea era generar un id, pero realmente habría que cmprobar que no esté cogido ya.
    public int getRandomId{
        Random getRandom = new Random();
        id = getRandom.nextInt();
        return id;
    }*/

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

