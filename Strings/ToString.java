package Strings;
public class ToString{
    public static class Student{
        int id;
        String name;
        Student(int Id, String Name){
            id = Id;
            name = Name;
        }
        public String toString(){
            return "id: " + id + " Name: " + name;
        }
    }
    public static void main(String[] args) {
        Student s = new Student(1,"Kiratbir Singh");
        System.out.println(s); 
    }
}