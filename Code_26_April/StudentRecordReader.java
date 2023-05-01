package Code_26_April;

import java.util.*;
import java.io.*;
import Codes_25_Aprill.Student;
public class StudentRecordReader {

    DataInputStream dataInput;

    public StudentRecordReader(String inputFile) throws FileNotFoundException{
        dataInput = new DataInputStream(new FileInputStream(inputFile));
    }
    
    public List<Student> readAll() throws IOException{
        List < Student > listStudent = new ArrayList<>();

        try{
            while(true){
                String name = dataInput.readUTF();
                boolean gender = dataInput.readBoolean();
                int age = dataInput.readInt();
                float grade = dataInput.readFloat();

                System.out.println("Name: " + name);
                Student student = new Student(name, gender, age, grade);
                
                listStudent.add(student);    
            }
        } catch (Exception e) {

        }

        dataInput.close();
        return listStudent;
    }

    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Please provide output filename");
            System.exit(0);
        }

        String inputFile = "M:\\wiley java\\data.dat";

        try{
            StudentRecordReader reader = new StudentRecordReader(inputFile);
            List<Student> listOfStudent = reader.readAll();

            for(Student student : listOfStudent){
                System.out.println(student.getName() + "\t");
                System.out.println(student.getGender() + "\t");
                System.out.println(student.getAge() + "\t");
                System.out.println(student.getGrade());
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        
    }
}
