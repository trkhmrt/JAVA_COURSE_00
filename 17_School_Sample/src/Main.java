import model.Professor;
import service.ProfessorService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public Main(){

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProfessorService professorService = new ProfessorService();


        while(true){
            System.out.println("1-Ekle 2-Sil 3-Güncelle 4-Listele");
            int secim = scanner.nextInt();

            if(secim==1){
                Professor professor = new Professor();
                System.out.print("Branş");
                String branch = scanner.next();
                professor.setBranch(branch);
                System.out.print("İsim:");
                String name = scanner.next();
                professor.setName(name);
                System.out.print("Soy isim:");
                String surname = scanner.next();
                professor.setSurname(surname);
                professor.setBirthDate(new Date());

                professorService.add_professor(professor);
            }
            else if(secim==2){
                System.out.print("Silinecek kişinin id değerini giriniz:");
                int id = scanner.nextInt();
                professorService.delete_professor(id);
            }
            else if(secim==3){
                System.out.print("Güncellencek kişinin id değerini giriniz:");
                int id = scanner.nextInt();
                professorService.update_professor(id);
            }
            else if(secim==4){
                professorService.list_professor();
            }







        }




    }


}