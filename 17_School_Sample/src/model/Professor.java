package model;

import java.util.Date;

public class Professor extends BaseModel {
    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + super.getId() +
                ", name='" + super.getName() + '\'' +
                ", surname='" + super.getSurname() + '\'' +
                ", birthDate=" + super.getBirthDate() +
                "branch='" + branch + '\'' +
                '}';
    }
}
