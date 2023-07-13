package com.programacion.cliente;

import com.programacion.cliente.BookDTO.BookDTO;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
@Path("/books")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
//@---(URL) se indica a que url queremos que se use CONFIG
public interface ServicioBooksProxy {

    @GET
    List<BookDTO> findAll();

    @GET
    @Path(value= "/{id}")
    BookDTO findById(@PathParam("id") Long id);

    @POST
    Response create(BookDTO obj);

    @PUT
    @Path("/{id}")
    Response update(@PathParam("id") Long id);

    @DELETE
    @Path("/{id}")
    Response delete(@PathParam("id") Long id);
}
