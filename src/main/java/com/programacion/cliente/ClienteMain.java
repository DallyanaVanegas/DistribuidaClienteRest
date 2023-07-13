package com.programacion.cliente;

import com.programacion.cliente.BookDTO.BookDTO;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.MediaType;

import java.awt.*;
import java.awt.print.Book;

public class ClienteMain {

    public static void main(String[] args) {

        BookService servicio = new BookService();

        //buscar por id
        BookDTO obj = servicio.findById(Long.valueOf(1));
        System.out.println(obj);

        //listar todos
        var books = servicio.findAll();
        System.out.println(books);

        //insert
        BookDTO newBook = new BookDTO();
        newBook.setAutor("author-111");
        newBook.setIsbn("isbn-111");
        newBook.setPrice(111.0);
        newBook.setTitle("title-111");

        servicio.insert(newBook);

        //completar los demas


    }
}
