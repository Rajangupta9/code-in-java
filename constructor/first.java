import javax.rmi.ssl.SslRMIClientSocketFactory;

class Student
{
   private int age;
    private String name;
    
    Student(String name , int age)
    {
        this.name= name;
        this.age= age;
    }
    // public void setAge(int age)
    // {

    //     this.age = age;
        
    // }
    public int getAge(){
        return age;
    }
    // public void setName(String name)
    // {
    //     this.name = name;
    // }
    public String getName(){
        return name;
    }

    public void show()
    {
        System.out.println(name + " " + age);
    }
}

public class first{

    public static void main(String[] args) {
        Student obj = new Student("rajan" , 18 );
        // obj.age=18;   this is not part of encapsulation it acsess any one .
        // obj.name="rajan";

        // obj.setAge(18);
        // obj.setName("rajan");
        obj.show();

        Student obj1=new Student("pratyush", 34);

        // obj1.setAge(25);
        // obj1.setName("pratyush");
        obj1.show();

        // int student1Age = obj.getAge();
        // System.out.println(student1Age);
        // String student1name=obj.getName();
        // System.out.println(student1name);

        // int student2Age = obj1.getAge();
        // System.out.println(student1Age);
        // String student2name=obj1.getName();
        // System.out.println(student2name);
    
    }
}