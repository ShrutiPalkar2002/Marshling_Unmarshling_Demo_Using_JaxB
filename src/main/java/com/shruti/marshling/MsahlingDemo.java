package com.shruti.marshling;

import java.io.File;

import jakarta.xml.bind.*;

import com.shruti.bindings.Address;
import com.shruti.bindings.Person;

public class MsahlingDemo {

	public static void main(String[] args) throws Exception{
		
		Address a1 = new Address();
		
		a1.setCity("Mumbai");
		a1.setState("Maharashtra");
		a1.setCountry("India");
		
		
		Person p1 = new Person();
		
		p1.setId(1);
		p1.setName("Shruti Dinesh Palkar");
		p1.setEmail("shrutipalkar2002@gmail.com");
		p1.setGender("Female");
		p1.setAddress(a1);
		JAXBContext context = JAXBContext.newInstance(Person.class);
		
		
		Marshaller marshller = context.createMarshaller();
		marshller.marshal(p1, new File("person.xml"));
		
		
		System.out.println("done");
		
	}

}
