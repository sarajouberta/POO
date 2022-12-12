package com.giea.service.client;

import com.giea.dao.client.ClientDao;
import com.giea.dao.client.DefaultClientDao;
import com.giea.model.people.Client;

public class DefaultClientService implements ClientService {

    private ClientDao clientDao = DefaultClientDao.getInstance();

    public void createClient(String name, String surname, int id){
        Client client = new Client();
        client.setName(name);
        client.setLastName(surname);
        client.setId(id);
        clientDao.saveClient(client);
    }
}
