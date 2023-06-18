package SetGet;

class Student{
    public String name;

    public String getName(){
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }
}
public class SetGet {
    public static void main(String args[]){
        Student st = new Student();
        st.name = "Mahitha";
        System.out.println(st.name);
    }
}