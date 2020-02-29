package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student = new Student("Jan",
                "Kowalski",
                32);
//        Student student1 = new Student("Paweł", "Jankowski", 21); // metoda1
//        Student student2 = new Student("Jacek", "Markiewicz", 23); // metoda 1
//        Student student3 = new Student("Jakub", "Jurkiewicz", 43); // metoda 1
//        Student student4 = new Student("Szymon", "Wiśniewski", 45); // metoda 1
//        Student student5 = new Student("Piotr", "Nowak", 25);
        // serializacja - np. obiektu do JSON-a

        ObjectMapper objectMapper = new ObjectMapper();
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
       studentList.add(student);
       studentList.add(student);


//        try {
//       objectMapper.writeValue(new File("student_lista.json"), studentList);
//
//            objectMapper.writeValue(new File("student.json"),student);
//            objectMapper.writeValue(new File("student1.json"), student); // metoda1
//            objectMapper.writeValue(new File("student2.json"), student);
//            objectMapper.writeValue(new File("student3.json"), student);
//            objectMapper.writeValue(new File("student4.json"), student);
//            objectMapper.writeValue(new File("student5.json"), student);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    JSONUtils jsonUtils = new JSONUtils();
            jsonUtils.writeList("lista.json", studentList);
            jsonUtils.readList("lista.json");
}
}

