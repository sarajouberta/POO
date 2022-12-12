package com.giea.management;

import com.giea.model.people.Client;
import com.giea.model.people.Employee;
import com.giea.model.projects.Project;
import com.giea.model.projects.certificate.Certificate;
import com.giea.service.employee.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estudio {


    private EmployeeService employeeService;

    public static void main(String[] str){
        new Estudio();
    }

    public Estudio(){
        initMenu();
    }
    private void initMenu() {
        Employee employee;
        do{
            System.out.println("Email de usuario?");
            Scanner teclado = new Scanner(System.in);
            String email = teclado.nextLine();
            employee = employeeService.getEmployeeByEmail(email);

            if(employee == null){
                System.out.println("El usuario no existe.");
            }
        } while (employee == null);

        if()





    }

}
