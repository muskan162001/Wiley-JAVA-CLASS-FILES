interface Person{
    public void getRole(){

    }
}
interface Student extends Person{

}

class Teacher implements Person{

    @Override
    public void getRole() {
        System.out.println("Teaching");
    }

}

class ClassRoom extends Teacher implements Student{
    public void getRole() {
        System.out.println("Classroom Teaching");
    }
}

public class DiamondProblem {
    
}
