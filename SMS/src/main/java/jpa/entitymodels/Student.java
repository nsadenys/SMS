package jpa.entitymodels;

import javax.persistence.*;
import java.util.List;


@Entity(name = "student")
public class Student {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email")
    private String sEmail;

    @Column(name = "name")
    private String sName;


    @Column(name = "password")
    private String sPass;


    @ManyToMany
    @JoinTable(
            name="student_course",
            joinColumns = @JoinColumn(name = "sEmail", referencedColumnName = "email"),
            inverseJoinColumns = @JoinColumn(name = "cId", referencedColumnName = "id")
    )
    private List<Course> sCourses;


    public Student() {
        this.sEmail = "";
        this.sName = "";
        this.sPass = "";
        this.sCourses = null;
    }
// the proper method signature based on the Service 
    public Student(String sEmail, String sName, String sPass, List sCourses) {
        this.sEmail = sEmail;
        this.sName = sName;
        this.sPass = sPass;
        this.sCourses = sCourses;
    }

    public String getsEmail() {
        return sEmail;
    }

    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsPass() {
        return sPass;
    }

    public void setsPass(String sPass) {
        this.sPass = sPass;
    }

    public List<Course> getsCourses() {
        return sCourses;
    }

    public void setsCourses(List sCourses) {
        this.sCourses = sCourses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sEmail='" + sEmail + '\'' +
                ", sName='" + sName + '\'' +
                ", sPass='" + sPass + '\'' +
                ", sCourses=" + sCourses +
                '}';
    }

	public Object getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
