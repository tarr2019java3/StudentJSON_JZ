package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Jan", "Kowalski", 32);
        Student student1 = new Student("Paweł", "Jankowski", 21);
        Student student2 = new Student("Jacek", "Markiewicz", 23);
        Student student3 = new Student("Jakub", "Jurkiewicz", 43);
        Student student4 = new Student("Szymon", "Wiśniewski", 45);
        Student student5 = new Student("Piotr", "Nowak", 25);
        // serializacja - np. obiektu do JSON-a

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("student.json"),student);
            objectMapper.writeValue(new File("student1.json"), student);
            objectMapper.writeValue(new File("student2.json"), student);
            objectMapper.writeValue(new File("student3.json"), student);
            objectMapper.writeValue(new File("student4.json"), student);
            objectMapper.writeValue(new File("student5.json"), student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
