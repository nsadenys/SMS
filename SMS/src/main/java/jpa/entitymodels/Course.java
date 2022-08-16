package jpa.entitymodels;

import javax.persistence.*;


@Entity(name = "course")
public class Course {
    @Id
    private Integer id;

    @Column(name = "name")
    private String cName;

    @Column(name = "instructor")
    private String cInstructorName;

    public Course() {
    }

    public Course(Integer cId, String cName, String cInstructorName) {
        this.id = cId;
        this.cName = cName;
        this.cInstructorName = cInstructorName;
    }
    public void print(){
        System.out.printf("%-5d%-30s%-20s\n", this.id, this.cName, this.cInstructorName);
    }

    public Integer getcId() {
        return id;
    }

    public double setcId(Integer cId) {
        this.id = cId;
        return 0;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcInstructorName() {
        return cInstructorName;
    }

    public void setcInstructorName(String cInstructorName) {
        this.cInstructorName = cInstructorName;
    }

	public Object getStudentPassword() {
		// TODO Auto-generated method stub
		return null;
	}

}
