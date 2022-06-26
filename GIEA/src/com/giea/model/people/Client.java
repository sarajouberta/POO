package com.giea.model.people;

//import java.util.Random;
import com.giea.model.projects.Project;

import java.util.ArrayList;
import java.util.List;


public class Client extends Person{
    private int id;
    private List<Project> projects = new ArrayList<>();

    /*No sé hacer esto, la idea era generar un id, pero realmente habría que cmprobar que no esté cogido ya.
    private int getRandomId(){
        Random random = new Random();
        return random.nextInt();
    }*/

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

