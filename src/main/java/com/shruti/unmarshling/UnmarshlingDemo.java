package com.shruti.unmarshling;

import java.io.File;

import com.shruti.bindings.Person;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class UnmarshlingDemo {

		public static void main(String[] args) throws JAXBException {
			
			JAXBContext context = JAXBContext.newInstance(Person.class);
			
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			
			Person p1 = (Person)unmarshaller.unmarshal(new File("person.xml"));
			
			System.out.println(p1);
			
			
			
			
			
			
		}
}
