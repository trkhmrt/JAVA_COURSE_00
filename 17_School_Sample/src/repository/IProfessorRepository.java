package repository;

import model.Professor;

import java.util.List;

public interface IProfessorRepository {
    void add_professor(Professor professor);
    void delete_professor(int id);
    void update_professor(int id);
    void list_professor();
}
