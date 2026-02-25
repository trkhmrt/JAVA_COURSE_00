package service;

import model.Professor;
import repository.IProfessorRepository;
import util.Lists;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class ProfessorService implements IProfessorRepository {

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add_professor(Professor professor) {

        if(Lists.professorList.isEmpty()){
            professor.setId(1);
        }
        else{
            int id_index = Lists.professorList.getLast().getId();
            professor.setId(id_index+1);
        }

        Lists.professorList.add(professor);
    }

    @Override
    public void delete_professor(int id) {
        try{
            /*
             * Silme işlemlerinde benzersiz bir bilgi alınması gerekir.(İd veya token olabilir.GUID.Eşsiz benzersiz tutulan herhangi bir değer olabilir)
             *
             * */
            Professor professor = Lists.professorList
                    .stream()
                    .filter(prof->prof.getId()==id)
                    .findFirst()
                    .orElseThrow(()->new RuntimeException("Professor bulunamadı"));

            Lists.professorList.remove(professor);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    @Override
    public void update_professor(int id) {
        try{

            Lists.professorList
                    .stream()
                    .filter(prof->prof.getId()==id)
                    .findFirst()
                    .ifPresentOrElse(prof->{
                        System.out.print("Yeni isim");
                        String new_name = scanner.next();
                        prof.setName(new_name);
                    },()->{
                        throw new RuntimeException("Professor bulunamadı");
                    });


            //2.Yöntem
            //int index = Lists.professorList.indexOf(professor);
            //System.out.print("Yeni isim");
            //String new_name = scanner.next();
            //Lists.professorList.get(index).setName(new_name);


            //3.Yöntem
//            for(Professor item:Lists.professorList){
//                if(item.getId()==id){
//                    System.out.print("Yeni isim");
//                    String new_name = scanner.next();
//                    item.setName(new_name);
//                }
//            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void list_professor() {
        Lists.professorList.forEach(System.out::println);
    }
}
