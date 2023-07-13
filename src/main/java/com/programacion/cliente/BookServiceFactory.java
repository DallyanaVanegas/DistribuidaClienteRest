package com.programacion.cliente;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;

public class BookServiceFactory {

    static final String URL= "http://127.0.0.1:8080";

    public static ServicioBooksProxy create(){
        ResteasyClientBuilder builder =
                (ResteasyClientBuilder) ResteasyClientBuilder.newBuilder();

        ResteasyClient client = builder.build();

        ServicioBooksProxy servicio = client.target(URL)
                .proxy(ServicioBooksProxy.class); //nos devuelve una implementacion de la interface

        return servicio;
    }
}
