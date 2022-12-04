package learn.digital_workbook.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {

    private int studentId;
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate dob;
    private int heightInInches;
    private Progress progress = new Progress();

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int agentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }
}

