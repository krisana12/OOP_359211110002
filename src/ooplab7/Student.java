package ooplab7;
//talking about studant?
//1.Studant ID
//2.Name
//3.person ID
//4.Adderss
//Access Control
//1. public
//2. private
//3. protected
public class Student {
    //properties of Student class
    private String id;
    private String name;
    private String pid;
    private String addreess;
    //Construcotor
    //default construtor
    public Student(){}
    //create by own
    public ooplab7(String id, String n, String pid, String a){
        //assing data to class properties
        this.id = id;
        this.name = n;
        this.pid = pid;
        this.addreess = a;
    }
    //grtter and setter methods


    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pid='" + pid + '\'' +
                ", addreess='" + addreess + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getAddreess() {
        return addreess;
    }

    public void setAddreess(String addreess) {
        this.addreess = addreess;
    }
}//calss
