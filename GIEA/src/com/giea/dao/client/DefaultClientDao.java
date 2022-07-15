package com.giea.dao.client;

import com.giea.model.people.Client;

import java.util.ArrayList;
import java.util.List;

public class DefaultClientDao implements ClientDao {

    private static ClientDao instance;

    public static ClientDao getInstance(){
        if(instance == null){
            instance = new DefaultClientDao();
        }
        return instance;
    }


    private List<Client> clients = new ArrayList<>();

    @Override
    public void saveClient(Client client) {
        clients.add(client);
    }
}
