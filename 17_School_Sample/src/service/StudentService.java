package service;

import model.Student;
import repository.IStudentRepository;
import util.Lists;

public class StudentService implements IStudentRepository {
    @Override
    public void add_student(Student student) {
        Lists.studentList.add(student);
    }

    @Override
    public void delete_student() {

    }

    @Override
    public void update_student() {

    }

    @Override
    public void list_student() {

    }
}
