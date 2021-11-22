class Student_demo{
    String name;
    public Student_demo(String s){
        name = s;
    }
    public Student_demo(){
        name = "Unknown";
    }
}

class Ans{
    public static void main(String[] args){
        Student_demo s = new Student_demo("xyz");
        Student_demo a = new Student_demo();

        System.out.println(s.name);
        System.out.println(a.name);
    }
}
