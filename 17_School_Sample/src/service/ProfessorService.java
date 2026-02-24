package service;

import model.Professor;
import repository.IProfessorRepository;
import util.Lists;

import java.util.List;

public class ProfessorService implements IProfessorRepository {

    @Override
    public void add_professor(Professor professor) {
        Lists.professorList.add(professor);
    }

    @Override
    public void delete_professor() {

    }

    @Override
    public void update_professor() {

    }

    @Override
    public void list_professor() {

    }
}
