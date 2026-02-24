package repository;

import model.Student;

public interface IStudentRepository {
    void add_student(Student student);
    void delete_student();
    void update_student();
    void list_student();
}
