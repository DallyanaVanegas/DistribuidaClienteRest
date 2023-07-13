package com.programacion.cliente;

import com.programacion.cliente.BookDTO.BookDTO;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

public class BookService {
    static final String URL= "http://127.0.0.1:8080";

    public void insert(BookDTO obj){

        obj.setId(null); //si no se especifica es un actualzar

        Client client  = ClientBuilder.newClient();

        Entity<BookDTO> entity =
                Entity.entity(obj, MediaType.APPLICATION_JSON);

        client.target(URL)
                .path("/books")
                .request()
                .post(entity);
    }
    public List<BookDTO> findAll(){
        Client client  = ClientBuilder.newClient();
        BookDTO[] obj = client.target(URL)
                .path("/books")
                .request(MediaType.APPLICATION_JSON)
                .get(BookDTO[].class);

        return List.of(obj);
    }
    public BookDTO findById(Long id){

        Client client = ClientBuilder.newClient();

        //string
        String obj = client.target(URL)
                .path("books/{id}")
                .resolveTemplate("id",1)
                .request(MediaType.APPLICATION_JSON)
                .get(String.class);

        System.out.println("json => " +obj);

        //objeto
        BookDTO obj2 = client.target(URL)
                .path("books/{id}")
                .resolveTemplate("id",1)
                .request(MediaType.APPLICATION_JSON)
                .get(BookDTO.class);

        return obj2;
    }


}
