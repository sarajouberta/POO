package com.giea.management;

import com.giea.model.people.Client;
import com.giea.model.people.Employee;

import java.util.ArrayList;
import java.util.List;

public class DefaultUserManagement implements UserManagement {
    private List<Client> clients = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public void newClient(Client client) {  //Dar de alta cliente.
        if (clients.contains(client)) {
            throw new IllegalArgumentException("This client already exists.");
        } else {
            clients.add(client);
        }
    }

        public void signOutClient(Client client) {  //Dar de baja cliente. POR QUÉ ESTÁ EN ROJO, ME MATO.
            if (clients.contains(client)) {
                clients.remove(client);
            } else {
                throw new IllegalArgumentException("This client doesn't exists.");
            }
        }

        public void newEmployee(Employee employee){ //Dar de alta empleado.
            if(employees.contains(employee)){
                throw new IllegalArgumentException("This employee already exists.");
            }else{
                employees.add(employee);
            }
        }

        public void signOutEmployee(Employee employee){  //Dar de baja empleado.
            employees.remove(employee);
        }

        /*MIERDA, si hago solo un array de Person vale luego para modificar ambas? o necesito dos arrays.
        public void editPerson(Person person){
            if()
        }*/
}
