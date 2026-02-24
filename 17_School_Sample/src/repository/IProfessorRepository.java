package repository;

import model.Professor;

import java.util.List;

public interface IProfessorRepository {
    void add_professor(Professor professor);
    void delete_professor();
    void update_professor();
    void list_professor();
}
