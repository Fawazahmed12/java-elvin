class student{
    int id;
    String name;
    student(int id,String name)
    {
        this.id=id;this.name=name;
        System.out.println(id+"\n"+name);
    }
    student(student s)
    {
        id=s.id;
        name=s.name;
       System.out.println(id+"\n"+name);
    }
}
public class constructor {
    public static void main(String[] args)
    {
        student s1=new student(1,"elvin");
        student s2=new student(s1);
    }
}
/*
class calculate
    {
    static int cal(int i)
    {
        return i*i*i;
    }
}
public class constructor{
    public static void main(String[] args)

    {
        calculate ca=new calculate();
        int n=ca.cal(5);
        System.out.println(n);
    }}*/