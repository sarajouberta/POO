package com.giea.management;

import com.giea.model.people.Client;
import com.giea.model.people.Employee;

import java.util.ArrayList;
import java.util.List;

public interface UserManagement {

    public void newClient(Client client);
    public void signOutClient(Client client);
    public void newEmployee(Employee employee);
    public void signOutEmployee(Employee employee);
}
