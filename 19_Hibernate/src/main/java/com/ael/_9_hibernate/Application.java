package com.ael._9_hibernate;

import com.ael._9_hibernate.model.Student;
import com.ael._9_hibernate.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*
    * 1- Uygulama oluşturulcağında öncelikle pom.xml içindeki bağımlılıklar yüklenir.
    *
    * 2- bağımlılıklar yüklendikten sonra application.yaml içindeki uyguluma ayağa kalktığında kullanılacak configurasyonlar ayarlanır.
    *
    *
    *
    * */
    @Bean
    public CommandLineRunner kayit(StudentRepository studentRepository){
        return args -> {

            //Student student = new Student();
//            student.setStudentName("Elanur");
//            student.setEmail("elanur@gmail.com");
//            student.setIdentity_number(1392923923);
//            studentRepository.save(student);

//            Optional<Student> student = studentRepository.findById(10L);
//            //isPresent nesnenin içi dolu?
//            //isEmpty nesnenin içi boş ?
//            if(student.isPresent()){
//                System.out.println(student);
//            }
//            else{
//                System.out.println("Öğrenci bulunamadı");
//            }


             List<Student> students = studentRepository.findAll();

             students.forEach(System.out::println);


        };
    }

}
