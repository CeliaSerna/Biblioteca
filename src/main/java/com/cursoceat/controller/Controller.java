package com.cursoceat.controller;
import java.io.File;


import com.cursoceat.xml.schema.Biblioteca;
import com.cursoceat.xml.schema.Biblioteca.Libros;
import com.cursoceat.xml.schema.ObjectFactory;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class Controller {

	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		escribirXML();
		leerXML();
}	
	public static void escribirXML() throws JAXBException{
		//Biblioteca miBiblioteca= new ObjectFactory().createBiblioteca();
		
		Biblioteca miBiblioteca = new Biblioteca();
		Libros libro = new Libros();
		libro.setId(1);
		libro.setTitulo("Don Quijote de la Mancha");
		libro.setAutor("Miguel de Cervantes");
		libro.setGenero("Novela, Parodia");
		libro.setPaginas(1305);
		libro.setPublicacion("16/01/1605");
		miBiblioteca.getLibros();
		miBiblioteca.getLibros().add(libro);
	
	JAXBContext jaxbContext=JAXBContext.newInstance(Biblioteca.class);
	
	Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	
	jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	jaxbMarshaller.marshal(miBiblioteca, System.out);
	jaxbMarshaller.marshal(miBiblioteca, new File("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\Biblioteca\\registro.xml"));
	
	
	
	
	}
	
	public static void leerXML() throws JAXBException {
		
	File archivo=new File("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\Biblioteca\\biblio.xml");
	
	//creamos el contexto
	JAXBContext jaxbContext = JAXBContext.newInstance(Biblioteca.class);
	//crear objeto para desagrupar
	Unmarshaller jaxUnmarshaller = jaxbContext.createUnmarshaller();
	//leer el archivo utilizando el unmarsheller
	Biblioteca miBiblioteca =(Biblioteca)jaxUnmarshaller.unmarshal(archivo);
		
	for (Libros libro:miBiblioteca.getLibros() ) {
			System.out.println(libro.getId());
			System.out.println(libro.getTitulo());
			System.out.println(libro.getAutor());
			System.out.println(libro.getGenero());
			System.out.println(libro.getPublicacion());
			System.out.println(libro.getPaginas());
			
		}
	
	
	
	
	}
	
	
}
