
package annotationtest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asefn
 */
public class Teacher extends Person{
    private String schoolname;
    private double salary;
    private Student[] students;

    
    
   

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Boshqalmasin
    public Student[] getStudents() {
        return students;
    }
    
     
     public void setStudents(Student[] students) {
        this.students = students;
    }


    
            
           
}
