package com.programacion.cliente;

import com.programacion.cliente.BookDTO.BookDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

import java.awt.print.Book;
import java.util.List;
/*
@Path("/books")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
interface ServicioBooksProxy{
    @GET
    List<BookDTO> findAll();

    @GET
    @Path(value= "/{id}")
    BookDTO findById(@PathParam("id") Long id);

    @POST
    Response create(BookDTO obj);

    @PUT
    @Path("/id")
    Response update(@PathParam("id") Long id);

}*/

public class ClienteMainProxy {
    //static final String URL= "http://127.0.0.1:8080";

    public static void main(String[] args) {
        /*ResteasyClientBuilder builder =
                (ResteasyClientBuilder) ResteasyClientBuilder.newBuilder();

        ResteasyClient client = builder.build();

        ServicioBooksProxy servicio = client.target(URL)
                .proxy(ServicioBooksProxy.class); //nos devuelve una implementacion de la interface*/

        var servicio = BookServiceFactory.create();
        //listar todos
        var books = servicio.findAll();
        System.out.println(books);
    }
}
